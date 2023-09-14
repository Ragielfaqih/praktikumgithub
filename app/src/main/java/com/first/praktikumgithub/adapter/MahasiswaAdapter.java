package com.first.praktikumgithub.adapter;
import com.first.praktikumgithub.model.mahasiswa;

import android.content.ClipData;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.first.praktikumgithub.R;

import java.util.List;

public class MahasiswaAdapter extends RecyclerView.Adapter<MahasiswaView> {
    Context context;
     List<mahasiswa> items;

    public MahasiswaAdapter(Context context, List<mahasiswa> items) {
        this.context = context;
        this.items = items;
    }

    @NonNull
    @Override
    public MahasiswaView onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new MahasiswaView(LayoutInflater.from(context).inflate(R.layout.activity_card2,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull MahasiswaView holder, int position) {
        holder.txtnama.setText(items.get(position).getNama());
        holder.txtnim.setText(items.get(position).getNim());
        holder.txtnohp.setText(items.get(position).getNohp());
        holder.txtimg.setImageResource(items.get(position).getImg());

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
