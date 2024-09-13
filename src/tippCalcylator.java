import java.util.Scanner;

public class tippCalcylator {
    public static void main(String[] args) {
        boolean isRunning = true;
        double tip;
        Scanner scanner = new Scanner(System.in);
        int bill;

        while (isRunning) {
            try {
                System.out.println("To exit the program type 0");
                System.out.println("Enter bill amount ");
                bill = scanner.nextInt();


                if (bill < 0) {
                    System.out.println("Enter a positive number");
                } else if (bill == 0) {
                    System.out.println("You exit the program");
                    isRunning = false;
                } else if (bill >= 50 && bill <= 300) {
                    tip = bill * 0.15;
                    System.out.println("Tip amount is: " + tip);
                    System.out.println("Total amount is: " + (bill+tip));
                    System.out.println("Have a nice day");
                    isRunning = false;
                } else if (bill > 300 && bill <= 1000) {
                    tip = bill * 0.2;
                    System.out.println("Tip amount is: " + tip);
                    System.out.println("Total amount is: " + (bill+tip));
                    System.out.println("Have a nice day");
                    isRunning = false;
                } else if (bill > 1000) {
                    tip = bill * 0.25;
                    System.out.println("Tip amount is: " + tip);
                    System.out.println("Total amount is: " + (bill+tip));
                    System.out.println("Have a nice day");
                    isRunning = false;
                }


            } catch (Exception e) {
                System.out.println("Invalid input");
                scanner.next();
            }
        }
    }
}