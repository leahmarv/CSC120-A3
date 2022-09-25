import java.util.Scanner;
import java.util.Random;

class Conversation {

  public static void main(String[] arguments) {

    Scanner myScanner = new Scanner(System.in);
    Random random = new Random();     

    System.out.println("How many rounds would you like the conversation to be?");

    int rounds = myScanner.nextInt();

    System.out.println("Hi! What's up?");

    String userLog[] = {};
    String botLog[] = {};
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};
    
    int i = 0;
    while(i<rounds) {
      System.out.println(randResponse[random.nextInt(randResponse.length)]);
      i++;
    }
  }
}
