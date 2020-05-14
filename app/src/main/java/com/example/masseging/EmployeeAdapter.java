package com.example.masseging;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

public class EmployeeAdapter extends ArrayAdapter {
    public ArrayList<Employees> list ;

    public Context context;
    public int id;
    public ArrayList<Employees> fulllist ;
    public Activity activity;
    int change ;
    public EmployeeAdapter(ArrayList<Employees> list, Context context, Activity activity) {
        super(context, 0);
        this.list = list;
        this.context = context;
        this.activity = activity;
        this.fulllist= new ArrayList<>(list);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int pos) {
        return list.get(pos);
    }

    @Override
    public long getItemId(int pos) {
        return pos;
        //just return 0 if your list items do not have an Id variable.
    }


    @Override
    public Filter getFilter() {
        return itemFilter;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.customlayout, null);
        }

        //Handle TextView and display string from your list
        TextView txname = (TextView) view.findViewById(R.id.txname);
        txname.setText(list.get(position).getEmployee_name());

        //Handle TextView and display string from your list
        TextView txid = (TextView) view.findViewById(R.id.txid);
        txid.setText(Integer.toString(list.get(position).getEmployee_id()));

        //Handle buttons and add onClickListeners
        Button deletebtn = view.findViewById(R.id.btn);


        deletebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                id =position;
                //    Toast.makeText(context, id, Toast.LENGTH_SHORT).show();
                postResult();
                notifyDataSetChanged();
            }
        });


        return view;
    }


    private  Filter itemFilter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            FilterResults results = new FilterResults();
            List<Employees> suggestions = new ArrayList<>();

            if (constraint == null || constraint.length() == 0) {
                suggestions.addAll(fulllist);
            } else {
                String filterPattern = constraint.toString().toLowerCase().trim();
                for (Employees item : list) {
                    if (item.getEmployee_name().toLowerCase().contains(filterPattern)) {
                        suggestions.add(item);
                    }
                }
            }
            results.values = suggestions;
            results.count = suggestions.size();
            return results;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            list.clear();
             list.addAll((List) results.values);
            notifyDataSetChanged();

        }
        @Override

        public CharSequence convertResultToString(Object resultValue) {
            return (resultValue).toString();
        }

    };





/*
from here for post php
 */

    public void postResult() {
        String restUrl = "http://192.168.1.186:84/phpTest/employeeDelete.php";
        if (ContextCompat.checkSelfPermission(context,
                Manifest.permission.INTERNET)
                != PackageManager.PERMISSION_GRANTED) {

            ActivityCompat.requestPermissions(activity,
                    new String[]{Manifest.permission.INTERNET},
                    123);

        } else {
            EmployeeAdapter.SendPostRequest runner = new EmployeeAdapter.SendPostRequest();

            runner.execute(restUrl);
        }

    }

    public String processRequest(String restUrl) throws UnsupportedEncodingException {
        String text = " ";

        String data = URLEncoder.encode("Employee_id", "UTF-8")
                + "=" + URLEncoder.encode(Integer.toString( list.get(id).getEmployee_id()), "UTF-8");
        BufferedReader reader = null;

        // Send data
        try {

            // Defined URL  where to send data
            URL url = new URL(restUrl);

            // Send POST data request


            URLConnection conn = url.openConnection();
            conn.setDoOutput(true);

            OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
            wr.write(data);
            wr.flush();

            // Get the server response

            reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = "";

            // Read Server Response
            while ((line = reader.readLine()) != null) {
                // Append server response in string
                sb.append(line + "\n");
            }


            text = sb.toString();

        } catch (Exception ex) {

        } finally {
            try {

                reader.close();
            } catch (Exception ex) {
            }
        }

        // Show response on activity
        return text;


    }

    class SendPostRequest extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... urls) {

            try {
                return processRequest(urls[0]);
            } catch (UnsupportedEncodingException e) {
                Log.d("error", "there is error here");
                e.printStackTrace();
            }
            return "";

        }

        @Override
        protected void onPostExecute(String result) {

            Toast.makeText(context, result, Toast.LENGTH_SHORT).show();
            list.remove(id);
            fulllist.remove(id);
            notifyDataSetChanged();
        }
    }


}

