package com.company;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Product laptopRog = new Product();
        laptopRog.setName("Asus Rog Zephyrus 14");
        laptopRog.setDiscount(0);
        laptopRog.setPrice(220000);
        System.out.println(laptopRog);
    }
}
