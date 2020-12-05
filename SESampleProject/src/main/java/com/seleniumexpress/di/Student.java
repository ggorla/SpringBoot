package com.seleniumexpress.di;

public class Student {
    private static Cheat cheat;

    public static void setCheat(Cheat cheat) {
        Student.cheat = cheat;
    }

    public static void cheating(){
        cheat.cheat();
    }
}
