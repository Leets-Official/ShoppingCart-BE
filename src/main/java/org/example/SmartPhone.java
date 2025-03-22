package org.example;

public class SmartPhone extends Product{

    private String carrier;

    public SmartPhone(String name, int price, String carrier) {
        super(name, price);
        this.carrier = carrier;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    //TODO: return null을 지우고 구현
    @Override
    public String extraInfo() {
        return String.format("carrier: %s", carrier);
    }
}
