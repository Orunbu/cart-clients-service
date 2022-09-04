package com.company;
public class Main{

    public static void main(String[] args) {
        System.out.println("Hello World!");

        ClientProduct laptopRog = new ClientProduct();
        laptopRog.setName("Asus Rog Zephyrus 14");
        laptopRog.setDiscount(0);
        laptopRog.setPrice(220000);
        System.out.println(laptopRog);

        ClientProduct mouse = new ClientProduct();
        mouse.setName("Steelseries rival pro");
        mouse.setPrice(13000);
        mouse.setDiscount(5);
        mouse.setQuantity(2);

        ClientProduct[] clientProducts = new ClientProduct[2];
        clientProducts[0] = laptopRog;
        clientProducts[1] = mouse;

        Client test = new Client();
        test.setName("Abil");
        test.setEmail("abil.@mail.ru");
        test.setCart(new Cart(clientProducts));
    }
}