package com.example.filps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ProfilActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnEdit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        btnEdit = findViewById(R.id.btn_edit);
        btnEdit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == btnEdit.getId()) {
            Intent intent = new Intent(this, ProfilEditActivity.class);
            startActivity(intent);
        }
    }
}