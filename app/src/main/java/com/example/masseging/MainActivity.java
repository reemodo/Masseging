package com.example.masseging;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import android.view.LayoutInflater;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.view.ViewGroup;

import com.example.masseging.ui.home.HomeViewModel;

public class MainActivity extends AppCompatActivity  implements View.OnClickListener {
    CardView mang , masg , mapView;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mang =(CardView) findViewById(R.id.mang);
        masg = findViewById(R.id.masg);
        //mapView = findViewById(R.id.mapview);
        mang.setOnClickListener(this);
        masg.setOnClickListener(this);


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        //setContentView(R.layout.activity_mang);
        Intent i ;

        switch (view.getId()) {
            case R.id.mang  : i= new Intent (this,MangActivity.class);startActivity(i); break;
            case R.id.masg  : i= new Intent (this,MasgActivity.class); startActivity(i);break;
            case R.layout.activity_mang  : i= new Intent (this,MangActivity.class); startActivity(i);break;
            default: break;
       }
    }



}
