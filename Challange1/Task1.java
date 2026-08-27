import java.util.Scanner;
class Task1{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter your name: ");
        String name=sc.next();

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hi " + name + " you are " + age +" years old.");

    }
}