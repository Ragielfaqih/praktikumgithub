package com.first.praktikumgithub;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class NegaraActivity2 extends AppCompatActivity implements AdapterView.OnItemClickListener {
    private ListView ltNegara;
    ArrayAdapter<CharSequence> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_negara2);
        ltNegara = findViewById(R.id.lt_negara);

        adapter = ArrayAdapter.createFromResource(this, R.array.data_negara, android.R.layout.simple_list_item_1);
        ltNegara.setAdapter(adapter);
        ltNegara.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        Toast.makeText(this, adapter.getItem(i), Toast.LENGTH_SHORT).show();

    }
}