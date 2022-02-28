package com.company;

public class Car extends vehicle {
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    private String make;
    private String model;

    public Car(String make, String model, int numberOfWheels) {
        this.make = make;
        this.model = model;
        this.setNumberOfWheels(numberOfWheels);
    }
}
