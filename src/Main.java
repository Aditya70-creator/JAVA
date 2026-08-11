public class Main {
    public static void main(String[] args){
        //This is my first java program
        /* Multi Line Comment*/
        System.out.println("I like Biriyani!");
        System.out.println("It's really good!");
        System.out.println("Buy me Biriyani!");
        System.out.println("");
        int age=19;
        int year=2026;
        int quantity=1;

        System.out.println("The year is " + year);

        double price =19999.99;
        double gpa=9.1;
        double temperature=-12.5;

        System.out.println("$" + price);

        char grade ='A';
        char symbol='!';
        char currency='$';

        System.out.println(currency);

        boolean isStudent=true;
        boolean forSale=false;
        boolean isOnline=true;

        System.out.println(isStudent);

        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student");
        }

        String name="Aditya Mitra";
        String food="Biriyani";
        String email="fake123@email.com";
        String car="Ferrari";
        String color="Blue";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + "years old");
        System.out.println("Your gpa is: " + gpa);
        System.out.println("Your average letter grade is: " + grade);

        System.out.println("Your choice is a " + color + " " + year + " " + car);
        System.out.println("The price is: " + currency + price);

        if(forSale) {
            System.out.println("There is a " + car + "for sale");
        }
        else{
            System.out.println("The " + car + " is not for sale");
        }
    }
}
