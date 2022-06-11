package com.example.finalprojectmovieapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {

    private TextView textsignin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        textsignin = (TextView) findViewById(R.id.textsignin);
        textsignin.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openlogin();
            }
        });

    }
    public void openlogin(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}