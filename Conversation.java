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

    int flag = 0;

    String answer = "";
    String userLog[] = new String[rounds];
    String botLog[] = new String[rounds];
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};

    for (int i = 0; i < rounds; i++)  {
      
      answer = myScanner.nextLine();
      userLog[i] = answer;
      String str[] = answer.split(" ");

      //insert for loop

      for (int k = 0; k < str.length; k++) {

        if (str[k].contains("I")){

          str[k] = "you";
          //System.out.println(botLog[i]);

          flag = 1;

        }
      } 
      
      if (flag == 1){

        botLog[i] = str[0];

        for (int z = 1; z < str.length; z++) {
          botLog[i] = botLog[i] + " " + str[z];
        }
        System.out.println(botLog[i]);
      }
      
      if (flag == 0) {
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
