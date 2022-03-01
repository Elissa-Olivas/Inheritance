package com.company;

public class Sedan extends Car {
    private int numberOfSeats;

    public Sedan(String make, String model, String color, int numberOfWheels, boolean hasMotor, int numberOfSeats) {
        super(make, model, color, numberOfWheels, hasMotor);
        this.numberOfSeats = numberOfSeats;
    }
    public void printDetails() {
        super.printDetails();
        System.out.println("This is a sedan with " + numberOfSeats + " seats");

    }
}
