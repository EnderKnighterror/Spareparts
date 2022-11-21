import java.util.ArrayList;
import java.util.Scanner;
public class Menu2{
    private final Scanner input = new Scanner(System.in);
    public ReadMe fileInMemory = new ReadMe();
    public ArrayList<String> customerArrayList = fileInMemory.ReadMeCustomers();
    public ArrayList<String> sparePartsArrayList = fileInMemory.ReadMeSpareParts();

    public ArrayList<Customer> customers = new ArrayList<>();
    public ArrayList<SpareObj> spareParts = new ArrayList<>();



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

    public void main(){
        // User choice
        int choice;
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
        choice = in.nextInt();

        // Menu loop
        while(choice != EXIT){

            //check choice value
            if (choice == options[0]){
                this.addCustomer();
            }
            else if (choice == options[1]){
                this.addSparepart();
            }
            else if (choice == options[2]){
                createOrder();
            }

            // Display menu again
            displayMenu(options, menuItems);

            //Get choice from user
            choice = in.nextInt();
        }
        System.out.println("Exiting program");

    }
    private void addCustomer() {
        System.out.println("Enter customer ID: ");
        String customerID = input.nextLine();
        System.out.println("Enter customer name: ");
        String customerName = input.nextLine();
        System.out.println("Enter customer payment type account or card: ");
        String customerPaymentType = input.nextLine();

        String customer = "[" + customerID + "," + customerName + "," + customerPaymentType + "]";
        // convert to string first id name payment type

        customerArrayList.add(customer);

        Write.writeFileCustomers(customer);
        System.out.println("Customer added");
        int options[] = {1, 2, 3, 4};
        String menuItems[] = {"Add new Customer", "Add a new spare part", "Create an order", "Exit program"};
        displayMenu(options, menuItems);
    }
    private void addSparepart() {
        System.out.println("Enter spare part name: ");
        String sparePartName = input.nextLine();
        System.out.println("Is the part genuine true or false: ");
        String sparePartGenuine = input.nextLine();

        String sparePart = "[" + sparePartName + "," + sparePartGenuine + "]";

        sparePartsArrayList.add(sparePart);

        Write.writeFileSpareParts(sparePart);
        System.out.println("Spare part added");
        int options[] = {1, 2, 3, 4};
        String menuItems[] = {"Add new Customer", "Add a new spare part", "Create an order", "Exit program"};
        displayMenu(options, menuItems);
    }
    public static void createOrder() {
        MenuCreateOrder menu = new MenuCreateOrder();
        menu.main();

    }

}
