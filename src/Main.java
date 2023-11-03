import java.util.Scanner;

interface Utility {

    public void getDetails();
    public void setDetails();
}



public class Main {


    public static void main(String[] args) {
//        mainMenu();
//        Showroom showroom= new Showroom();
//        showroom.setDetails();
//        showroom.getDetails();
//        Employee employee = new Employee();
//        employee.setDetails();
//        employee.getDetails();
//        Car car = new Car();
//        car.setDetails();
//        car.getDetails();
        Scanner scanner=new Scanner(System.in);
        Showroom[] showroom = new Showroom[5];
        Employee[] employee= new Employee[5];
        Car[] car= new Car[5];
        int showroomCounter=0;
        int employeeCounter=0;
        int carCounter=0;
        int choice=100;
        while(choice!=0){ //zero navayesamma loop chalcha //0 vayesi exit
            mainMenu();
            choice=scanner.nextInt();
            // If the user enters 9, it should exit the inner while loop, taking the control back to the outer loop.

            while(choice!=9 && choice!=0){ //after break; if not then mathiko while loop ma //choice is not eql to 9 and zero
                switch (choice){
                    case 1:
                        showroom[showroomCounter]=new Showroom();
                        showroom[showroomCounter].setDetails();
                        showroomCounter++;
                        System.out.println();
                        System.out.println("1) ADD SHOWROOM");
                        System.out.println("9) Go TO MAIN MENU");
                        choice= scanner.nextInt();
                        break;

                    case 2:
                        employee[employeeCounter]=new Employee();
                        employee[employeeCounter].setDetails();
                        employeeCounter++;
                        System.out.println();
                        System.out.println("2) ADD EMPLOYEE");
                        System.out.println("9) Go TO MAIN MENU");
                        choice= scanner.nextInt();
                        break;

                    case 3:
                        car[carCounter]=new Car();
                        car[carCounter].setDetails();
                        carCounter++;
                        System.out.println("3) ADD CAR");
                        System.out.println("9) Go TO MAIN MENU");
                        choice= scanner.nextInt();
                        break;

                    case 4:
                        for(int i=0;i<showroomCounter;i++){ //jati samma value add huncha teti matrai diplay huncha i.e till showroomCounter
                            showroom[i].getDetails();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9) GO TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice= scanner.nextInt();
                        break;

                    case 5:
                        for(int i=0; i<employeeCounter; i++){
                            employee[i].getDetails();
                            System.out.println();

                        }
                        System.out.println();
                        System.out.println();
                        System.out.println("9) GO TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice= scanner.nextInt();
                        break;

                    case 6:
                        for(int i=0; i<carCounter;i++){
                            car[i].getDetails();
                            System.out.println();
                        }
                        System.out.println("9) GO TO MAIN MENU");
                        System.out.println("0) EXIT");
                        choice=scanner.nextInt();
                        break;

                    default:
                        System.out.println("ENTER VALID CHOICE:");
                        break;
                }
            }
        }

    }
    public static void mainMenu(){
        System.out.println();
        System.out.println("==============****WELCOME TO CAR SHOWROOM MANAGEMENT****===============");
        System.out.println();
        System.out.println("================**********ENTER YOUR CHOICE********====================");
        System.out.println();
        System.out.println("1)ADD SHOWROOM\t\t\t2)ADD EMPLOYEE \t\t\t3)ADD CAR");
        System.out.println();
        System.out.println("4)GET SHOWROOM\t\t\t5)GET EMPLOYEE \t\t\t6)GET CAR");
        System.out.println();
        System.out.println("================**********ENTER 0 TO EXIT ********====================");

    }



}

