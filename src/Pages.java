import java.util.Scanner;

public class Pages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your age:");
        int age = -1;
        while (age < 0) {
            try {
                age = Integer.parseInt(scanner.nextLine());
            }
            catch (NumberFormatException e) {
                System.out.println("Please enter a valid number!");
            }
        }
        int minPages = 100-age;
        System.out.println(age + "-year olds should read at least " + minPages + " pages before giving up on a book.");
    }
}
