import java.util.Scanner;
public class Menu3{


    public static void displayMenu(int opt[], String Items[]){
        //Display Menu
        System.out.println("M E N U");
        System.out.println("==========");
        // Loop through options and items
        for(int i = 0; i < opt.length; i++){
            System.out.printf("%d. %s\n", opt[i], Items[i]);
        }
        System.out.println("==========");
        System.out.print("Enter Choice");
    }

    public static void main(String[] args){
        // User choice
        int choice;
        String order;
        Scanner sc = new Scanner(System.in);
        // Menu data
        int options[] = {1,2,3,4};
        String menuItems[] = {"Add new Customer", "Add a new spare part", "Create an Order", "Exit Program"};

        // Exit option
        int EXIT = options[options.length-1];

        //Display Menu
        displayMenu(options, menuItems);

        // Set up the scanner
        Scanner in = new Scanner(System.in);

        //Get choice from user
        choice=sc.nextInt();

        //logic
        switch (choice){
            case 1:
                order=menuItems[0];
                break;
            case 2:
                order=menuItems[1];
                break;
            case 3:
                order=menuItems[2];
                break;
            default:
                order="not an option";




        }

        //output
        System.out.println("selected "+order);


    }
}
