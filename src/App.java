import java.util.Scanner;

/**
 * Program to capitalize first letter of each word present in a string
 */
public class App {
    public static void camelCase(String string) {
        Scanner sc = new Scanner(string);
        StringBuilder upperCaseStr = new StringBuilder();
        while (sc.hasNext()) {
            String str = sc.next();
            upperCaseStr.append(Character.toUpperCase(str.charAt(0)) + str.substring(1) + " ");
        }
        System.out.println(upperCaseStr);

    }

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a sentence");

        String str = scan.nextLine();

        App.camelCase(str);
    }
}
