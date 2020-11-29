// Chelsea Vuata
// COMP163
// This program rolls 5 dice and gives you the total and average of your dice roll.
import java.util.Random;
class Yahtzee {
  public static void main(String[] args) {
    Random randGen = new Random();
    int diceRoll1;
    int diceRoll2;
    int diceRoll3;
    int diceRoll4;
    int diceRoll5;

    diceRoll1 = randGen.nextInt(6)+1;
    diceRoll2 = randGen.nextInt(6)+1;
    diceRoll3 = randGen.nextInt(6)+1;
    diceRoll4 = randGen.nextInt(6)+1;
    diceRoll5 = randGen.nextInt(6)+1;

    System.out.println("Rolling 5 dice...");
    System.out.print("You rolled ");
    System.out.print(diceRoll1);
    System.out.print(" ");
    System.out.print(diceRoll2);
    System.out.print(" ");
    System.out.print(diceRoll3);
    System.out.print(" ");
    System.out.print(diceRoll4);
    System.out.print(" ");
    System.out.println(diceRoll5);
    
    System.out.print("The total dice roll is ");
    System.out.println(diceRoll1 + diceRoll2 + diceRoll3 + diceRoll4 + diceRoll5);
    
    System.out.print("The average dice roll is ");
    System.out.println((double)(diceRoll1 + diceRoll2 + diceRoll3 + diceRoll4 + diceRoll5) / (double)(5));

  }
}