/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package com.mycompany.subscribe;

/**
 * Lima kategori utama langganan digital pada SubScribe.
 * Pengguna memilih kategori, lalu mengetik sendiri nama layanannya.
 */
public enum Kategori {
    STREAMING("Streaming & Hiburan", "Netflix, Spotify, YouTube Premium, Disney+ Hotstar, Viu"),
    INTERNET("Internet & Komunikasi", "Wi-Fi, IndiHome, paket data, VPN"),
    CLOUD("Penyimpanan & Cloud", "Google One, iCloud+, Dropbox, OneDrive"),
    PRODUKTIVITAS("Produktivitas & Edukasi", "Microsoft 365, Canva Pro, Grammarly, Duolingo Super, Notion"),
    GAME("Game & Aplikasi", "PlayStation Plus, Xbox Game Pass, Mobile Legends, dll.");

    private final String label;
    private final String contoh;

    Kategori(String label, String contoh) {
        this.label = label;
        this.contoh = contoh;
    }

    public String getLabel() { return label; }
    public String getContoh() { return contoh; }
}