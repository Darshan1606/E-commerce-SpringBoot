package com.spring.ecommerce.global;

import com.spring.ecommerce.Entity.Product;

import java.util.ArrayList;
import java.util.List;

public class GlobalData {
    public static List<Product> cart;
    static {
        cart = new ArrayList<Product>();
    }

}
