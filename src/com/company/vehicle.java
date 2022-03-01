package com.company;

public class vehicle {
    private String color;
    private int numberOfWheels;
    private boolean hasMotor;

    public vehicle (String color, int numberOfWheels, boolean hasMotor) {
        this.color = color;
        this.numberOfWheels = numberOfWheels;
        this.hasMotor = hasMotor;
    }
    public String getColor() {
        return color;
    }
//    public void setColor(String color) {
//        this.color = color;
//    }
    public int getNumberOfWheels() {
        return numberOfWheels;
    }
//    public void setNumberOfWheels(int numberOfWheels) {
//        this.numberOfWheels = numberOfWheels;
//    }
    public boolean isHasMotor() {
        return hasMotor;
    }
//    public void setHasMotor(boolean hasMotor) {
//        this.hasMotor = hasMotor;
//    }
    public void printDetails() {
        System.out.println("this is a vehicle with " + numberOfWheels + " wheels and is the color of " + color);
    }
}
