import java.util.Scanner;

class Conversation {

  public static void main(String[] arguments) {

    Scanner myScanner = new Scanner(System.in);

    System.out.println("How many rounds would you like the conversation to be?");

    int rounds = myScanner.nextInt();
    System.out.println(rounds);
  }
}
