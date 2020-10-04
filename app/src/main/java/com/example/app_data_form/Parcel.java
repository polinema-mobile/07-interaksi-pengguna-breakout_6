package com.example.app_data_form;

import android.os.Parcelable;

public class Parcel implements Parcelable {
    String nama;
    String nim;
    String lahir;
    String jk;
    String jurusan;

    protected Parcel(android.os.Parcel in) {
        this.nama = in.readString();
        this.nim = in.readString();
        this.lahir = in.readString();
        this.jk = in.readString();
        this.jurusan = in.readString();
    }

    public Parcel(String nama, String nim, String lahir, String jk, String jurusan){
        this.nama = nama;
        this.nim = nim;
        this.lahir = lahir;
        this.jk = jk;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getTgllahir() {
        return lahir;
    }

    public void setTgllahir(String lahir) {
        this.lahir = lahir;
    }

    public String getJeniskelamin() {
        return jk;
    }

    public void setJenisKelamin(String jk) {
        this.jk = jk;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeString(this.nama);
        dest.writeString(this.nim);
        dest.writeString(this.lahir);
        dest.writeString(this.jk);
        dest.writeString(this.jurusan);
    }

    public static final Creator<Parcel> CREATOR = new Creator<Parcel>() {
        @Override
        public Parcel createFromParcel(android.os.Parcel source) {
            return new Parcel(source);
        }

        @Override
        public Parcel[] newArray(int size) {
            return new Parcel[size];
        }
    };
}
