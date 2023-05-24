package com.HafidzZakiAmrulloh.PBO.Pertemuan6;

import java.util.Scanner;
import java.util.InputMismatchException;

public class MultiException {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        try{
            System.out.println("Masukkan bilangan: ");
            int bilangan1 = input.nextInt();

            System.out.println("Masukkan pembaginya: ");
            int bilangan2 = input.nextInt();

            int hasil = bilangan1/bilangan2;
            System.out.println(bilangan1 + " / " + bilangan2 + " = " + hasil + "(dibulatkan)");
        }
//
//        catch(ArithmeticException | InputMismatchException e){
//            System.out.println("Error gess. Tidak dapat diproses :(");
//        }

        // Multiple Catch
        catch (ArithmeticException e) {
            System.out.println("Error weh. Tidak bisa diproses!");
        }

        catch (InputMismatchException e) {
            System.out.println("Masukkan angka saja yoo :)");
        }

        System.out.println("Proses sudah selesai yoo :");
    }
}
