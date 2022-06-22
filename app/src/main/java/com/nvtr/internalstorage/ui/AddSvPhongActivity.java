package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nvtr.internalstorage.R;
import com.nvtr.internalstorage.data.FIleHelper;
import com.nvtr.internalstorage.model.ListStudent_B18DCCN672;
import com.nvtr.internalstorage.model.Student_B18DCCN672;

import java.util.ArrayList;

public class AddSvPhongActivity extends AppCompatActivity {

    Button btlistp, btlistsv;
    FIleHelper fIleHelper;
    EditText name, dc, ns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_sv_phong);
        btlistp = findViewById(R.id.listphong);
        btlistsv = findViewById(R.id.listsv);
        fIleHelper = new FIleHelper();
        name = findViewById(R.id.masv);
        ns = findViewById(R.id.map);
        dc = findViewById(R.id.namhoc);

        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<ListStudent_B18DCCN672> arr = new ArrayList<>();
                arr.addAll(fIleHelper.docra(AddSvPhongActivity.this));
                arr.add(new ListStudent_B18DCCN672(arr.size()+1, Integer.parseInt(name.getText().toString()),  Integer.parseInt(dc.getText().toString()), Integer.parseInt(ns.getText().toString())));
                fIleHelper.viet(arr,AddSvPhongActivity.this );
                finish();
            }
        });
    }
}