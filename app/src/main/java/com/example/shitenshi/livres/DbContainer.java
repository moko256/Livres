package com.example.shitenshi.livres;

import android.content.Context;

/**
 * Created by masuken111 on 2017/11/15.
 */

public class DbContainer {
    public DbContainer(String category, String productname, int price){
        this.category = category;
        this.productname = productname;
        this.price = price;
    }
    String category;
    String productname;
    int price;

}

