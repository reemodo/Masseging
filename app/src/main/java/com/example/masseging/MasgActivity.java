package com.example.masseging;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MasgActivity extends AppCompatActivity {
    ImageButton back ;
    CardView message;
    ListView listView;
    Button send;
    TextView text ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masg);

        send= findViewById(R.id.send);

         back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent    i = new Intent(MasgActivity.this,MainActivity.class);
                startActivity(i);
            }
        });
        ImageButton MainMenu = findViewById(R.id.MainMenu);

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MasgActivity.this, NavigationActivity.class);
                startActivity(i);
            }
        });




            listView = (ListView) findViewById(R.id.listview);
            // Toast.makeText(StudentMangment.this, "remo ", Toast.LENGTH_SHORT).show();

            getJSON("http://192.168.1.186:84/phpTest/masg.php");
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
            String[] heroes = new String[jsonArray.length()];
            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject obj = jsonArray.getJSONObject(i);
                heroes[i] = obj.getString("masg");
            }
            ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, heroes);
            listView.setAdapter(arrayAdapter);

    }

}
