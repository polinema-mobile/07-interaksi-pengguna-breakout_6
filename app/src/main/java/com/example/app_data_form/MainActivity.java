package com.example.app_data_form;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {
    DatePickerDialog picker;
    private RadioGroup sexGroup;
    private RadioButton jk;
    EditText born, name, nim;
    Spinner jurusan;
    Calendar calendar;
    Button simpan, parcel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        born= (EditText) findViewById(R.id.editTanggalLahir);
        born.setInputType(InputType.TYPE_NULL);
        name= (EditText) findViewById(R.id.editNama);
        nim= (EditText) findViewById(R.id.editNim);
        sexGroup = findViewById(R.id.radioGroup);
        jurusan =(Spinner) findViewById(R.id.spinnerJurusan);
        simpan = (Button) findViewById(R.id.simpan);
        parcel = (Button) findViewById(R.id.simpanPar);



        born.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                born.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int select = sexGroup.getCheckedRadioButtonId();
                jk = (RadioButton)findViewById(select);
                Intent intent = new Intent(MainActivity.this, DetailActivity.class);
                Bundle bundle = new Bundle();
                intent.putExtra("data1", name.getText().toString());
                intent.putExtra("data2", nim.getText().toString());
                intent.putExtra("data3", born.getText().toString());
                intent.putExtra("data4", jk.getText().toString());
                intent.putExtra("data5", jurusan.getSelectedItem().toString());
                startActivity(intent);
            }
        });

        parcel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int select = sexGroup.getCheckedRadioButtonId();
                jk = (RadioButton)findViewById(select);

                Parcel parcel = new Parcel(name.getText().toString(), nim.getText().toString(), born.getText().toString(), jk.getText().toString(), jurusan.getSelectedItem().toString());
                Intent intent = new Intent(MainActivity.this, DetailParcelable.class);
                intent.putExtra("Parcelable", parcel);
                startActivity(intent);
            }
        });

    }
}