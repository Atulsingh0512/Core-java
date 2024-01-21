package elebill;

import java.util.Scanner;

class Customer {
    private String name;
    private int meterReading;

    public Customer(String name, int meterReading) {
        this.name = name;
        this.meterReading = meterReading;
    }

    public String getName() {
        return name;
    }

    public int getMeterReading() {
        return meterReading;
    }

    public void setMeterReading(int meterReading) {
        this.meterReading = meterReading;
    }
}

class ElectricityBillingSystem {
    private static final double RATE_PER_UNIT = 5.5;

    private Customer customer;
    private int previousReading;
    private int currentReading;

    public ElectricityBillingSystem(Customer customer, int previousReading, int currentReading) {
        this.customer = customer;
        this.previousReading = previousReading;
        this.currentReading = currentReading;
    }

    public double calculateBill() {
        int unitsConsumed = currentReading - previousReading;
        return unitsConsumed * RATE_PER_UNIT;
    }

    public void printBill() {
        System.out.println("Electricity Bill");
        System.out.println("Customer Name: " + customer.getName());
        System.out.println("Previous Reading: " + previousReading);
        System.out.println("Current Reading: " + currentReading);
        System.out.println("Units Consumed: " + (currentReading - previousReading));
        System.out.println("Rate per Unit: $" + RATE_PER_UNIT);
        System.out.println("Total Amount: $" + calculateBill());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();

        System.out.print("Enter previous meter reading: ");
        int previousReading = scanner.nextInt();

        System.out.print("Enter current meter reading: ");
        int currentReading = scanner.nextInt();

        Customer customer = new Customer(customerName, previousReading);
        ElectricityBillingSystem billingSystem = new ElectricityBillingSystem(customer, previousReading, currentReading);
        billingSystem.printBill();

        scanner.close();
    }
}

