import java.util.Scanner;

public class Showroom implements Utility{

    //member variables

    String name;
    String address;
    int totalEmployees;
    int totalCarInStock;
    String managerName;

    @Override
    public void setDetails() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("===========*******ENTER SHOWROOM DETAILS*******===================");
        System.out.println();
        System.out.print("SHOWROOM NAME::");
        name=scanner.nextLine();
        System.out.print("SHOWROOM ADDRESS::");
        address=scanner.nextLine();
        System.out.print("MANAGER NAME::");
        managerName=scanner.nextLine();
        System.out.print("TOTAL NUMBER OF EMPLOYEES::");
        totalEmployees=scanner.nextInt();
        System.out.print("TOTAL NUMBER OF CAR IN STOCK::");
        totalCarInStock=scanner.nextInt();

    }

    @Override
    public void getDetails() {
        System.out.println();
        System.out.println("===========******* SHOWROOM DETAILS*******===================");
        System.out.println("Showroom name::"+name);
        System.out.println("Showroom address::"+address);
        System.out.println("Manager name::"+managerName);
        System.out.println("Total number of employees::"+totalEmployees);
        System.out.println("Total number of car in stock::"+totalCarInStock);
        System.out.println();

    }

}
