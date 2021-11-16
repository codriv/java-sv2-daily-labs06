package day02.cars;

import java.util.ArrayList;
import java.util.List;

public class CarShop {
    private String name;
    private int maxPrice;
    private List<Car> carsForSell = new ArrayList<>();

    public CarShop(String name, int maxPrice) {
        this.name = name;
        this.maxPrice = maxPrice;
    }

    public String getName() {
        return name;
    }

    public int getMaxPrice() {
        return maxPrice;
    }

    public List<Car> getCarsForSell() {
        return carsForSell;
    }

    public boolean addCar(Car car) {
        return car.getPrice() <= maxPrice ? carsForSell.add(car) : false;
    }

    public int sumCarPrice() {
        int sumOfPrices = 0;
        for (Car car : carsForSell) {
            sumOfPrices += car.getPrice();
        }
        return sumOfPrices;
    }

    public int numberOfCarsCheaperThan(int price) {
        int numberOfCars = 0;
        for (Car car : carsForSell) {
            if (car.getPrice() <= price) {
                numberOfCars++;
            }
        }
        return numberOfCars;
    }

    public List<Car> carsWithBrand(String brand) {
        List<Car> carsWithBrand = new ArrayList<>();
        for (Car car : carsForSell) {
            if (brand.equals(car.getBrand())) {
                carsWithBrand.add(car);
            }
        }
        return carsWithBrand;
    }
}
