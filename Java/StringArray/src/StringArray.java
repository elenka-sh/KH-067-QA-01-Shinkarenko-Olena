import java.util.Scanner;

public class StringArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(" Please Input not less then three words");
        String names = sc.nextLine();
        String[] StringArray = names.split(", ");
        for (String name : StringArray) {
            System.out.println(name);
        }

        for (int n = 0; ; n++) {

            System.out.println("""
                    Chose variant
                    1 - max length
                    2 - start with
                    3 - end with
                    4 - contains
                    0 - exit""");
            int variant = sc.nextInt();
            if (variant == 0) {
                System.out.println("You leave the program");
                break;
            } else {
                switch (variant) {
                    case 1:
                        int result = StringArray[0].length();
                        for (int i = 1; i < StringArray.length; i++) {
                            if ((result < StringArray[i].length())) {
                                result = StringArray[i].length();
                            }
                        }
                        System.out.println(result);
                        break;
                    case 2:
                        System.out.println("Input the first letter of word");
                        Scanner start = new Scanner(System.in);
                        String enterCharStart = start.nextLine();
                        System.out.println("You can see words witt the first letter of it");
                        for (String i : StringArray) {
                            if (i.startsWith(enterCharStart)) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 3:
                        System.out.println("Input the last letter of word");
                        Scanner end = new Scanner(System.in);
                        String enterCharEnd = end.nextLine();
                        System.out.println("You can see words witt the last letter of it");
                        for (String i : StringArray) {
                            if (i.endsWith(enterCharEnd)) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 4:
                        System.out.println("Input the part of word");
                        Scanner part = new Scanner(System.in);
                        String enterPart = part.nextLine();
                        System.out.println("You can see words witt the part of it");
                        for (String i : StringArray) {
                            if (i.contains(enterPart)) {
                                System.out.println(i);
                            }
                        }
                        break;
                    case 0: {
                        System.out.println("Work is finished");
                    }
                    break;
                }
            }
        }
    }
}