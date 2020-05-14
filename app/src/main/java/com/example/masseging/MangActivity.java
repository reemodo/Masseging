package com.example.masseging;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MangActivity extends  AppCompatActivity  implements View.OnClickListener{
    CardView students , employees ,rides;
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mang);
        ImageButton back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MangActivity.this,MainActivity.class);
                  startActivity(i);
            }
        });
        ImageButton MainMenu = findViewById(R.id.MainMenu);

        MainMenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent i = new Intent(MangActivity.this, NavigationActivity.class);
                startActivity(i);
            }
        });

        students =(CardView) findViewById(R.id.students);
        employees = findViewById(R.id.employees);
        rides = findViewById(R.id.rides);
        students.setOnClickListener(this);
        employees.setOnClickListener(this);
        rides.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        //setContentView(R.layout.activity_mang);
        Intent i ;

        switch (view.getId()) {
            case R.id.students  : i= new Intent (MangActivity.this,StudentMangment.class);startActivity(i); break;
            case R.id.employees  : i= new Intent (MangActivity.this,EmployeeMangment.class); startActivity(i);break;
            case R.id.rides  : i= new Intent (MangActivity.this,RidesMangment.class); startActivity(i);break;
            default: break;
        }
    }
}
