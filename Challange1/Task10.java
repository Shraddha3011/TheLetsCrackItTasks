import java.util.Scanner;

class Task10 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int total = 0;
        int num = 1;

        while (num != 0) {

            System.out.print("Enter a number or Enter a number (0 to stop): ");
            num = sc.nextInt();

            total = total + num;
        }

        System.out.println("Final Total = " + total);

        sc.close();
    }
}