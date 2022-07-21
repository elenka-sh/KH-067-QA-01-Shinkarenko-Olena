import java.util.Scanner;

import static java.lang.System.in;

public class Example {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
//        System.out.println("Hello. What is your name?");
//        String name = sc.nextLine();
//        System.out.println(name);*/
//        System.out.println("Hello. Enter a");
        System.out.println("Enter a");
        int a = sc.nextInt();
        System.out.println("Enter b");
        int b = sc.nextInt();
        int i;
        i = a + b;
        System.out.println("Summa a+b = " + i);

    }
}
