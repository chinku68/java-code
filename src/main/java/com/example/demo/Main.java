package com.example.demo;

// Base class Vehicle
class Vehicle {
    void display() {
        System.out.println("Vehicle");
    }
}

// Derived class Car
class Car extends Vehicle {
    @Override
    void display() {
        System.out.println("Car");
    }
}

// Derived class Bike
class Bike extends Vehicle {
    @Override
    void display() {
        System.out.println("Bike");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle bike = new Bike();

        // Polymorphism - Method overriding
        vehicle.display();  // Output: Vehicle
        car.display();      // Output: Car
        bike.display();     // Output: Bike

        // Polymorphism - Method overriding with parent reference
        Vehicle parentRef = new Car();
        parentRef.display(); // Output: Car
    }
}


