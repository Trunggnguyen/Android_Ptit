package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nvtr.internalstorage.R;

public class PhongActivity extends AppCompatActivity {
    Button btlistp, btlistsv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phong);
        btlistsv = findViewById(R.id.listsv);
        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PhongActivity.this, AddPhong_Activity.class);
                startActivity(intent);
            }
        });
    }
}