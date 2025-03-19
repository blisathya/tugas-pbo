/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.kalkulator;

/**
 *
 * @author LENOVO
 */
class Kalkulator {

    // Metode pertama: Menjumlahkan dua angka
    int tambah(int a, int b) {
        return a + b;
    }

    // Metode kedua: Menjumlahkan tiga angka (Overloading)
    int tambah(int a, int b, int c) {
        return a + b + c;
    }

    // Metode ketiga: Menjumlahkan dua angka desimal (Overloading)
    double tambah(double a, double b) {
        return a + b;
    }
}

public class Kalkulator_latihan6 {
    public static void main(String[] args) {
        Kalkulator k = new Kalkulator();

        // Memanggil metode pertama: Menjumlahkan dua angka
        System.out.println("Hasil penjumlahan 5 dan 10: " + k.tambah(5, 10));

        // Memanggil metode kedua: Menjumlahkan tiga angka
        System.out.println("Hasil penjumlahan 5, 10, dan 15: " + k.tambah(5, 10, 15));

        // Memanggil metode ketiga: Menjumlahkan dua angka desimal
        System.out.println("Hasil penjumlahan 5.5 dan 2.5: " + k.tambah(5.5, 2.5));
    }
}