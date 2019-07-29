package com.shen.example;


import com.shen.example.di.JuiceComponent;

import javax.inject.Inject;
import javax.inject.Provider;

public class FruitShop {
    @Inject
    public Provider<JuiceComponent.Builder> juiceComponentProvider;

    @Inject
    public FruitShop() {}

//    @Inject
//    Desk desk;
//
//    @Inject
//    Desk desk2;


//    @Inject @FruitType("apple")
//    Fruit apple;
//
//    @Inject @FruitType("orange")
//    Provider<Fruit> orange;
//
//    @Inject @FruitType("pear")
//    Lazy<Fruit> pear;

//    public String createFruit() {
//        return apple.name() + " " + orange.get().name() + " " + pear.get().name();
//    }

//    public String checkDesk() {
//        return desk == desk2 ? "desk equal" : "desk not equal";
//    }

//    public String printStringSet() {
//        StringBuilder sb = new StringBuilder();
//        for (String s : strings) {
//            sb.append(s);
//        }
//        return sb.toString();
//    }

    public String juice() {
        JuiceShop juiceShop = juiceComponentProvider.get().build().inject();
        return juiceShop.getJuice();
    }

}
