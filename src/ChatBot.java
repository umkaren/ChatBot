import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        greetUser(scanner);
        String userName = repeatName(scanner);
        guessAge(scanner, userName);
        count(scanner);
        test(scanner);
    }
    public static void greetUser(Scanner scanner) {
        System.out.println("Hi! What's ya name?");
        String userName = scanner.nextLine();
        System.out.println("Nice to meet ya, " + userName + "!");
    }
    public static String repeatName(Scanner scanner) {
        System.out.println("...I'm sorry. I have a short memory. Can you repeat your name again?");
        String repeatName = scanner.nextLine();
        System.out.println("Awesome! I'll remember it this time, " + repeatName + ".");
        return repeatName;
    }
    public static int guessAge(Scanner scanner, String name) {
        System.out.println("Let's get to know you. I want to guess your age. What year were you born in?");
        int birthYear = scanner.nextInt();
        scanner.nextLine(); //allows line 30 to be read
        int age = 2023 - birthYear;
        System.out.println("I think you are " + age + " years old. Is that correct? Yes or no.");
        String answer = scanner.nextLine();

        while (!answer.equalsIgnoreCase("yes")) {
            System.out.println("I guess I miscalculated.");
            age = 2023 - birthYear - 1;
            System.out.println("Maybe your birthday hasn't passed yet so you should be " + age + " years old.");
            System.out.println("Is that correct now? Yes or no.");
            answer = scanner.nextLine();
        }
        return age;
    }
    public static void count(Scanner scanner) {
        System.out.println("Okay, now that I've gotten to know you more, let's do something fun!");
        System.out.println("Enter a number and I'll do the count for you.");
        int number = scanner.nextInt();
        System.out.println("Oooh, challenging. Here's the count to " + number + ": ");
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void test(Scanner scanner) {
        System.out.println("Since you've gotten this far, let's test your Java knowledge bank.");
        System.out.println("Which keyword specifies a method should not have a return value?");
        System.out.println("a. abyss");
        System.out.println("b. rapture");
        System.out.println("c. null");
        System.out.println("d. void");

        String answer = scanner.next();
        while (!answer.equalsIgnoreCase("c")) {
            System.out.println("Wowza, you should hit the books more. That's incorrect. Please try again.");
            answer = scanner.next();
        }
        System.out.println("Congrats on your big brain! You passed!");
    }
}
