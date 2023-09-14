package com.first.praktikumgithub;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.first.praktikumgithub.adapter.MahasiswaAdapter;
import com.first.praktikumgithub.adapter.MahasiswaView;
import com.first.praktikumgithub.model.mahasiswa;

import java.util.ArrayList;
import java.util.List;

public class cardActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card2);

        RecyclerView RecycleView = findViewById(R.id.rc_item);
        List<mahasiswa> items = new ArrayList<mahasiswa>();


        items.add(new mahasiswa("John wick 1","john.wick@email.com",R.drawable.a));
        items.add(new mahasiswa("John wick 2","john.wick@email.com",R.drawable.a));
        items.add(new mahasiswa("John wick 3","john.wick@email.com",R.drawable.a));
        items.add(new mahasiswa("John wick 4","john.wick@email.com",R.drawable.a));
        items.add(new mahasiswa("John wick 5","john.wick@email.com",R.drawable.a));

    }
}