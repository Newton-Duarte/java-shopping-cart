import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String titlePrefix = "**********";
        String title = "Shopping Cart";

        String item = "Pizza";
        double price = 19.99;
        char currency = '$';
        int quantity;
        double total;

        Scanner scanner = new Scanner(System.in);


        System.out.println(titlePrefix + " " + title + " " + titlePrefix);

        System.out.print("Would you like to buy pizza? (yes/no) ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.print("How many would like? " + "(" + currency + price + " each) ");
            quantity = scanner.nextInt();
            total = price * quantity;

            System.out.println("\nYou have bought " + quantity + " " + item + "/s");
            System.out.println("Your total is " + currency + total);
        } else {
            System.out.println("That's Ok! Thank you.");
        }

        scanner.close();
    }
}
