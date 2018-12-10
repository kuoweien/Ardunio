package com.fju.miia.ardunio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText UsernameEt, NumberEt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        UsernameEt = (EditText) findViewById(R.id.ed_userid);
        NumberEt = (EditText) findViewById(R.id.ed_number);
    }
    public void OnLogin(View view){
        String username = UsernameEt.getText().toString();
        String number = NumberEt.getText().toString();
        String type = "login";

        Backgroundworker backgroundworker = new Backgroundworker(this);
        backgroundworker.execute(type, username, number);
    }



}
