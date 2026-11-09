/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.subscribe;

/**
 * Interface Pengingat: menghitung sisa hari menuju tagihan
 * dan menentukan warna peringatan pada tabel.
 */
public interface Pengingat {
    int hitungSisaHari();

    /** @return "MERAH", "KUNING", atau "HIJAU" */
    String tentukanWarna();
}