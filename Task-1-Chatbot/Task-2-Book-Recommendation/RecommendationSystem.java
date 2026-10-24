import java.util.Scanner;

public class RecommendationSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("     BOOK RECOMMENDATION SYSTEM");
        
        System.out.println("\nChoose your favorite book category:");
        System.out.println("1. Fiction");
        System.out.println("2. Mystery");
        System.out.println("3. Self-Help");
        System.out.println("4. Science");

        System.out.print("\nEnter your choice (1-4): ");
        int choice = sc.nextInt();

        if (choice == 1) {

            System.out.println("\n===== RECOMMENDED FICTION BOOKS =====");

            System.out.println("\n1. The Fault in Our Stars");
            System.out.println("   Author: John Green");
            System.out.println("   Description: A story about love, life, and hope.");

            System.out.println("\n2. The Jungle Book");
            System.out.println("   Author: Rudyard Kipling");
            System.out.println("   Description: Stories about a boy growing up in the jungle.");

            System.out.println("\n3. The Book Thief");
            System.out.println("   Author: Markus Zusak");
            System.out.println("   Description: A story set in Germany during World War II.");

        } else if (choice == 2) {

            System.out.println("\n===== RECOMMENDED MYSTERY BOOKS =====");

            System.out.println("\n1. The Girl with the Dragon Tattoo");
            System.out.println("   Author: Stieg Larsson");
            System.out.println("   Description: A mystery involving a journalist and a hacker.");

            System.out.println("\n2. The Da Vinci Code");
            System.out.println("   Author: Dan Brown");
            System.out.println("   Description: A mystery involving secret codes and historical clues.");

            System.out.println("\n3. And Then There Were None");
            System.out.println("   Author: Agatha Christie");
            System.out.println("   Description: A suspenseful mystery about ten strangers on an island.");

        } else if (choice == 3) {

            System.out.println("\n===== RECOMMENDED SELF-HELP BOOKS =====");

            System.out.println("\n1. Deep Work");
            System.out.println("   Author: Cal Newport");
            System.out.println("   Description: Explains how to focus deeply and work effectively.");

            System.out.println("\n2. The Power of Your Subconscious Mind");
            System.out.println("   Author: Joseph Murphy");
            System.out.println("   Description: Discusses the role of the subconscious mind in daily life.");

            System.out.println("\n3. Ikigai");
            System.out.println("   Author: Hector Garcia and Francesc Miralles");
            System.out.println("   Description: Explores Japanese ideas about purpose and a meaningful life.");

        } else if (choice == 4) {

            System.out.println("\n===== RECOMMENDED SCIENCE BOOKS =====");

            System.out.println("\n1. The Theory of Everything");
            System.out.println("   Author: Stephen Hawking");
            System.out.println("   Description: Explores major ideas about the universe.");

            System.out.println("\n2. Astrophysics for People in a Hurry");
            System.out.println("   Author: Neil deGrasse Tyson");
            System.out.println("   Description: Introduces important concepts in astrophysics.");

            System.out.println("\n3. The Gene: An Intimate History");
            System.out.println("   Author: Siddhartha Mukherjee");
            System.out.println("   Description: Explores the history and science of genes.");

        } else {

            System.out.println("\nInvalid choice!");
            System.out.println("Please select a number between 1 and 4.");

        }

        System.out.println("\nThank you for using Book Recommendation System!");

        sc.close();
    }
}