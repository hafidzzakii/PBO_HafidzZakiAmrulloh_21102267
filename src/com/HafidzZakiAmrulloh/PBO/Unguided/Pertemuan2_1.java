package com.HafidzZakiAmrulloh.PBO.Unguided;
import java.util.Scanner;
public class Pertemuan2_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input nama
        System.out.print("Masukkan nama Anda: ");
        String nama = scanner.nextLine();

        // Meminta input gaji dan tunjangan
        System.out.print("Masukkan gaji Anda: ");
        double gaji = scanner.nextDouble();

        System.out.print("Masukkan tunjangan Anda: ");
        double tunjangan = scanner.nextDouble();

        // Menghitung gaji kotor dan pajak
        double gajiKotor = gaji + tunjangan;
        double pajakNegara = gajiKotor * 0.0765;

        // Menghitung gaji bersih
        double gajiBersih = gajiKotor - pajakNegara;

        // Menampilkan hasil
        System.out.println("Gaji yang diterima oleh " + nama + " adalah sebagai berikut:");
        System.out.println("Gaji Kotor: " + gajiKotor);
        System.out.println("Pajak Negara: " + pajakNegara);
        System.out.println("Gaji Bersih: " + gajiBersih);

        System.out.println("Total gaji bersih dari " + nama + " yang diterima yaitu " + gajiBersih);
    }
}
