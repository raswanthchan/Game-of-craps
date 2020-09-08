//class Craps
/*
 * Two dice are thrown - each have the numbers 1 to 6 (separate random number generators, possible sums between 2 and 12 inclusive)
 * How do you win? Roll a 7 or an 11 on the first roll. The game ends.
 * If you roll a 4, 5, 6, 8, 9, or 10 on the first roll, this becomes your 'mark'. You can win if you are able to roll it again.
 * How do you lose? Roll a 2, 3, or a 12 on the first roll and you'll 'Crap out' (lose). The game ends.
 * If you roll a 7 before you roll your 'mark' (after the first roll) you lose. The game ends.
 * Write a program that will simulate this game. No user input is required.
 */
import java.util.Random; 
public class Craps{ //start class 
  
  public static void main(String[] args){
    Random r = new Random(); 
    final int low = 1, high = 6;
    int rollCount = 0;
    boolean gameOver = false;
    int diceA = 0, diceB = 0, total = 0; 
    int mark = 0;
    //categorize the data
    System.out.println("+++++++++++++++++++ Welcome to the GAME OF CRAPS ++++++++++++++++++++"); 
    do
    {
      diceA = r.nextInt(high - low + 1) + low; 
      diceB = r.nextInt(high - low + 1) + low;
      total = diceA + diceB; 
      rollCount++;
      System.out.println("roll " + "#" + rollCount + " is" + " a(n) " + total); 
      if (rollCount == 1) {
        if (total == 7 || total == 11) {
          System.out.println("You win!");
          gameOver = true;
        } 
        else if ( total == 2 || total == 3 || total == 12) {
          System.out.println("Craps! You lose!");
          gameOver = true;
        }
        else {
          mark = total;
          System.out.println("point: " + mark);
        }
      } else {
        if (total == 7) {
          System.out.println("Craps! You lose!");
          gameOver = true;  
        }
        else if (mark == total) {
          System.out.println("You win!");
          gameOver = true;
        }      
      }
    } while (!gameOver); 
    System.out.println("+++++++++++++++++++ Game Over. Play again!! +++++++++++++++++++++++++"); 
  }
} //end class 
