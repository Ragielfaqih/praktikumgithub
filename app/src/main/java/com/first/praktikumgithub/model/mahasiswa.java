package com.first.praktikumgithub.model;


public class mahasiswa {
    private String nama;
    private String nim;
    private String nohp;
    int img;

    public mahasiswa(String nama, String nim, String nohp, int img) {
        this.nama = nama;
        this.nim = nim;
        this.nohp = nohp;
        this.img = img;
    }

    public mahasiswa(String nama, String nim, int a) {
    }

    // Setter untuk nama
    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter untuk nama
    public String getNama() {
        return nama;
    }

    // Setter untuk nim
    public void setNim(String nim) {
        this.nim = nim;
    }

    // Getter untuk nim
    public String getNim() {
        return nim;
    }

    // Setter untuk nohp
    public void setNohp(String nohp) {
        this.nohp = nohp;
    }

    // Getter untuk nohp
    public String getNohp() {
        return nohp;
    }

    public void setImg(Integer img) {
        this.img = img;
    }

    // Getter untuk nohp
    public Integer getImg() {
        return img;
    }
}

