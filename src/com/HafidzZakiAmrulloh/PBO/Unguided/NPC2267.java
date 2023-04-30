package com.HafidzZakiAmrulloh.PBO.Unguided;
public class NPC2267 extends Character2267 {
    String dialog;
    int sidequest;

    public NPC2267(String nama, int hp, int mana, int level, String dialog, int sidequest) {
        super(nama, hp, mana, level);
        this.dialog = dialog;
        this.sidequest = sidequest;
    }

    public void talk() {
        System.out.println(nama + " berkata: " + dialog);
    }
    public void beriQuest() {
        System.out.println(nama + " memberi " + sidequest + " quest.");
    }

    // Getter dan setter
    public String getDialog() {
        return dialog;
    }
    public void setDialog(String dialog) {
        this.dialog = dialog;
    }
    public int getSidequest() {
        return sidequest;
    }
    public void setSidequest(int sidequest) {
        this.sidequest = sidequest;
    }
}