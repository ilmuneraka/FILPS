package com.example.filps;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class FragmentContact extends Fragment {

    String[] names = {"PAPB-A", "PAPB-B", "PAPB-C", "PAPB-D"};

    public FragmentContact(){

    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        return view;
    }
}
