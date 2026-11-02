import java.util.Scanner;

public class StoryTeller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("You wake up in a dark forest.");
        System.out.println("There are two paths ahead: LEFT or RIGHT.");
        System.out.print("Which path do you choose? ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("left")) {
            System.out.println("You find a small stream and follow it to a village. You're safe!");
        } else if (choice.equalsIgnoreCase("right")) {
            System.out.println("You hear a growl in the bushes...");
            System.out.print("Do you RUN or HIDE? ");
            String choice2 = scanner.nextLine();

            if (choice2.equalsIgnoreCase("run")) {
                System.out.println("You escape just in time and find your way home!");
            } else if (choice2.equalsIgnoreCase("hide")) {
                System.out.println("You hide behind a tree. It was just a rabbit. Phew!");
            } else {
                System.out.println("You froze in fear and the story ends here.");
            }
        } else {
            System.out.println("You stood still, confused, and got lost forever.");
        }

        scanner.close();
    }
}