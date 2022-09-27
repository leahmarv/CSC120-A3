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
    int spaces = 0;
    String userInput = "";
    String reply = "";
    String userLog[] = new String[rounds];
    String botLog[] = new String[rounds];
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!"};
    
    //String words[] = new String[100];

    for (int i = 0; i < rounds; i++)  {
      
      flag = 0;
      userInput = myScanner.nextLine();
      userLog[i] = userInput;
      spaces = userInput.replaceAll("[^ ]", "").length();
      String str[] = userInput.split(" "); 

      for (String element: str) {
        System.out.println(element);
      }

      for (int k = spaces; k < spaces; k++) {
        
        if (str[k].toLowerCase().contains("I")){
          //reply = userInput.replaceAll("I", "you");
            str[k] = "you";
            System.out.println(botLog[i]);
            flag = 1;
        }

        if (str[k].toLowerCase().contains("me")){
          reply = userInput.replaceAll("me", "you");
            str[k] = reply;
            //System.out.println(botLog[i]);
            flag = 1;
        }

        if (str[k].toLowerCase().contains("am")){
          reply = userInput.replaceAll("am", "are");
            str[k] = reply;
            //System.out.println(botLog[i]);
            flag = 1;
        }

        if (str[k].toLowerCase().contains("you")){
          reply = userInput.replaceAll("you", "I");
            str[k] = reply;
            //System.out.println(botLog[i]);
            flag = 1;
        }

        if (str[k].toLowerCase().contains("my")){
          reply = userInput.replaceAll("my", "your");
            str[k] = reply;
            //System.out.println(botLog[i]);
            flag = 1;
        }

        if (str[k].toLowerCase().contains("your")){
          reply = userInput.replaceAll("your", "my");
            str[k] = reply;
            //System.out.println(botLog[i]);
            flag = 1;
        }

      }

      if (flag == 1){
        for (int z = 0; z < str.length; z++)
          botLog[i] = botLog[i] + str[z] + " ";

      }

      if (flag == 0) {
        botLog[i] = randResponse[random.nextInt(randResponse.length)];
        //System.out.println(botLog[i]);
      }
      System.out.println(botLog[i]);
    }

    //Prints chat log
    System.out.println(flag);
    System.out.println("\nTRANSCRIPT:");
    System.out.println("Hi! What are you thinking about?");

    for (int c = 0; c < rounds; c++) {
      System.out.println(userLog[c]);
      System.out.println(botLog[c]);
    }


  }
}
