package com.HafidzZakiAmrulloh.PBO.Pertemuan3;
public class Main {
    public static void main(String[] args) {
        //Pembuatan Class
        SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

        //Uji coba getter & setter
        System.out.println("Motor merk " + suzuki.getMerk() + " dengan tipe (before) : " + suzuki.getTipe());
        suzuki.setTipe("Satria FU");
        System.out.println("Motor merk " + suzuki.getMerk() + " dengan tipe (after) : " + suzuki.getTipe());
        /*
        //Pembuatan Class
        SepedaMotor suzuki = new SepedaMotor("Suzuki", "GSX 150R", 20000000);
        SepedaMotor yamaha = new SepedaMotor("Yamaha", "YZF R15", 25000000);
        SepedaMotor honda = new SepedaMotor("Honda", "CBR 150R", 23500000);

        //Menjalankan method showInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();
    }
}

        //Pembuatan Class
        SepedaMotor suzuki = new SepedaMotor();
        SepedaMotor yamaha = new SepedaMotor();
        SepedaMotor honda = new SepedaMotor();

        //Mengisi nilai atribut object suzuki
        suzuki.merk = "Suzuki";
        suzuki.tipe = "GSX 150R";
        suzuki.harga = 20000000;

        //Mengisi nilai atribut object yamaha
        yamaha.merk = "Yamaha";
        yamaha.tipe = "YZF R15";
        yamaha.harga = 25000000;

        //Mengisi nilai atribut object honda
        honda.merk = "Honda";
        honda.tipe = "CBR 150R";
        honda.harga = 23500000;
*/
        //Menjalankan method showInfo
        suzuki.showInfo();
        yamaha.showInfo();
        honda.showInfo();
    }
}
