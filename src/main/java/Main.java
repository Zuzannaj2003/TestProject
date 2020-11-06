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

        Scanner input = new Scanner( System.in );
        System.out.println("Hello new students!");
        System.out.println("How would you describe yourself?");
        String description = input.next();
        System.out.println("How tall are you in metres?");
        String height = input.next();
        System.out.println("You like the course so far?");
        String course = input.next();
        System.out.println("How old are you?");
        String age = input.next();

    }
}

