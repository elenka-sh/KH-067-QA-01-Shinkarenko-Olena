import java.util.Scanner;

   public class Main {
     //main class declaration
     // System.out.println("My first program");*/
    public  static void  main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Hello. What is your name?");
    String name = sc.nextLine();
    System.out.println("Where are you live  " + name + "?");
    String adress = sc.nextLine();
    System.out.println((adress));
    System.out.println( name + "; " + adress);
    System.out.println("Nice to meet you " + name + " from " + adress);
}
}
