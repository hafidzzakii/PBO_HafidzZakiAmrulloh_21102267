package com.HafidzZakiAmrulloh.PBO.Unguided;
public class Character2267 {
    String nama;
    int hp;
    int mana;
    int level;

    public Character2267(String nama, int hp, int mana, int level) {
        this.nama = nama;
        this.hp = hp;
        this.mana = mana;
        this.level = level;
    }
    public void bergerak() {
        System.out.println(nama + " bergerak.");
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public int getHp() {
        return hp;
    }
    public void setHp(int hp) {
        this.hp = hp;
    }
    public int getMana() {
        return mana;
    }
    public void setMana(int mana) {
        this.mana = mana;
    }
    public int getLevel() {
        return level;
    }
    public void setLevel(int level) {
        this.level = level;
    }
}