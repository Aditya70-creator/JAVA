import java.util.*;
public class Part_3 {
    public static void main(String[] args) {
        // Calculate area of a rectangle

        double width=0;
        double height=0;
        double area=0;

        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the width: ");
        width=sc.nextDouble();

        System.out.print("Enter the height: ");
        height=sc.nextDouble();

        area=width*height;
        System.out.println("The area of is " + area + " cm^2");

        sc.close();
    }
}
