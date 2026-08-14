import java.util.Random;
import java.util.Scanner;
public class NUMBER_GUESSING_GAME {
    public static void main(String[] args) {

        // NUMBER GUESSING GAME

        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        int guess,attempts=0;
        int randomNumber = random.nextInt(1,101);

        System.out.println("Number Guessing Game");
        System.out.println("Please enter your guess between 1-100 ");

        do{
            System.out.print("Enter a guess: ");
            guess = sc.nextInt();
            attempts++;

            if(guess<randomNumber){
                System.out.println("TOO LOW! Try again");
            }
            else if(guess>randomNumber){
                System.out.println("TOO HIGH! Try again");
            }
            else{
                System.out.println("CORRECT! The number was " + randomNumber);
                System.out.println("# of attempts: " + attempts);
            }

        }while(guess!=randomNumber);

        System.out.println("You have won");

        sc.close();
    }
}
