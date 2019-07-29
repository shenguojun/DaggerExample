package com.shen.example;


import com.shen.example.di.DaggerFruitComponent;

public class Main {

    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
            FruitShop fruitShop = DaggerFruitComponent
                    .builder()
//                    .projectModule(new ProjectModule("cus_Pear"))
                    .cusPearName(null)
                    .build()
                    .inject();
            System.out.println(fruitShop.createFruit());
//        }
//        Counter counter = DaggerCounterComponent.create().inject();
//        counter.print();
    }
}
