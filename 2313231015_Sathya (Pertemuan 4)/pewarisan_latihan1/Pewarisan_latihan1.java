/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pewaris_latihan1;

/**
 *
 * @author LENOVO
 */
// Kelas induk (superclass)
class Hewan {
    String nama;

    void makan() {
        System.out.println(nama + " sedang makan.");
    }
}

// Kelas anak (subclass) yang mewarisi dari Hewan
class Kucing extends Hewan {
    void suara() {
        System.out.println(nama + " mengeong: Meow!");
    }
}

// Main class untuk menjalankan program
public class Pewarisan_latihan1 {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing();
        kucing1.nama = "Toya";
        
        kucing1.makan(); // Memanggil metode dari superclass
        kucing1.suara(); // Memanggil metode dari subclass
    }
}