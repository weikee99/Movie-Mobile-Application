package com.example.finalprojectmovieapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class login extends AppCompatActivity {

    private TextView textsignup, textforgotpassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        textsignup = (TextView) findViewById(R.id.textsignup);
        textsignup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                opensignup();
            }
        });

        textforgotpassword = (TextView)  findViewById(R.id.textforgotpassword);
        textforgotpassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openforgot_password();
            }
        });
    }

    public void opensignup(){
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }

    public void openforgot_password(){
        Intent intent = new Intent(this, forgot_password.class);
        startActivity(intent);
    }
}