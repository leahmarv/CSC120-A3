import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    Scanner myScanner = new Scanner(System.in);
    Random random = new Random();     

    System.out.println("How many rounds would you like the conversation to be?");

    int rounds = myScanner.nextInt();

    System.out.println("Hi! What are you thinking about?");

    System.out.println(myScanner.nextLine());

    String answer = "";
    String reply = "";
    String userLog[] = new String[rounds];
    String botLog[] = new String[rounds];
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};

    for (int i = 0; i < rounds; i++)  {
      
      answer = myScanner.nextLine();
      userLog[i] = answer;

      if (answer.contains("I") || answer.contains("I ")){

        reply = answer.replaceAll("I", "you");
        botLog[i] = reply;
        System.out.println(botLog[i]);

      } else {
        botLog[i] = randResponse[random.nextInt(randResponse.length)];
        System.out.println(botLog[i]);
      }
    }

    //Prints chat log
    System.out.println("TRANSCRIPT:");

    for (int c = 0; c < rounds; c++) {
      System.out.println(botLog[c]);
      System.out.println(userLog[c]);
    }


  }
}
