package com.example.masseging;

import android.content.Intent;
import android.os.Bundle;


import androidx.appcompat.app.AppCompatActivity;

import android.os.AsyncTask;

import android.text.Editable;
import android.text.TextWatcher;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.Toast;


import java.io.BufferedReader;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;


import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class StudentMangment extends AppCompatActivity {
             ListView listView;
    EditText searchbtn;
    StudentAdapter adapter ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student_mangment);
       searchbtn = findViewById(R.id.txtsearch);
        ImageButton back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(StudentMangment.this,MangActivity.class);
                startActivity(i);
            }
        });

        ImageButton MainMenu = findViewById(R.id.MainMenu);

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(StudentMangment.this, NavigationActivity.class);
                startActivity(i);
            }
        });
                                        listView = (ListView) findViewById(R.id.listView);



        getJSON("http://192.168.1.186:84/phpTest/studentView.php");

        searchbtn.addTextChangedListener( new TextWatcher() {

            @Override

            public void beforeTextChanged(CharSequence s, int start, int count, int
                    after) {
            }



            @Override

            public void onTextChanged(CharSequence s, int start, int before, int
                    count) {


                   StudentMangment.this.adapter.getFilter().filter(s);
                   }



            @Override

            public void afterTextChanged(Editable s) {
            }

        });


    }

    private void getJSON(final String urlWebService) {

        class GetJSON extends AsyncTask<Void, Void, String> {
            @Override
            protected void onPreExecute() {
                super.onPreExecute();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);

                Toast.makeText(getApplicationContext(), s, Toast.LENGTH_SHORT).show();
                try {
                    loadIntoListView(s);

                } catch (JSONException e) {

                    e.printStackTrace();
                }

            }

            @Override
            protected String doInBackground(Void... voids) {
                try {
                    URL url = new URL(urlWebService);
                    HttpURLConnection con = (HttpURLConnection) url.openConnection();
                    StringBuilder sb = new StringBuilder();
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(con.getInputStream()));
                    String json;
                    while ((json = bufferedReader.readLine()) != null) {
                        sb.append(json + "\n");

                    }
                    return sb.toString().trim();
                } catch (Exception e) {
                    return null;
                }
            }
        }
        GetJSON getJSON = new GetJSON();
        getJSON.execute();
    }

    private void loadIntoListView(String json) throws JSONException {
        JSONArray jsonArray = new JSONArray(json);
        ArrayList<Students> heroes = new ArrayList<Students>();
        for (int i = 0; i < jsonArray.length(); i++) {
            JSONObject obj = jsonArray.getJSONObject(i);
            heroes.add( new Students());
            heroes.get(i).setStudent_name(obj.getString("name"));
            heroes.get(i).setStudent_id(Integer.parseInt(obj.getString("id")));
        }
            adapter = new StudentAdapter(heroes,this ,this );
        listView.setAdapter(adapter);
    }
}