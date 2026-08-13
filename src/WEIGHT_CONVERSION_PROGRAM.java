import java.util.*;

public class WEIGHT_CONVERSION_PROGRAM {
    public static void main(String[] args) {

        // WEIGHT CONVERSION PROGRAM

        Scanner sc = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.println("Choose an option: ");
        choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Please enter the weight in lbs");
            weight = sc.nextDouble();
            newWeight = weight * 0.453592;
            System.out.println("The new weight in kgs is: " + newWeight);
        }
        else if (choice == 2) {
            System.out.println("Please enter the weight in kgs");
            weight = sc.nextDouble();
            newWeight = weight / 0.453592;
            System.out.println("The new weight in lbs is: " + newWeight);
        }
        else {
            System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
