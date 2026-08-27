import java.util.Scanner;

/* Coders Aesthetic Cafe --> A step-by-step mini project that shows how a real Java program is built level by level, using only what 
 we've learned so far: variables, Scanner (user input), if-else, switch-case, and while loops. */
public class Cafe {
    public static void main(String[] args) {

        // Scanner lets our program read input typed by the user (like a keyboard listener)
        Scanner sc = new Scanner(System.in);

        // ================================================================
        // LEVEL 1: THE MENU BOARD
        // Concept used: variables + System.out.println
        // Goal: simply display the menu, like a board hanging in a cafe
        // ================================================================
        System.out.println("\n========== LEVEL 1: THE MENU BOARD ==========\n");
       
        System.out.println("===== Welcome to Coders Aesthetic Cafe =====");
        System.out.println("1. Samosa       Rs.15");
        System.out.println("2. Vada Pav     Rs.10");
        System.out.println("3. Cold Coffee  Rs.60");
        System.out.println("Level 1 done! The menu is on screen.");

        // ================================================================
        // LEVEL 2: TAKE THE ORDER
        // Concept used: Scanner.nextLine() -> reading text input from the user
        // Goal: ask the customer what they want (typed as a name, not a number)
        // ================================================================
        System.out.println("\n========== LEVEL 2: TAKE THE ORDER ==========");
        System.out.println("\nEnter the name of the food you want to order:");
        String orderName = sc.nextLine(); // stores whatever the user types as text (String)
        System.out.println("You Ordered: " + orderName);
        System.out.println("Level 2 done! We successfully took input from the user.");

        // ================================================================
        // LEVEL 3: IS IT AVAILABLE? (if-else)
        // Concept used: if-else -> making a decision based on a condition
        // Goal: check the entered item NUMBER against our menu and react accordingly
        // ================================================================
        System.out.println("\n========== LEVEL 3: IS IT AVAILABLE? (if-else) ==========");
        System.out.println("\n===== Welcome to Coders Aesthetic Cafe =====");
        System.out.println("1. Samosa       Rs.15");
        System.out.println("2. Vada Pav     Rs.10");
        System.out.println("3. Cold Coffee  Rs.60");

        System.out.print("Enter the item number: ");
        int itemNumber = sc.nextInt(); // stores a whole number (int)

        // if-else checks the value step by step, top to bottom
        if (itemNumber == 1) {
            System.out.println("Match found! Price: Rs.15");
        } else if (itemNumber == 2) {
            System.out.println("Match found! Price: Rs.10");
        } else if (itemNumber == 3) {
            System.out.println("Match found! Price: Rs.60");
        } else {
            System.out.println("No match found. Sorry, item not available today.");
        }
        System.out.println("\nLevel 3 done! We used if-else to make a decision.");

        // ================================================================
        // LEVEL 4: MENU NUMBER ORDERING (switch-case)
        // Concept used: switch-case -> a cleaner way to check multiple exact values
        // Goal: do the SAME check as Level 3, but with cleaner, faster code
        // ================================================================
        System.out.println("\n========== LEVEL 4: SWITCH-CASE UPGRADE ==========");
        System.out.println("\n------- Menu -------");
        System.out.println("1. Samosa       Rs.15");
        System.out.println("2. Vada Pav     Rs.10");
        System.out.println("3. Cold Coffee  Rs.60");

        System.out.print("Enter the item number: ");
        int itemId = sc.nextInt();

        // switch checks itemId against each "case" -> jumps straight to the match
        switch (itemId) {
            case 1:
                System.out.println("Case 1 matched! Price: Rs.15");
                break; // break stops the switch from checking further cases
            case 2:
                System.out.println("Case 2 matched! Price: Rs.10");
                break;
            case 3:
                System.out.println("Case 3 matched! Price: Rs.60");
                break;
            default:
                System.out.println("No case matched. Sorry, item not available today.");
        }
        System.out.println("Level 4 done! switch-case did the same job with cleaner code.");

        // ================================================================
        // LEVEL 5: ORDER MULTIPLE ITEMS (while loop)
        // Concept used: while loop -> repeating a block of code multiple times
        // Goal: let the customer order more than one item and calculate the total bill
        // ================================================================
        System.out.println("\n========== LEVEL 5: ORDER MULTIPLE ITEMS (while loop) ==========");
        System.out.println("\nHow many items do you want to order?");
        int numberOfItems = sc.nextInt(); // how many times the loop should repeat
        int totalPrice = 0; // keeps adding up as each item is ordered

        // The loop keeps running as long as numberOfItems is greater than 0
        while (numberOfItems > 0) {
            System.out.println("\n(Items left to order: " + numberOfItems + ")");
            System.out.print("Enter the item number: ");
            int itemNo = sc.nextInt();

            switch (itemNo) {
                case 1:
                    totalPrice = totalPrice + 15;
                    System.out.println("Added Samosa. Running total: Rs." + totalPrice);
                    break;
                case 2:
                    totalPrice = totalPrice + 10;
                    System.out.println("Added Vada Pav. Running total: Rs." + totalPrice);
                    break;
                case 3:
                    totalPrice = totalPrice + 60;
                    System.out.println("Added Cold Coffee. Running total: Rs." + totalPrice);
                    break;
                default:
                    System.out.println("Sorry, item not available today.");
            }
            numberOfItems--; // reduce the counter by 1 each loop, otherwise the loop never ends!
        }
        System.out.println("\nLevel 5 done! Loop finished because numberOfItems reached 0.");
        System.out.println("Total Bill (Level 5) = Rs." + totalPrice);

        // ================================================================
        // LEVEL 6: KEEP ORDERING TILL YOU'RE DONE
        // Concept used: while loop
        // 1 = Yes, 0 = No
        // ================================================================

        System.out.println("\n========== LEVEL 6: KEEP ORDERING TILL YOU'RE DONE ==========");

        int orderMore = 1;
        int finalTotal = 0;

        while (orderMore == 1) {

            System.out.println("\n===== CODERS AESTHETIC CAFE =====");
            System.out.println("1. Samosa       Rs.15");
            System.out.println("2. Vada Pav     Rs.10");
            System.out.println("3. Cold Coffee  Rs.60");

            System.out.print("Enter item number: ");
            int item = sc.nextInt();

            if (item == 1) {
                finalTotal = finalTotal + 15;
                System.out.println("Samosa added!");
            }
            else if (item == 2) {
                finalTotal = finalTotal + 10;
                System.out.println("Vada Pav added!");
            }
            else if (item == 3) {
                finalTotal = finalTotal + 60;
                System.out.println("Cold Coffee added!");
            }
            else {
                System.out.println("Item not available!");
            }

            System.out.println("Current Total: Rs." + finalTotal);

            System.out.print("Order more? 1 = Yes, 0 = No: ");
            orderMore = sc.nextInt();
        }

        System.out.println("\n========== ORDER COMPLETE ==========");
        System.out.println("Final Bill = Rs." + finalTotal);
        System.out.println("Thank you for visiting Coders Aesthetic Cafe!");

        sc.close(); // always close the Scanner when we're done taking input
    }
}