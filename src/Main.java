// ============================================================
// Main.java
// Purpose : Entry point and menu system for the Bakery
//           Inventory & Management System
// Author  : Jonathan
// ============================================================

public class Main {

    // ==========================================================
    // CONSTANT: total number of menu options
    // Update this if menu options are added or removed
    // ==========================================================
    private static final int TOTAL_OPTIONS = 7;


    // ==========================================================
    // main()
    // Purpose : Program entry point — JVM starts here
    //           Runs the menu loop until user exits
    // ==========================================================
    public static void main(String[] args) {

        printWelcome();

        // Test DB connection on startup
        // Warns user immediately if DB is unreachable
        DBConnection.testConnection();
        InputHelper.pressEnterToContinue();

        int choice;

        // do-while ensures menu always shows at least once
        do {
            printMenu();

            // Delegates input reading to InputHelper (Giane's file)
            choice = InputHelper.getMenuChoice(TOTAL_OPTIONS);

            // Routes choice to the correct CRUD operation
            handleChoice(choice);

        } while (choice != TOTAL_OPTIONS); // exit when user picks 7
    }


    // ==========================================================
    // handleChoice()
    // Purpose : Routes the user's menu selection to the correct
    //           method in CRUDOperations (Ken's file)
    // Params  : choice → the validated integer from the menu
    // ==========================================================
    private static void handleChoice(int choice) {

        switch (choice) {

            case 1:
                // CREATE — Add a new product
                CRUDOperations.insertProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 2:
                // READ ALL — View all products
                CRUDOperations.viewAllProducts();
                InputHelper.pressEnterToContinue();
                break;

            case 3:
                // READ ONE — Search product by ID
                CRUDOperations.searchProductById();
                InputHelper.pressEnterToContinue();
                break;

            case 4:
                // UPDATE — Modify an existing product
                CRUDOperations.updateProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 5:
                // DELETE — Remove a product permanently
                CRUDOperations.deleteProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 6:
                // TRANSACTION — Restock a product (commit/rollback)
                CRUDOperations.restockProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 7:
                // EXIT — Clean up and close program
                printGoodbye();
                InputHelper.closeScanner(); // close Scanner resource
                break;

            default:
                // Should never reach here due to InputHelper validation
                System.out.println("  [!] Invalid choice. Please try again.");
                break;
        }
    }


    // ==========================================================
    // printWelcome()
    // Purpose : Displays the system header on startup
    //           Shown once when the program first launches
    // ==========================================================
    private static void printWelcome() {

        clearScreen();

        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════════════╗");
        System.out.println("  ║         BAKERY INVENTORY & MANAGEMENT SYSTEM             ║");
        System.out.println("  ║          Advanced Computer Programming — Java            ║");
        System.out.println("  ╚══════════════════════════════════════════════════════════╝");
        System.out.println();
    }


    // ==========================================================
    // printMenu()
    // Purpose : Displays the main menu options each loop cycle
    // ==========================================================
    private static void printMenu() {
// ============================================================
// Main.java
// Purpose : Entry point and menu system for the Bakery
//           Inventory & Management System
// Author  : Jonathan
// ============================================================

public class Main {

    // ==========================================================
    // CONSTANT: total number of menu options
    // Update this if menu options are added or removed
    // ==========================================================
    private static final int TOTAL_OPTIONS = 7;


    // ==========================================================
    // main()
    // Purpose : Program entry point — JVM starts here
    //           Runs the menu loop until user exits
    // ==========================================================
    public static void main(String[] args) {

        printWelcome();

        // Test DB connection on startup
        // Warns user immediately if DB is unreachable
        DBConnection.testConnection();
        InputHelper.pressEnterToContinue();

        int choice;

        // do-while ensures menu always shows at least once
        do {
            printMenu();

            // Delegates input reading to InputHelper (Giane's file)
            choice = InputHelper.getMenuChoice(TOTAL_OPTIONS);

            // Routes choice to the correct CRUD operation
            handleChoice(choice);

        } while (choice != TOTAL_OPTIONS); // exit when user picks 7
    }


    // ==========================================================
    // handleChoice()
    // Purpose : Routes the user's menu selection to the correct
    //           method in CRUDOperations (Ken's file)
    // Params  : choice → the validated integer from the menu
    // ==========================================================
    private static void handleChoice(int choice) {

        switch (choice) {

            case 1:
                // CREATE — Add a new product
                CRUDOperations.insertProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 2:
                // READ ALL — View all products
                CRUDOperations.viewAllProducts();
                InputHelper.pressEnterToContinue();
                break;

            case 3:
                // READ ONE — Search product by ID
                CRUDOperations.searchProductById();
                InputHelper.pressEnterToContinue();
                break;

            case 4:
                // UPDATE — Modify an existing product
                CRUDOperations.updateProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 5:
                // DELETE — Remove a product permanently
                CRUDOperations.deleteProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 6:
                // TRANSACTION — Restock a product (commit/rollback)
                CRUDOperations.restockProduct();
                InputHelper.pressEnterToContinue();
                break;

            case 7:
                // EXIT — Clean up and close program
                printGoodbye();
                InputHelper.closeScanner(); // close Scanner resource
                break;

            default:
                // Should never reach here due to InputHelper validation
                System.out.println("  [!] Invalid choice. Please try again.");
                break;
        }
    }


    // ==========================================================
    // printWelcome()
    // Purpose : Displays the system header on startup
    //           Shown once when the program first launches
    // ==========================================================
    private static void printWelcome() {

        clearScreen();

        System.out.println();
        System.out.println("  ╔══════════════════════════════════════════════════════════╗");
        System.out.println("  ║         BAKERY INVENTORY & MANAGEMENT SYSTEM             ║");
        System.out.println("  ║          Advanced Computer Programming — Java            ║");
        System.out.println("  ╚══════════════════════════════════════════════════════════╝");
        System.out.println();
    }


    // ==========================================================
    // printMenu()
    // Purpose : Displays the main menu options each loop cycle
    // ==========================================================
    private static void printMenu() {

        System.out.println();
        System.out.println("  ┌──────────────────────────────────┐");
        System.out.println("  │           MAIN MENU              │");
        System.out.println("  ├──────────────────────────────────┤");
        System.out.println("  │  1.  Add New Product             │");
        System.out.println("  │  2.  View All Products           │");
        System.out.println("  │  3.  Search Product by ID      
