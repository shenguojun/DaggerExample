package com.shen.example;


import com.shen.example.di.DaggerFruitComponent;

public class Main {

    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
//        FruitShop fruitShop = new FruitShop();
//        DaggerFruitComponent.create().inject(fruitShop);
//            System.out.println(fruitShop.printStringSet());
////        }

        FruitShop fruitShop = DaggerFruitComponent
                .create()
                .inject();
//        JuiceShop juiceShop = DaggerJuiceComponent
//                .builder()
//                .fruitComponent(DaggerFruitComponent.create())
//                .build()
//                .inject();
        System.out.println(fruitShop.juice());

    }
}
