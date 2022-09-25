import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    Scanner myScanner = new Scanner(System.in);
    Random random = new Random();     

    System.out.println("How many rounds would you like the conversation to be?");

    int rounds = myScanner.nextInt();

    //System.out.println("Hi! What's up?");

    String userLog[] = new String[rounds];
    String botLog[] = new String[rounds];
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};
    
    int i = 0;
    while(i < rounds) {
      userLog[i] = myScanner.nextLine();
      botLog[i] = randResponse[random.nextInt(randResponse.length)];
      //scanner input should happen here
      System.out.println(botLog[i]);
      System.out.println("done");
      i++;
      //scanner input is happening here
    }

    //Prints chat log
    System.out.println("TRANSCRIPT:");
    int c = 0;
    while(c < rounds) {
      System.out.println(botLog[c]);
      System.out.println(userLog[c]);
      c++;
    }


  }
}
