package com.HafidzZakiAmrulloh.PBO.Unguided;
import java.util.Scanner;
public class Pertemuan2_0 {
    public static void main(String[] args) {
        String username = "user21102267";
        String password = "password21102267";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Masukkan Password: ");
        String inputPassword = scanner.nextLine();

        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login berhasil silakan masuk");
        } else if (inputUsername.isEmpty() || inputPassword.isEmpty()) {
            System.out.println("Silakan login dengan username dan password yang sah!");
        } else {
            System.out.println("Username dan password Anda salah");
        }
    }
}