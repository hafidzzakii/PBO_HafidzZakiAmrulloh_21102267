package com.HafidzZakiAmrulloh.PBO.Pertemuan4;
public class Main {
    public static void main(String[] args) {
        Manager managerkami = new Manager();
        Pegawai pegawaikami = new Pegawai();

        managerkami.nip = 198067857;
        managerkami.nama = "Hasan Sadikin";

        pegawaikami.nip = 198067998;
        pegawaikami.nama = "Asep Hutama";

        managerkami.showInfo();
        managerkami.extraInfo();
        managerkami.bonus(1200000);
        managerkami.bonus();

        pegawaikami.showInfo();
    }
}