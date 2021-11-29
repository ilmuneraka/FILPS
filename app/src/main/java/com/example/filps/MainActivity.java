package com.example.filps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btLogin;
    TextView btReg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btLogin = findViewById(R.id.btn_login);
        btReg = findViewById(R.id.bt_signup);
        btLogin.setOnClickListener(this);
        btReg.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btLogin.getId()) {
            Intent intent = new Intent(this, DrawerActivity.class);
            startActivity(intent);
        } else if (v.getId() == btReg.getId()) {
            Intent intent = new Intent(this, SignUpActivity.class);
            startActivity(intent);
        }
    }
}