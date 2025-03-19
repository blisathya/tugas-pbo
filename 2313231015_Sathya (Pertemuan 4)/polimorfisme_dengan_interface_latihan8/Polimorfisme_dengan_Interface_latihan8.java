/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.polimorfisme_dengan_interface_latihan8;

/**
 *
 * @author LENOVO
 */
// Interface Kendaraan
interface Kendaraan {
    void berjalan(); // Method abstract untuk menggambarkan cara kendaraan berjalan
}

// Implementasi pertama: Mobil
class Mobil implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Mobil berjalan dengan roda 4.");
    }
}

// Implementasi kedua: Motor
class Motor implements Kendaraan {
    @Override
    public void berjalan() {
        System.out.println("Motor berjalan dengan roda 2.");
    }
}

// Main class
public class Polimorfisme_dengan_Interface_latihan8 {
    public static void main(String[] args) {
        // Membuat objek Mobil dan Motor dengan referensi interface Kendaraan
        Kendaraan kendaraan1 = new Mobil();
        Kendaraan kendaraan2 = new Motor();

        // Memanggil method berjalan() dari objek Mobil dan Motor
        kendaraan1.berjalan(); // Output: Mobil berjalan dengan roda 4.
        kendaraan2.berjalan(); // Output: Motor berjalan dengan roda 2.
    }
}