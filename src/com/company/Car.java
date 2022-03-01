package com.company;

public class Car extends vehicle {
    private String make;
    private String model;

    public String getMake() {
        return make;
    }
//    public void setMake(String make) {
//        this.make = make;
//    }
    public String getModel() {
        return model;
    }
//    public void setModel(String model) {
//        this.model = model;
//    }


    public Car(String make, String model, String color, int numberOfWheels, boolean hasMotor) {
        super(color, numberOfWheels, true);
        this.make = make;
        this.model = model;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("this is a car of model " + model + " and make of " + make);
    }
}
