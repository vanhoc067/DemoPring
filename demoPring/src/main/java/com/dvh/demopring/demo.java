/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dvh.demopring;

import com.dvh.services.ProductService;

/**
 *
 * @author admin
 */
public class demo {
    public static void main(String[] args){
        ProductService s = new ProductService();
        s.getProducts(null, 0).forEach(p -> System.out.printf("%d - %s - %.lf\n",
                p.getId(), p.getName(), p.getPrice()));
    }
}
