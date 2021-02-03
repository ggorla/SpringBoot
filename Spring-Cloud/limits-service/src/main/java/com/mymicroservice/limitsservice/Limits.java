package com.mymicroservice.limitsservice;

public class Limits {
    private int minmum;
    private int maximum;

    public Limits(int minmum, int maximum) {
        this.minmum = minmum;
        this.maximum = maximum;
    }

    public int getMinmum() {
        return minmum;
    }

    public void setMinmum(int minmum) {
        this.minmum = minmum;
    }

    public int getMaximum() {
        return maximum;
    }

    public void setMaximum(int maximum) {
        this.maximum = maximum;
    }
}
