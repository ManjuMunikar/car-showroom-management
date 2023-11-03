import java.util.Scanner;
import java.util.UUID;

public class Employee extends Showroom implements Utility {

    String  empId;
    String empName;
    String empAddress;
    int empAge;
    String empDepartment;
    @Override
    public void setDetails() {
        Scanner scanner= new Scanner(System.in);
        UUID uuid= UUID.randomUUID(); //database ko case ma huncha afai increment
        empId= String.valueOf(uuid); //Universally Unique Identifier (UUID)
        System.out.println("===========*******ENTER EMPLOYEE DETAILS*******===================");
        System.out.println();
        System.out.print("EMPLOYEE NAME::");
        empName=scanner.nextLine();
        System.out.print("EMPLOYEE AGE::");
        empAge=scanner.nextInt();
        scanner.nextLine();
        System.out.print("EMPLOYEE ADDRESS::");
        empAddress=scanner.nextLine();
        System.out.print("EMPLOYEE DEPARTMENT::");
        empDepartment=scanner.nextLine();
        totalEmployees++;

    }

    @Override
    public void getDetails() {
        System.out.println();
        System.out.println("===========******* EMPLOYEES DETAILS*******===================");

        System.out.println("Employee ID::"+empId);
        System.out.println("Employee name::"+empName);
        System.out.println("Employee address::"+empAddress);
        System.out.println("Employee age::"+empAge);
        System.out.println("Employee department::"+empDepartment);

    }

}



