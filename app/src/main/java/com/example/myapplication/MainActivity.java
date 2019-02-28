package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    DatabaseManager dbm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
dbm=new DatabaseManager(this);



        Button btn=(Button)findViewById(R.id.btn);

       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {


           }
       });

    }
}
