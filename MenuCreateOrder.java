import java.util.ArrayList;
import java.util.Scanner;

public class MenuCreateOrder {
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

    public void main() {
        // User choice
        int choice;
        // Menu data
        int options[] = {1, 2, 3, 4};
        String menuItems[] = {"Select a customer", "Select a part", "Save order - only once customer and parts selected", "Return to menu"};

        // Exit option
        int EXIT = options[options.length - 1];

        //Display Menu
        displayMenu(options, menuItems);

        // Set up the scanner
        Scanner in = new Scanner(System.in);

        //Get choice from user
        choice = in.nextInt();

        // Menu loop
        while (choice != EXIT) {

            //check choice value
            if (choice == options[0]) {
                this.selectCustomer();
            } else if (choice == options[1]) {
                this.selectSparePart();
            } else if (choice == options[2]) {
                this.SaveOrder();
            } else if (choice == options[3]) {
                this.display();
            }

            // Display menu again
            displayMenu(options, menuItems);

            //Get choice from user
            choice = in.nextInt();
        }
    }
    private void selectSparePart() {
        // similar to set customer
        sparePartsArrayList.forEach(System.out::println);
        System.out.println("Enter name of part");
        String sparePartName = input.nextLine();
        String selectedSparePart;
        //Sparepart switch
        switch (sparePartName) {
            case "apple" -> {
                System.out.println("apple selected");
                selectedSparePart = sparePartsArrayList.get(0);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SpareObj sparePartInMenu = new SpareObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                int options[] = {1, 2, 3, 4};
                String menuItems[] = {"Select a customer", "Select a part", "Save order - only once customer and parts selected", "Return to menu"};
                displayMenu(options, menuItems);
            }
            case "Banana" -> {
                System.out.println("Banana selected");
                selectedSparePart = sparePartsArrayList.get(1);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SpareObj sparePartInMenu = new SpareObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                int options[] = {1, 2, 3, 4};
                String menuItems[] = {"Select a customer", "Select a part", "Save order - only once customer and parts selected", "Return to menu"};
                displayMenu(options, menuItems);
            }
            case "Strawberry" -> {
                System.out.println("StrawBerry selected");
                selectedSparePart = sparePartsArrayList.get(2);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SpareObj sparePartInMenu = new SpareObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                int options[] = {1, 2, 3, 4};
                String menuItems[] = {"Select a customer", "Select a part", "Save order - only once customer and parts selected", "Return to menu"};
                displayMenu(options, menuItems);
            }
            case "Pear" -> {
                System.out.println("Pear selected");
                selectedSparePart = sparePartsArrayList.get(3);
                selectedSparePart = selectedSparePart.replace("[", "");
                selectedSparePart = selectedSparePart.replace("]", "");
                selectedSparePart = selectedSparePart.replace(" ", "");
                String[] selectedSparePartArray = selectedSparePart.split(",");

                SpareObj sparePartInMenu = new SpareObj(selectedSparePartArray[0], Boolean.valueOf(selectedSparePartArray[1]));
                spareParts.add(sparePartInMenu);
                int options[] = {1, 2, 3, 4};
                String menuItems[] = {"Select a customer", "Select a part", "Save order - only once customer and parts selected", "Return to menu"};
                displayMenu(options, menuItems);
            }
            default -> {
                System.out.println("not a option");
                selectSparePart();
            }
        }
    }
    private void selectCustomer(){
        customerArrayList.forEach(System.out::println);

    }
}
