import java.util.Scanner;

class Task5 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int a = sc.nextInt();

        System.out.print("Enter 2nd number: ");
        int b = sc.nextInt();

        System.out.print("Enter 3rd number: ");
        int c = sc.nextInt();

        if (a >= b && a >= c) {
            System.out.println("Largest = " + a);
        } 
        else if (b >= a && b >= c) {
            System.out.println("Largest = " + b);
        } 
        else {
            System.out.println("Largest = " + c);
        }

        sc.close();
    }
}