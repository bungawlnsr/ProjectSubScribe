/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.subscribe;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * Superclass abstrak untuk semua jenis langganan.
 * Semua atribut private (encapsulation) dan diakses lewat getter/setter.
 */
public abstract class Langganan implements Pengingat {
    private String nama;
    private Kategori kategori;
    private double harga;
    private LocalDate tanggalTagihan;
    private boolean aktif;

    public Langganan(String nama, Kategori kategori, double harga, LocalDate tanggalTagihan) {
        setNama(nama);
        setKategori(kategori);
        setHarga(harga);
        setTanggalTagihan(tanggalTagihan);
        this.aktif = true;
    }

    // ---------- Getter ----------
    public String getNama() { return nama; }
    public Kategori getKategori() { return kategori; }
    public double getHarga() { return harga; }
    public LocalDate getTanggalTagihan() { return tanggalTagihan; }
    public boolean isAktif() { return aktif; }

    // ---------- Setter (dengan validasi) ----------
    public void setNama(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            throw new IllegalArgumentException("Nama layanan tidak boleh kosong.");
        }
        this.nama = nama.trim();
    }

    public void setKategori(Kategori kategori) {
        if (kategori == null) {
            throw new IllegalArgumentException("Kategori tidak boleh kosong.");
        }
        this.kategori = kategori;
    }

    public void setHarga(double harga) {
        if (harga <= 0) {
            throw new IllegalArgumentException("Harga harus berupa angka positif.");
        }
        this.harga = harga;
    }

    public void setTanggalTagihan(LocalDate tanggalTagihan) {
        if (tanggalTagihan == null) {
            throw new IllegalArgumentException("Tanggal tagihan tidak boleh kosong.");
        }
        this.tanggalTagihan = tanggalTagihan;
    }

    public void setAktif(boolean aktif) { this.aktif = aktif; }

    // ---------- Method abstrak: diimplementasikan subclass (polymorphism) ----------
    public abstract double hitungBiayaBulanan();
    public abstract double hitungBiayaTahunan();
    public abstract String getSiklus();

    // ---------- Implementasi interface Pengingat ----------
    @Override
    public int hitungSisaHari() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), tanggalTagihan);
    }

    @Override
    public String tentukanWarna() {
        int sisa = hitungSisaHari();
        if (sisa <= 3) return "MERAH";
        if (sisa <= 7) return "KUNING";
        return "HIJAU";
    }
}