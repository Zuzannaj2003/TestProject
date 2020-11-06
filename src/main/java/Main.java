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

        final int Minutes = 90;
        final int numOfLessons = 3;
        int privateStudyMins = Minutes * numOfLessons;
        int privateStudyHours = privateStudyMins / 60;
        int privateStudyRemainder = privateStudyMins % 60;

        System.out.println("You are expected to do " + privateStudyHours + " hours and " + privateStudyRemainder + " minutes of study");
    }
}

