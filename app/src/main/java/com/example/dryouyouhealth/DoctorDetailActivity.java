package com.example.dryouyouhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DoctorDetailActivity extends AppCompatActivity {

    private String [][] doctor_details =
            {
                    {"Doctor Name  : Youssef Hmidi", "Hospital Address : El Amen", "Experience : 10 years", "Mobile No : 55724230", "9200"},
                    {"Doctor Name  : Youssef Hmidi", "Hospital Address : El Amen", "Experience : 10 years", "Mobile No : 55724230", "9200"},
                    {"Doctor Name  : Youssef Hmidi", "Hospital Address : El Amen", "Experience : 10 years", "Mobile No : 55724230", "9200"},
                    {"Doctor Name  : Youssef Hmidi", "Hospital Address : El Amen", "Experience : 10 years", "Mobile No : 55724230", "9200"},
                    {"Doctor Name  : Youssef Hmidi", "Hospital Address : El Amen", "Experience : 10 years", "Mobile No : 55724230", "9200"}
            };
    TextView tv;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_doctor_detail);

        tv = findViewById(R.id.textViewDDTitile);
        btn = findViewById(R.id.butttonDDBack);
        Intent it = getIntent();
        String title = it.getStringExtra("title");
        tv.setText(title);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(DoctorDetailActivity.this,FindDoctorActivity.class));
            }
        });
    }
}