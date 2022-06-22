package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nvtr.internalstorage.R;
import com.nvtr.internalstorage.data.FIleHelper;
import com.nvtr.internalstorage.model.ListStudent_B18DCCN672;
import com.nvtr.internalstorage.model.Student_B18DCCN672;

import java.util.ArrayList;

public class SvPhongActivity extends AppCompatActivity {

    Button btlistp, btlistsv;
    SVAdapter setAdapter;
    RecyclerView recyclerView;
    ArrayList<ListStudent_B18DCCN672> listitem = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sv_phong);
        btlistsv = findViewById(R.id.listsv);
        recyclerView = findViewById(R.id.recyclerView);
        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SvPhongActivity.this, AddSvPhongActivity.class);
                startActivity(intent);
            }
        });
//        listitem = new ArrayList<>();
//        listitem.addAll(FIleHelper.docra(SvActivity.this));
//        setAdapter = new SVAdapter(listitem,this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(setAdapter);

    }

    @Override
    protected void onStart() {
        super.onStart();
//        listitem = new ArrayList<>();
//        listitem.addAll(FIleHelper.docra(SvActivity.this));
//        setAdapter = new SVAdapter(listitem,this);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));
//        recyclerView.setAdapter(setAdapter);
    }
}