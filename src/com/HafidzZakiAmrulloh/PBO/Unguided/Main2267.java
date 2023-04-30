package com.HafidzZakiAmrulloh.PBO.Unguided;
public class Main2267 {
    public static void main(String[] args) {
        PaketInternet2267 paket1 = new PaketInternet2267("Paket Unlimited", "24 jam nonstop 30 hari FUP 7gb/hari", 118000);
        PaketInternet2267 paket2 = new PaketInternet2267("Paket Gila", "Kecepatan internet 200 Mbps 30 hari FUP 100gb/hari", 150000);
        PaketInternet2267 paket3 = new PaketInternet2267("Paket Gemink", "250 Mbps tanpa FUP khusus game online", 100000);

        System.out.println("Nama Paket : " + paket1.getNamaPaket());
        System.out.println("Benefit : " + paket1.getBenefit());
        System.out.println("Harga : " + paket1.getHarga());

        System.out.println("Nama Paket : " + paket2.getNamaPaket());
        System.out.println("Benefit : " + paket2.getBenefit());
        System.out.println("Harga : " + paket2.getHarga());

        System.out.println("Nama Paket : " + paket3.getNamaPaket());
        System.out.println("Benefit : " + paket3.getBenefit());
        System.out.println("Harga : " + paket3.getHarga());
    }
}