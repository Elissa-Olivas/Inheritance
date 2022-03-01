package com.company;

public class Main {

    public static void main(String[] args) {
        Sedan sedan1 = new Sedan("Ford", "Bronco", "blue", 4, true, 4);

        Car car1 = new Car("Ford", "mustang", "yellow", 4, true);

//    sedan1.printDetails();
//    System.out.println("\n");
//    car1.printDetails();

        vehicle[] vehicleArray = new vehicle[3];

        vehicleArray[0] = new vehicle("Brown", 3, false);
        vehicleArray[1] = new Car("Ford", "Escape", "Red", 4, true);
        vehicleArray[2] = new Sedan("Ford", "Focus", "green", 4, true, 5);

        for (int i = 0; i < vehicleArray.length; i++) {
            vehicleArray[i].printDetails();
        }

    }
}
