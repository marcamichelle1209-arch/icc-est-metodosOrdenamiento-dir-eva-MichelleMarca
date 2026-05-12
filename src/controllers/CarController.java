package controllers;

import models.Car;

public class CarController {

    public void sortByBrand(Car[] cars) {
        
        if (cars == null || cars.length <= 1) return;

        
        for (int i = 0; i < cars.length - 1; i++) {
            for (int j = 0; j < cars.length - 1 - i; j++) {

          
                if (cars[j] == null || cars[j + 1] == null) continue;

                String brandA = cars[j].getBrand();      
                String brandB = cars[j + 1].getBrand();  

  
                if (brandA.compareToIgnoreCase(brandB) > 0) {
                    Car temp    = cars[j];
                    cars[j]     = cars[j + 1];
                    cars[j + 1] = temp;
                }
            }
        }
    }

    public void sortByName(Car[] paraOrdenar) {
       
        throw new UnsupportedOperationException("Unimplemented method 'sortByName'");
    }
}