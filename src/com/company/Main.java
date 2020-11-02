package com.company;

import com.sun.source.tree.WhileLoopTree;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        ArrayList<Car> autobazar = new ArrayList<>(); // create array of cars class
        // making some changes for committing and creating new brunch
        // set info about first car in data base
        Owner owner1 = new Owner();
        Car firstCar = new Car();
        firstCar.setBrand("Fiat");
        firstCar.setModel("Doblo");
        firstCar.setPrice(3000);
        firstCar.setConsuption(6);
        firstCar.setCarSold(false);
        owner1.setFirstName("Valerii");
        owner1.setLastName("Kuiovda");
        owner1.setCountry("Czech Republic");
        owner1.setCity("Prague");
        owner1.setRegion("Prague");
        owner1.setStreet("Brodskeho");
        owner1.setHouseNumber("1673/13");
        owner1.setVip(true);
        firstCar.setCarOwner(owner1);
        autobazar.add(firstCar);

        // User interface
        System.out.println("Welcome to 'Autobazar'");

        int option = 1;
        while (option != 0) {
            System.out.println("Please choose option:");
            System.out.println("1. Add new auto to database");
            System.out.println("2. How many cars on 'Autobazar'? ");
            System.out.println("3. what is the total price of all cars ?");
            System.out.println("4. Show all cars");
            System.out.println("0. For exit choose 0");
            option = sc.nextInt();
            switch (option) {
                case 0 : break;
                case 1 : autobazar.add(addNewCar());
                    break;
                case 2: System.out.println("There are " + autobazar.size() + " cars in the database ");
                    break;
                case 3: System.out.println("Total price of all carse is - " + allPrice(autobazar));
                    break;
                case 4: showAll(autobazar);
                    break;
                default:
                    System.out.println("Please choose option from below:");
            }
        }

    }

    public static Car addNewCar() {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        Car carInfo = new Car();
        Owner ownerInfo = new Owner();
        System.out.println("Please enter car Brand:");
        carInfo.setBrand(sc.next());
        System.out.println("Please enter car Model:");
        carInfo.setModel(sc.next());
        System.out.println("Please enter car price:");
        carInfo.setPrice(sc.nextInt());
        System.out.println("Please enter car average consumption:");
        carInfo.setConsuption(sc.nextInt());
        System.out.println("Please enter car owner firstname:");
        ownerInfo.setFirstName(sc.next());
        System.out.println("Please enter car owner lastname:");
        ownerInfo.setLastName(sc.next());
        System.out.println("Car owner is VIP client? (true/false):");
        ownerInfo.setVip(sc.nextBoolean());
        System.out.println("Please enter car owner Country:");
        ownerInfo.setCountry(sc.next());
        System.out.println("Please enter car owner City:");
        ownerInfo.setCity(sc.next());
        System.out.println("Please enter car owner Region:");
        ownerInfo.setRegion(sc.next());
        System.out.println("Please enter car owner Street:");
        ownerInfo.setStreet(sc.next());
        System.out.println("Please enter car owner house number:");
        ownerInfo.setHouseNumber(sc.next());
        carInfo.setCarOwner(ownerInfo);
        return carInfo;
    }

    public static int allPrice (ArrayList<Car> autobazar) {
        int price = 0;
        for (Car i : autobazar) {
            price += i.getPrice();
        }
        return price;
    }

    public static  void showAll (ArrayList<Car> autobazar) {
        int counter = 0;
        for (Car i : autobazar) {
            counter++;
            System.out.println( counter + " ");
            System.out.println("  Brand: " + i.getBrand());
            System.out.println("  Model: " + i.getModel());
            System.out.println("  Price: " + i.getPrice());
        }
    }
}
