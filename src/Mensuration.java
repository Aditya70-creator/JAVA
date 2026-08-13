import java.util.*;

public class Mensuration {
    public static void main(String[] args) {

        //HYPOTENUSE  c^2 = math.sqrt(a^2 + b^2);
        // circumference = 2 * math.pi * radius;
        // area = math.pi * math.pow(radius, 2);
        // volume = (4.0 / 3.0) * math.pi * math.pow(radius, 3);

        Scanner sc = new Scanner(System.in);

        double a;
        double b;
        double c;
        double radius=0.0;
        double circumference;
        double area;
        double volume;

        System.out.print("Enter the length of side A: ");
        a=sc.nextDouble();

        System.out.print("Enter the length of side B: ");
        b=sc.nextDouble();

        c=Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        System.out.println("HYPOTENUSE: " +c);

        System.out.print("Enter the radius: ");
        radius=sc.nextDouble();

        circumference = 2 * Math.PI * radius;
        System.out.printf("Circumference: %.1fcm\n", circumference);

        area = Math.PI * Math.pow(circumference, 2);
        System.out.printf("Area: %.1fcm^2\n", area);

        volume = area * circumference;
        System.out.printf("VOLUME: %.1fcm^3\n", volume);

        sc.close();
    }
}
