
public class Part_5 {
    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Math.E);
        double result;
        result = Math.pow(2, 10);
        System.out.println(result);
        System.out.println(Math.abs(-5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.round(3.14));
        System.out.println(Math.ceil(3.14));
        System.out.println(Math.floor(3.99));
        System.out.println(Math.max(10, 20));
        System.out.println(Math.min(5, 10));

        // printf() = is a method used to format output

        // %[flags][width][.precision][specifier-character]

        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello %s", name);
        System.out.printf("\nYour name starts with a %c\n", firstLetter);
        System.out.printf("Your age %d years old\n", age);
        System.out.printf("Your height is %f inches\n", height);
        System.out.printf("Employed: %b\n", isEmployed);

        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1);
        System.out.printf("%04d\n", id2);
        System.out.printf("%04d\n", id3);
        System.out.printf("%04d\n", id4);

        System.out.printf("%4d\n", id1);
        System.out.printf("%4d\n", id2);
        System.out.printf("%4d\n", id3);
        System.out.printf("%4d\n", id4);

        System.out.printf("%-4d\n", id1);
        System.out.printf("%-4d\n", id2);
        System.out.printf("%-4d\n", id3);
        System.out.printf("%-4d\n", id4);
    }
}
