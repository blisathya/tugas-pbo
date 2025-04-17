/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.namamahasiswa;

/**
 *
 * @author LENOVO
 */
class Mahasiswa {
    private String nama;  // Tidak bisa diakses langsung dari luar kelas

    // Constructor
    public Mahasiswa(String nama) {
        this.nama = nama;
    }

    // Getter untuk mengakses nama
    public String getNama() {
        return nama;
    }
}

public class NamaMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs = new Mahasiswa("Adi");
        
        // System.out.println(mhs.nama);  // ❌ Error: nama bersifat private
        System.out.println(mhs.getNama());  // ✅ Akses melalui metode getter
    }
}
