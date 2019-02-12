package com.shen.example;


import com.shen.example.di.JuiceType;
import com.shen.example.juice.Juice;

import javax.inject.Inject;

public class JuiceShop {

    @Inject
    public JuiceShop(){}

    @Inject
    @JuiceType("appleJuice")
    public Juice appleJuice;

    @Inject
    @JuiceType("orangeJuice")
    public Juice orangeJuice;

    public String getJuice() {
        return appleJuice.name() + " " + orangeJuice.name();
    }
}
