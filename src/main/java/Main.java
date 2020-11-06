import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String greeting = "Hello, world!";
        System.out.println(greeting);
        System.out.println(greeting.length());
        int number = 5;
        System.out.println(number);
        Scanner user_input = new Scanner(System.in);
        String word;
        System.out.print("Input a word: ");
        word = user_input.next();

        String sReverse = new StringBuilder(word).reverse().toString();
        System.out.println(sReverse);
    }
}

