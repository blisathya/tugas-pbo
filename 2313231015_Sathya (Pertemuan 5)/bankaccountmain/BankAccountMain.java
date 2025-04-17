/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bankaccountmain;

/**
 *
 * @author LENOVO
 */
class BankAccount {
    private double saldo;  // Tidak bisa diakses langsung

    public BankAccount(double saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Getter
    public double getSaldo() {
        return saldo;
    }

    // Setter dengan validasi
    public void setSaldo(double jumlah) {
        if (jumlah >= 0) {
            this.saldo = jumlah;
        } else {
            System.out.println("Saldo tidak bisa negatif!");
        }
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        // Membuat objek BankAccount
        BankAccount akun = new BankAccount(1000);
        
        // Menggunakan getter
        System.out.println("Saldo awal: " + akun.getSaldo());
        
        // Menggunakan setter
        akun.setSaldo(1500);
        System.out.println("Saldo setelah diubah: " + akun.getSaldo());
        
        // Coba set nilai negatif
        akun.setSaldo(-500);  // Akan menampilkan pesan error
    }
}
