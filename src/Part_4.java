import java.util.Random;
public class Part_4 {
    public static void main(String[] args) {

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        number1 = random.nextInt(1, 101);
        number2 = random.nextInt(1, 101);
        number3 = random.nextInt(1, 101);
        number4 = random.nextDouble();
        isHeads = random.nextBoolean();

        System.out.println(number1 + " " + number2 + " " + number3 + " " + number4 + " " + isHeads);

        if(isHeads){
            System.out.println("HEADS");
        }
        else{
            System.out.println("TAILS");
        }
    }
}
