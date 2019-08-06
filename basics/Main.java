
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
  public static void main(String[] args) throws InterruptedException{
    System.out.println("Hello World");

    int catCount = 1;
    System.out.println("I own "+ catCount + " " + pluralize("cat", catCount) + ".");

    int dogCount = 0;
    System.out.println("I own "+ dogCount + " " + pluralize("dog", dogCount) + ".");

    int turtleCount = 2;
    System.out.println("I own "+ turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(1);

    clock();
  }

  // Pluralize function 
  public static String pluralize(String word, int number){
    // int dogCount = 1;
    if(number == 0 || number > 1){
      return word + "s";
    } else if (number == 1) {
      return word;
    }
  
    return word;   
  }

  //Flipping coins 
  public static void flipNHeads(int n){
    int totalNumberOfFlips = 0;
    int numberOfHeads = 0;

    while(numberOfHeads < n){
      double random = Math.random();
      totalNumberOfFlips++;
      if(random < 0.5){
        System.out.println("tails");
        numberOfHeads = 0;
      } else {
        System.out.println("heads");
        numberOfHeads++;
        System.out.println("it took " + totalNumberOfFlips + " flips to flip " + numberOfHeads + " heads in a row");
      }

    }
    
  }

  //Command line Clock
  public static void clock() throws InterruptedException{
    while(true)
     {
      LocalDateTime now = LocalDateTime.now(); 
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      System.out.println("local time now : " + time);
      Thread.sleep(1000);
    }
   

  }
}
