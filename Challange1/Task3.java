import java.util.Scanner;

class Task3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your height in cm:");
        double height = sc.nextDouble();

        System.out.println("Enter your weight in kg:");
        double weight = sc.nextDouble();

        double heightInMeter = height / 100;

        double bmi = weight / (heightInMeter * heightInMeter);

        System.out.println("Your BMI = " + bmi);

        sc.close();
    }
}