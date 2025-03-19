/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.latihan1;

/**
 *
 * @author LENOVO
 */

// Abstract class Kendaraan sebagai base class untuk semua jenis kendaraan
abstract class Kendaraan {
    protected String nama;       // Nama kendaraan
    protected int jumlahRoda;   // Jumlah roda kendaraan

    // Constructor untuk inisialisasi nama dan jumlah roda
    public Kendaraan(String nama, int jumlahRoda) {
        this.nama = nama;
        this.jumlahRoda = jumlahRoda;
    }

    // Abstract method yang harus diimplementasikan oleh subclass
    public abstract void bergerak();

    // Method untuk menampilkan informasi kendaraan
    public void info() {
        System.out.println(nama + " memiliki " + jumlahRoda + " roda.");
    }
}

// Class Mobil yang merupakan turunan dari Kendaraan
class Mobil extends Kendaraan {
    // Constructor untuk inisialisasi nama dan jumlah roda
    public Mobil(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    // Implementasi method bergerak untuk Mobil
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Class SepedaMotor yang merupakan turunan dari Kendaraan
class SepedaMotor extends Kendaraan {
    // Constructor untuk inisialisasi nama dan jumlah roda
    public SepedaMotor(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    // Implementasi method bergerak untuk SepedaMotor
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan mesin bensin.");
    }
}

// Interface KendaraanListrik untuk kendaraan yang dapat diisi daya
interface KendaraanListrik {
    void isiDaya();  // Method untuk mengisi daya
}

// Class MobilListrik yang merupakan turunan dari Mobil dan mengimplementasikan KendaraanListrik
class MobilListrik extends Mobil implements KendaraanListrik {
    // Constructor untuk inisialisasi nama dan jumlah roda
    public MobilListrik(String nama, int jumlahRoda) {
        super(nama, jumlahRoda);
    }

    // Implementasi method bergerak untuk MobilListrik
    @Override
    public void bergerak() {
        System.out.println(nama + " bergerak dengan motor listrik.");
    }

    // Implementasi method isiDaya dari interface KendaraanListrik
    @Override
    public void isiDaya() {
        System.out.println(nama + " sedang diisi daya.");
    }
}

// Class utama untuk menjalankan program
public class Latihan1 {
    public static void main(String[] args) {
        // Membuat objek Mobil dan memanggil method info dan bergerak
        Kendaraan toyota = new Mobil("Toyota", 4);
        toyota.info();
        toyota.bergerak();

        // Membuat objek SepedaMotor dan memanggil method info dan bergerak
        Kendaraan honda = new SepedaMotor("Honda", 2);
        honda.info();
        honda.bergerak();

        // Membuat objek MobilListrik dan memanggil method info, bergerak, dan isiDaya
        MobilListrik tesla = new MobilListrik("Tesla Model 3", 4);
        tesla.info();
        tesla.bergerak();
        tesla.isiDaya();
    }
}