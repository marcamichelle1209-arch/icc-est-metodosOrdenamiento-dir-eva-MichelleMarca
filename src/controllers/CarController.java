package controllers;

import models.Car;

public class CarController {

    public static void sortByName(Car[] cars) {

        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {
                String nameA = cars[j].getName().toLowerCase();
                String nameB = cars[j + 1].getName().toLowerCase();

                if (nameA.compareTo(nameB) > 0) {
                    Car temp = cars[j];
                    cars[j] = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }
}