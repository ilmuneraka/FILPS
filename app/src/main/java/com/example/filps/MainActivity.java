package com.example.filps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btn_login);
        btLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btLogin.getId()) {
            Intent intent = new Intent(this, DrawerActivity.class);
            startActivity(intent);
        }
    }
}