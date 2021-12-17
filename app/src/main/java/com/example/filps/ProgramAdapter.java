package com.example.filps;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ProgramAdapter extends RecyclerView.Adapter<ProgramAdapter.MyViewHolder>{

    String[] list;

    public ProgramAdapter(String[] list) {
        this.list = list;
    }

    @NonNull
    @Override
    public ProgramAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ProgramAdapter.MyViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.program_adapter,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ProgramAdapter.MyViewHolder holder, int position) {
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
            tes = itemView.findViewById(R.id.nama_program);
        }
    }
}
