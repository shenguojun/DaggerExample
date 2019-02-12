package com.shen.example;


import com.shen.example.di.DaggerFruitComponent;
import com.shen.example.di.DaggerJuiceComponent;

public class Main {

    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
//        FruitShop fruitShop = new FruitShop();
//        DaggerFruitComponent.create().inject(fruitShop);
//            System.out.println(fruitShop.printStringSet());
////        }

//        FruitShop fruitShop = DaggerFruitComponent
//                .builder()
//                .cusPearName("cus_Pear")
//                .build()
//                .inject();
        JuiceShop juiceShop = DaggerJuiceComponent
                .builder()
                .fruitComponent(DaggerFruitComponent.create())
                .build()
                .inject();
        System.out.println(juiceShop.getJuice());

    }
}
