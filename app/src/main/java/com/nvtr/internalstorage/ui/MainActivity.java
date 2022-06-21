package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nvtr.internalstorage.R;

public class MainActivity extends AppCompatActivity {
    Button btlistp, btlistsv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btlistp = findViewById(R.id.listphong);
        btlistsv = findViewById(R.id.listsv);
        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SvActivity.class);
                startActivity(intent);
            }
        });
        btlistp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, PhongActivity.class);
                startActivity(intent1);
            }
        });
    }
}