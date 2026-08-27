import java.util.Scanner;

class Task2 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 1st number:");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number:");
        int num2 = sc.nextInt();

        int addition = num1 + num2;
        int product = num1 * num2;
        int difference = num1 - num2;

        System.out.println("Addition = " + addition);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);

        sc.close();
    }
}