package com.HafidzZakiAmrulloh.PBO.Unguided;
public class PlayableCharacter2267 extends Character2267 {
    String job;

    public PlayableCharacter2267(String nama, int hp, int mana, int level, String job) {
        super(nama, hp, mana, level);
        this.job = job;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}