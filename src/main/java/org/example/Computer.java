package org.example;

public class Computer extends Product{

    private String cpu;

    public Computer(String name, int price, String cpu) {
        super(name, price);
        this.cpu = cpu;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    //TODO: return null을 지우고 구현
    @Override
    public String extraInfo() {
        return String.format("cpu: %s", cpu);
    }
}
