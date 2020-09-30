package com.example.app_data_form;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    TextView name, nim, born, sexGroup, jurusan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        name = (TextView) findViewById(R.id.viewNama);
        nim = (TextView) findViewById(R.id.viewNim);
        born = (TextView) findViewById(R.id.viewTanggalLahir);
        sexGroup = (TextView) findViewById(R.id.viewJenisKelamin);
        jurusan = (TextView) findViewById(R.id.viewJurusan);

        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();
        String nama = bundle.getString("data1");
        String nonim = bundle.getString("data2");
        String lahir = bundle.getString("data3");
        String jk = bundle.getString("data4");
        String jurus = bundle.getString("data5");

        name.setText(nama);
        nim.setText(nonim);
        born.setText(lahir);
        sexGroup.setText(jk);
        jurusan.setText(jurus);
    }
}