import java.util.*;
public class Calculator_Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double num1,num2,result=0.0;
        char operator;

        System.out.print("Enter 1st number: ");
        num1 = sc.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = sc.next().charAt(0);

        System.out.print("Enter 2nd number: ");
        num2 = sc.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
            case '^':
                result = Math.pow(num1, num2);
                break;
            case  '%':
                result = num1 % num2;
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
        System.out.println("Result : " + result);
        sc.close();
    }
}
