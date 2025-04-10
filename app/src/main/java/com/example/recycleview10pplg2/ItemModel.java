package com.example.recycleview10pplg2;

public class ItemModel {
    private String judul;
    private String deskripsi;
    private int imageResId;

    public ItemModel(String judul, String deskripsi, int imageResId) {
        this.judul = judul;
        this.deskripsi = deskripsi;
        this.imageResId = imageResId;
    }

    public String getJudul() {
        return judul;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public int getImageResId() {
        return imageResId;
    }
}
