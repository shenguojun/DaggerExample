package com.shen.example;


import com.shen.example.counter.Counter;
import com.shen.example.di.DaggerCounterComponent;
import com.shen.example.di.DaggerFruitComponent;

public class Main {

    public static void main(String[] args) {
//        for (int i=0; i<5; i++) {
            FruitShop fruitShop = DaggerFruitComponent
                    .builder()
                    .cusPearName("cus_Pear")
                    .build()
                    .inject();
            System.out.println(fruitShop.createFruit());
//        }
        Counter counter = DaggerCounterComponent.create().inject();
        counter.print();
    }
}
