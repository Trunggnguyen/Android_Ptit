package com.nvtr.internalstorage.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.nvtr.internalstorage.R;
import com.nvtr.internalstorage.data.FIleHelper;
import com.nvtr.internalstorage.model.Class_B18DCCN672;
import com.nvtr.internalstorage.model.Student_B18DCCN672;

import java.util.ArrayList;

public class AddPhong_Activity extends AppCompatActivity {
    Button btlistp, btlistsv;
    FIleHelper fIleHelper;
    EditText name, dc, ns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_phong);
        btlistsv = findViewById(R.id.listsv);
        fIleHelper = new FIleHelper();
        name = findViewById(R.id.name);
        ns = findViewById(R.id.loai);

        btlistsv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ArrayList<Class_B18DCCN672> arr = new ArrayList<>();
                arr.addAll(fIleHelper.docraphonghoc(AddPhong_Activity.this));
                arr.add(new Class_B18DCCN672(arr.size()+1, name.getText().toString(),  ns.getText().toString()));
                fIleHelper.vietvaophonghoc(arr,AddPhong_Activity.this );
                finish();
            }
        });
    }
}