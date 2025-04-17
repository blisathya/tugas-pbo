/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loginsystem;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        // Informasi login yang benar
        final String USERNAME_BENAR = "admin";
        final String PASSWORD_BENAR = "password123";
        
        // Batas maksimal percobaan login
        final int BATAS_PERCOBAAN = 3;
        
        Scanner scanner = new Scanner(System.in);
        int percobaan = 0;
        boolean loginBerhasil = false;
        
        System.out.println("=== Sistem Login ===");
        
        while (percobaan < BATAS_PERCOBAAN && !loginBerhasil) {
            System.out.print("Username: ");
            String username = scanner.nextLine();
            
            System.out.print("Password: ");
            String password = scanner.nextLine();
            
            if (username.equals(USERNAME_BENAR) && password.equals(PASSWORD_BENAR)) {
                loginBerhasil = true;
                System.out.println("Login berhasil! Selamat datang, " + username + ".");
            } else {
                percobaan++;
                int sisaPercobaan = BATAS_PERCOBAAN - percobaan;
                
                System.out.println("Username atau password salah!");
                
                if (sisaPercobaan > 0) {
                    System.out.println("Anda memiliki " + sisaPercobaan + " percobaan lagi.");
                } else {
                    System.out.println("Anda telah melebihi batas percobaan login.");
                    System.out.println("Akun terkunci. Silakan hubungi administrator.");
                }
            }
        }
        
        scanner.close();
    }
}
