
import java.util.Scanner;
import java.util.Random;

public class Number {
	public final static Random rand = new Random(); 
	public final static int numbertoGuess = rand.nextInt(20); 
	public static int tries = 0; 
	public final static Scanner input = new Scanner(System.in); 

	public static String question(){
		String ask = "Hello! Guess my number between 1 and 20";
		return ask; 
	}
}

class Game{
	public static void main(String[] args){
		boolean win = false; 
		
		while (win == false){
			System.out.println(Number.question());
			int guess = Number.input.nextInt(); 
											
			Number.tries++; 
			
			if (guess == Number.numbertoGuess){
				Number.tries--;
				win = true;	
			}
			else if (guess > Number.numbertoGuess){
				System.out.println(guess + " was too high"); 
			}
			else if (guess < Number.numbertoGuess){
				System.out.println(guess + " was too low");
			}
			
		}
		System.out.println("You Win!");
		System.out.println("The number was " + Number.numbertoGuess);
		System.out.println("It took you " + Number.tries + " tries!");

		}
	}
	
	
	
	
	
