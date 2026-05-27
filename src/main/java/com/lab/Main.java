package com.lab;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== BigDecimal Operations ===");

        // Test roundToNearestHundredth
        BigDecimal num1 = new BigDecimal("4.2545");
        double rounded = BigDecimalOperations.roundToNearestHundredth(num1);
        System.out.println("4.2545 rounded to nearest hundredth: " + rounded);

        // Test reverseSignAndRoundToTenth
        BigDecimal num2 = new BigDecimal("1.2345");
        BigDecimal result1 = BigDecimalOperations.reverseSignAndRoundToTenth(num2);
        System.out.println("1.2345 with reversed sign and rounded to tenth: " + result1);

        BigDecimal num3 = new BigDecimal("-45.67");
        BigDecimal result2 = BigDecimalOperations.reverseSignAndRoundToTenth(num3);
        System.out.println("-45.67 with reversed sign and rounded to tenth: " + result2);

        System.out.println("\n=== Car Inventory System ===");

        Sedan sedan = new Sedan("VIN123456", "Toyota", "Camry", 45000);
        System.out.println("Sedan: " + sedan.getInfo());

        UtilityVehicle uv = new UtilityVehicle("VIN234567", "Ford", "Explorer", 35000, true);
        System.out.println("Utility Vehicle: " + uv.getInfo());

        Truck truck = new Truck("VIN345678", "Chevrolet", "Silverado", 60000, 12000.5);
        System.out.println("Truck: " + truck.getInfo());

        System.out.println("\n=== Video Streaming Service ===");

        Movie movie = new Movie("The Matrix", 136, 8.7);
        System.out.println("Movie: " + movie.getInfo());

        TvSeries tvSeries = new TvSeries("Breaking Bad", 47, 62);
        System.out.println("TV Series: " + tvSeries.getInfo());

        System.out.println("\n=== IntList Interface ===");

        // Test IntArrayList
        System.out.println("IntArrayList (capacity: 10, grows by 50%):");
        IntArrayList arrayList = new IntArrayList();
        for (int i = 0; i < 25; i++) {
            arrayList.add(i);
            if (i + 1 == 10 || i + 1 == 15 || i + 1 == 25) {
                System.out.println("  After adding " + (i + 1) + " elements: capacity = " + arrayList.capacity());
            }
        }
        System.out.println("  Get element at index 5: " + arrayList.get(5));
        System.out.println("  Get element at index 24: " + arrayList.get(24));

        // Test IntVector
        System.out.println("\nIntVector (capacity: 20, grows by 100%):");
        IntVector vector = new IntVector();
        for (int i = 0; i < 25; i++) {
            vector.add(i);
            if (i + 1 == 20 || i + 1 == 40) {
                System.out.println("  After adding " + (i + 1) + " elements: capacity = " + vector.capacity());
            }
        }
        System.out.println("  Get element at index 10: " + vector.get(10));
        System.out.println("  Get element at index 24: " + vector.get(24));
    }
}
