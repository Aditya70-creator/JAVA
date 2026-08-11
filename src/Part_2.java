import java.util.*;
public class Part_2 {
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name:");
        String name=sc.nextLine();

        System.out.print("Enter your age:");
        int age=sc.nextInt();

        System.out.print("What is your gpa: ");
        double gpa=sc.nextDouble();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent=sc.nextBoolean();

        System.out.println("Hello " + name);
        System.out.println("Your age is " + age);
        System.out.println("Your gpa is " + gpa);
        System.out.println("Student: " + isStudent);

        if(isStudent){
            System.out.println("You are enrolled as a student");
        }
        else{
            System.out.println("You are NOT enrolled as a student");
        }

        sc.close();
    }
}
