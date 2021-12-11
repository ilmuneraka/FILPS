package com.example.filps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class JadwalAdapter extends RecyclerView.Adapter<JadwalAdapter.MyViewHolder> {

    String[] list;

    public JadwalAdapter(String[] list) {
        this.list = list;
    }

    @NonNull
    @Override
    public JadwalAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new JadwalAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.jadwal_adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull JadwalAdapter.MyViewHolder holder, int position) {
        holder.tes.setText(list[position]);
    }

    @Override
    public int getItemCount() {
        return list.length;
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView tes;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tes = itemView.findViewById(R.id.nama_matkul);
        }
    }
}
