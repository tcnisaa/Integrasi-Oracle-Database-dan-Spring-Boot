// Mahasiswa.java
package com.example.model;

public class Mahasiswa {
    // ! Properties sesuai dengan tabel Mahasiswa
    private String nim;
    private String nama;
    private String angkatan;
    private String gender;
    
    // ! Setter dan Getter Properties
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAngkatan() {
        return angkatan;
    }

    public void setAngkatan(String angkatan) {
        this.angkatan = angkatan;
    }
}
