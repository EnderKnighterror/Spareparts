import java.util.Scanner;
public class Menu{
    public static void main(){
        // User choice
        int choice;

        //Display Menu
        System.out.println("M E N U");
        System.out.println("==========");
        System.out.println("1. Add new customer");
        System.out.println("2. Add a new spare part");
        System.out.println("3. Create an Order");
        System.out.println("4. Exit close program");
        System.out.println("==========");
        System.out.print("Enter Choice");

        // Set up the scanner
        Scanner in = new Scanner(System.in);

        //Get choice from user
        choice = in.nextInt();

        // Menu loop
        while(choice != 4){

            //check choice value
            if (choice == 1){
                System.out.println("Option 1 selected");
            }
            else if (choice == 2){
                System.out.println("Option 2 selected");
            }
            else if (choice == 3){
                System.out.println("Option 3 selected");
            }

            // Display menu again
            System.out.println("M E N U");
            System.out.println("==========");
            System.out.println("1. Add new customer");
            System.out.println("2. Add a new spare part");
            System.out.println("3. Create an Order");
            System.out.println("4. Exit close program");
            System.out.println("==========");
            System.out.print("Enter Choice");

            //Get choice from user
            choice = in.nextInt();
        }
        System.out.println("Exiting program");

    }
}