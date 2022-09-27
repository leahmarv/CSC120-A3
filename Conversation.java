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
    String randResponse[] = {"How about that!", "Whoa, I didn't know that.", "Sounds cool!", "Okay then."};

    for (int i = 0; i < rounds; i++)  {
      
      flag = 0;
      answer = myScanner.nextLine();
      userLog[i] = answer;
      String str[] = answer.split(" ");

      //insert for loop

      for (int k = 0; k < str.length; k++) {

        if (str[k].equals("I")){
          str[k] = "you";
          flag = 1;
        } else if (str[k].equals("you")){
          str[k] = "I";
          flag = 1;
        } else if (str[k].equals("me")){
          str[k] = "you";
          flag = 1;
        } else if (str[k].equals("am")){
          str[k] = "are";
          flag = 1;
        } else if (str[k].equals("are")){
          str[k] = "am";
          flag = 1;
        } else if (str[k].equals("my")){
          str[k] = "your";
          flag = 1;
        } else if (str[k].equals("your")){
          str[k] = "my";
          flag = 1;
        }
      } 
      
      if (flag == 1){
        botLog[i] = str[0];

        for (int z = 1; z < str.length; z++) {
          botLog[i] = botLog[i] + " " + str[z];
        }
        botLog[i] = botLog[i] + "?";
        System.out.println(botLog[i]);
      }
      
      if (flag == 0) {
        botLog[i] = randResponse[random.nextInt(randResponse.length)];
        System.out.println(botLog[i]);
      }
    }

    //Prints chat log
    System.out.println("\nTRANSCRIPT:\nHi! What are you thinking about?");

    for (int c = 0; c < rounds; c++) {
      System.out.println(userLog[c]);
      System.out.println(botLog[c]);
    }


  }
}
