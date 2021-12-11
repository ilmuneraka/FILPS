package com.example.filps.jadwal;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.filps.JadwalAdapter;
import com.example.filps.MatkulTerpilihAdapter;
import com.example.filps.R;

public class FragmentSenin extends Fragment {

    String[] names = {"PAPB-A", "PAPB-B", "PAPB-C", "PAPB-D"};

    public FragmentSenin() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_senin, container, false);

        RecyclerView recyclerView=view.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        recyclerView.setAdapter(new JadwalAdapter(names));

        return view;
    }
}
