package org.example;
public abstract class Product {
    private String name;
    private int price;

    public Product(String name, int price){
        this.name = name;
        this.price = price;
    }

    public abstract String extraInfo();

    public String getName(){
        return name;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;
    }

    public String toString() {
        return String.format("%s, %s : %d", name, extraInfo(), price);
    }
}
