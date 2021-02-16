import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        // getting user input for string

        Scanner input = new Scanner(System.in);
        System.out.print("Enter string: ");
        String org_str = input.next();

        // using If/else to check if user enter string not char
        if (org_str.length() <= 1) {
            System.out.print("Enter valid string: ");
            org_str = input.next();
        }

        // Convert user input string to lower case
        String str = org_str.toLowerCase();

        // Printing an empty line
        System.out.println();

        // create empty variable to store reverse string
        String reverse = "";

        // using for loop to reserve the user provided string
        // and storing in reverse variable
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse = reverse + str.charAt(i);
        }

        // printing user string & reserve string
        System.out.println(" ~~ User string: " + str);

        // printing an empty line
        System.out.println();

        // using if/else statement to compare user string & reserve string and printing
        // appropriate message
        if (reverse.equals(str)) {
            System.out.println(org_str + ": This string is a palindrome");

        } else {
            System.out.println(org_str + ": This string is not a palindrome");
        }
    }
}