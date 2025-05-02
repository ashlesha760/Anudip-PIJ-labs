//lab 2: assignment 1

import java.util.Scanner;

public class Car {

    // Attributes
    String make;
    String model;
    short year;
    int price;

    // Constructor
    public Car(String make, String model, short year, int price) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    // Method to display car details
    public void displayCarDetails() {
        System.out.println("Car Details:");
        System.out.println("Make  : " + make);
        System.out.println("Model : " + model);
        System.out.println("Year  : " + year);
        System.out.println("Price : Rs." + price);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    //user input

        System.out.print("Enter car make: ");
        String make = scanner.nextLine();

        System.out.print("Enter car model: ");
        String model = scanner.nextLine();

        System.out.print("Enter car year: ");
        short year = scanner.nextShort();

        System.out.print("Enter car price: ");
        int price = scanner.nextInt();

        Car userCar = new Car(make, model, year, price);   // Create Car object

        userCar.displayCarDetails();     // Display car details

        scanner.close();
    }
}
