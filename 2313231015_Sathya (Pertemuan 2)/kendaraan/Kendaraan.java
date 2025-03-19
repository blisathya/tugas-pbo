/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kendaraan;

/**
 *
 * @author LENOVO
 */
// File: Kendaraan.java
public class Kendaraan {
    // Atribut
    private String merk;
    private String tipe;
    private int kecepatan;

    // Konstruktor
    public Kendaraan(String merk, String tipe, int kecepatan) {
        this.merk = merk;
        this.tipe = tipe;
        this.kecepatan = kecepatan;
    }

    // Metode untuk menampilkan informasi kendaraan
    public void tampilkanInfo() {
        System.out.println("Merk: " + merk + ", Tipe: " + tipe + ", Kecepatan: " + kecepatan + " km/jam");
    }

    // Metode untuk menambah kecepatan
    public void tambahKecepatan(int km) {
        kecepatan += km;
        System.out.println(merk + " menambah kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk mengurangi kecepatan
    public void kurangiKecepatan(int km) {
        kecepatan -= km;
        if (kecepatan < 0) {
            kecepatan = 0; // Kecepatan tidak boleh kurang dari 0
        }
        System.out.println(merk + " mengurangi kecepatan menjadi " + kecepatan + " km/jam.");
    }

    // Metode untuk menghentikan kendaraan
    public void berhenti() {
        kecepatan = 0;
        System.out.println("Kendaraan telah berhenti.");
    }

    // Main class untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan toyota = new Kendaraan("Toyota", "Mobil", 60);
        Kendaraan yamaha = new Kendaraan("Yamaha", "Motor", 40);

        // Menampilkan informasi awal
        toyota.tampilkanInfo();
        toyota.tambahKecepatan(20); // Menambah kecepatan Toyota
        toyota.kurangiKecepatan(30); // Mengurangi kecepatan Toyota
        toyota.berhenti(); // Menghentikan Toyota
        toyota.tampilkanInfo(); // Menampilkan info setelah berhenti

        System.out.println(); // Pemisah output

        yamaha.tampilkanInfo();
        yamaha.tambahKecepatan(30); // Menambah kecepatan Yamaha
        yamaha.kurangiKecepatan(40); // Mengurangi kecepatan Yamaha
        yamaha.berhenti(); // Menghentikan Yamaha
        yamaha.tampilkanInfo(); // Menampilkan info setelah berhenti
    }
}