package com.example.app_data_form;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailParcelable extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_parcelable);

        ActionBar actionBar = getSupportActionBar();

        setContentView(R.layout.activity_detail_parcelable);
        TextView nama = (TextView) findViewById(R.id.viewNama);
        TextView nim = (TextView) findViewById(R.id.viewNim);
        TextView tglLahir = (TextView) findViewById(R.id.viewTanggalLahir);
        TextView jenisKelamin = (TextView) findViewById(R.id.viewJenisKelamin);
        TextView jurusan = (TextView) findViewById(R.id.viewJurusan);

        Parcel myParcelable = getIntent().getParcelableExtra("Parcelable");

        nama.setText(myParcelable.getNama());
        nim.setText(myParcelable.getNim());
        tglLahir.setText(myParcelable.getTgllahir());
        jenisKelamin.setText(myParcelable.getJeniskelamin());
        jurusan.setText(myParcelable.getJurusan());
    }
}