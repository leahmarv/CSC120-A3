import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    Scanner myScanner = new Scanner(System.in);
    Random random = new Random();     

    System.out.println("How many rounds would you like the conversation to be?");

    int rounds = myScanner.nextInt();
    System.out.println(myScanner.nextLine());

    String answer = "";
    String userLog[] = new String[rounds];
    String botLog[] = new String[rounds];
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};

    for (int i = 0; i < rounds; i++)  {
      botLog[i] = randResponse[random.nextInt(randResponse.length)];

      System.out.println(botLog[i]);
      answer = myScanner.nextLine();
      answer = answer.replaceAll("I", "you");
      userLog[i] = answer;

      System.out.println("done");
    }

    //Prints chat log
    System.out.println("TRANSCRIPT:");

    for (int c = 0; c < rounds; c++) {
      System.out.println(botLog[c]);
      System.out.println(userLog[c]);
    }


  }
}
