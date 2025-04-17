/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simplecalculator;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String lanjut;
        
        do {
            System.out.println("\nKalkulator Sederhana");
            System.out.println("---------------------");
            
            // Input angka pertama
            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            
            // Input operator
            System.out.print("Masukkan operator (+, -, *, /, %): ");
            char operator = scanner.next().charAt(0);
            
            // Input angka kedua
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();
            
            double hasil = 0;
            boolean operatorValid = true;
            
            // Proses perhitungan
            switch (operator) {
                case '+':
                    hasil = angka1 + angka2;
                    break;
                case '-':
                    hasil = angka1 - angka2;
                    break;
                case '*':
                    hasil = angka1 * angka2;
                    break;
                case '/':
                    if (angka2 != 0) {
                        hasil = angka1 / angka2;
                    } else {
                        System.out.println("Error: Pembagian dengan nol!");
                        operatorValid = false;
                    }
                    break;
                case '%':
                    hasil = angka1 % angka2;
                    break;
                default:
                    System.out.println("Error: Operator tidak valid!");
                    operatorValid = false;
            }
            
            // Tampilkan hasil jika operator valid
            if (operatorValid) {
                System.out.println("Hasil: " + angka1 + " " + operator + " " + angka2 + " = " + hasil);
            }
            
            // Tanya apakah ingin lanjut
            System.out.print("\nHitung lagi? (y/n): ");
            lanjut = scanner.next();
            
        } while (lanjut.equalsIgnoreCase("y"));
        
        System.out.println("Terima kasih telah menggunakan kalkulator ini!");
        scanner.close();
    }
}