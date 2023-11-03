import java.util.Scanner;
import java.util.UUID;

public class Car extends Showroom implements Utility {

    String carName;
    String carColor;
    int carPrice;

    String carType; //nissan, hyundai, bmw
    String carFuelType; //fuel, diesel, petrol
    String carTransmission; //automatic transmission

    @Override
    public void setDetails(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("===========*******ENTER CAR DETAILS*******===================");
        System.out.println();
        System.out.print("CAR NAME::");
        carName=scanner.nextLine();
        System.out.print("CAR COLOR::");
        carColor=scanner.nextLine();
        System.out.print("CAR PRICE::");
        carPrice=scanner.nextInt();
        scanner.nextLine();
        System.out.print("CAR TYPE(SEDAN/SUV/HATCHBACK)::");
        carType=scanner.nextLine();
        System.out.print("CAR FUEL TYPE ::");
        carFuelType=scanner.nextLine();
        System.out.print("CAR TRANSMISSION(Transmission Type: AUTOMATIC or MANUAL::");
        carTransmission=scanner.nextLine();
        totalCarInStock++; //naya car add garna sath totalCarInStock badhauni

    }
    @Override
    public void getDetails(){
        System.out.println();
        System.out.println("===========******* Car DETAILS*******===================");
        System.out.println("Car name::"+carName);
        System.out.println("Car color::"+carColor);
        System.out.println("Car price::"+carPrice);
        System.out.println("Car Type ::"+carType);
        System.out.println("Car Fuel Type::"+carFuelType);
        System.out.println("Car Transmission::"+carTransmission);


    }
}
//This Java-based project is a simple car showroom management system that allows users to interact with showrooms, employees, and car details through a menu-driven interface.
