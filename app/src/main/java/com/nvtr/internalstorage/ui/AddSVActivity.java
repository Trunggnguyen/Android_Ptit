package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nvtr.internalstorage.R;
import com.nvtr.internalstorage.data.FIleHelper;
import com.nvtr.internalstorage.model.Student_B18DCCN672;

import java.util.ArrayList;

public class AddSVActivity extends AppCompatActivity {
    Button btlistp, btlistsv;
    FIleHelper fIleHelper;
    EditText name, dc, ns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sv);
        btlistp = findViewById(R.id.listphong);
        btlistsv = findViewById(R.id.listsv);
        fIleHelper = new FIleHelper();
        name = findViewById(R.id.namesv);
        ns = findViewById(R.id.namsinh);
        dc = findViewById(R.id.diachi);

        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Student_B18DCCN672> arr = new ArrayList<>();
                arr.addAll(fIleHelper.docra(AddSVActivity.this));
                arr.add(new Student_B18DCCN672(arr.size()+1, name.getText().toString(),  dc.getText().toString(), ns.getText().toString()));
                fIleHelper.viet(arr,AddSVActivity.this );
                finish();
            }
        });
    }
}