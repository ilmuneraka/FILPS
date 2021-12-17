package com.example.filps;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class ProgramActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private ProgramAdapter adapter;
    String[] names = {"GoTo", "Pejuang Muda", "MISB", "Studi Independen"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_program);

        recyclerView = findViewById(R.id.recyclerView);

        adapter = new ProgramAdapter(names);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(ProgramActivity.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);
    }
}