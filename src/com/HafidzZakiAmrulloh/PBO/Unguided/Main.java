package com.HafidzZakiAmrulloh.PBO.Unguided;
public class Main {
    public static void main(String[] args) {
        Character2267 chara1 = new Character2267("Karakter 1", 100, 50, 1);
        chara1.bergerak();

        NPC2267 npc1 = new NPC2267("NPC 1", 50, 0, 1, "Halo, ada yang bisa saya bantu?", 3);
        npc1.talk();
        npc1.beriQuest();

        PlayableCharacter2267 player1 = new PlayableCharacter2267("Player 1", 200, 100, 1, "Mage");
        player1.bergerak();
        System.out.println("Job player1: " + player1.getJob());

        player1.setJob("Warrior");
        System.out.println("Job player1 setelah diubah: " + player1.getJob());
    }
}