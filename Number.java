
import java.util.Scanner;
import java.util.Random;

public class Number {
	public final static Random rand = new Random(); //Creates "rand" as a function
	public final static int numbertoGuess = rand.nextInt(20); //numberToGues is a integer between 1 and 20
	public static int tries = 0; //Tries. Duh :P
	public final static Scanner input = new Scanner(System.in); //input system

	public static String question(){
		String ask = "Hello! Guess my number between 1 and 20";
		return ask; 
	}
}

class Game{
	public static void main(String[] args){
		boolean win = false; // used in the loop later because the player hasn't "won" yet, so its "false"
		
		while (win == false){
			System.out.println(Number.question());
			int guess = Number.input.nextInt(); //makes Number.input a local int variable So it can calculate the number
												//to se if its greater/lower/equal to the random number
			Number.tries++; //every time some makes a guess, this adds 1 to Number.tries
			
			if (guess == Number.numbertoGuess){
				Number.tries--; //Takes one away because you got the answer right so it doesn't add 1 to Number.tries
				win = true;	//Sets boolean "win" to "true" to break out of the "while loop" because the player "wins"
			}
			else if (guess > Number.numbertoGuess){
				System.out.println(guess + " was too high"); //Go figure?
			}
			else if (guess < Number.numbertoGuess){
				System.out.println(guess + " was too low");//Hey, you smell.
			}
			
		}
		//outside the loop, doesn't appear until you break out the while loop
		//Its just stats e.g the number to guess and how many tries it took
		System.out.println("You Win!");
		System.out.println("The number was " + Number.numbertoGuess);
		System.out.println("It took you " + Number.tries + " tries!");

		}
	}
	
	
	
	
	
