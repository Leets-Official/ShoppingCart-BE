package org.example;

public class Computer extends Product{
    private String cpu;

    public Computer(String name, int price, String cpu) {
        super(name, price);
        this.cpu = cpu;
    }

    @Override
    public String extraInfo() {
        return "cpu: " + cpu;
    }
}
