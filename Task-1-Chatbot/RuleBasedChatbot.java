import java.util.Scanner;

public class RuleBasedChatbot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bot: Type Bye to end the conversation.");

        while (true)
        {

        System.out.print("You: ");
        String input = scanner.nextLine().toLowerCase();

        if (input.contains("hello") || input.contains("hi") || input.contains("hey")) {
            System.out.println("Bot: Hello! How can I help you?");
        }

        else if (input.contains("how are you")) {
            System.out.println("Bot: I'm doing great! Thanks for asking.");
        }

        else if (input.contains("your name") || input.contains("introduce yourself")|| input.contains("who are you")) {
            System.out.println("Bot: I am a simple rule-based chatbot.");
        }

        else if (input.contains("help")) {
            System.out.println("Bot: Sure! I can help you with basic queries.");
        }

        else if (input.contains("thank")) {
            System.out.println("Bot: You're welcome!");
        }

        else if (input.contains("bye") || input.contains("exit")) {
            System.out.println("Bot: Goodbye! Have a great day!");
            break;
        }

        else {
            System.out.println("Bot: Sorry, I don't understand that yet.");
        }
    }

        scanner.close();
    }
}cd 