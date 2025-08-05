import java.util.*;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Rock Paper Scissors Game. \n Enter your choice to play with the computer");
		Scanner sc = new Scanner(System.in);
		
		String playAgain;
		int userWins = 0;
		int compWins = 0;
		int ties = 0;
		
		do {
		
		System.out.println("Enter Rock, Paper, Scissors: ");
		String userChoice = sc.nextLine();
		
		System.out.println("Your choice is: " + userChoice);
		
		if(!userChoice.equalsIgnoreCase("Rock") &&
				!userChoice.equalsIgnoreCase("Paper") &&
				!userChoice.equalsIgnoreCase("Scissors")
			) {
			System.out.println("Invalid input! Kindly enter Rock, Paper, Scissors");
		}else {
			String[] choices = {"Rock", "Paper", "Scissors"};
			
			Random random = new Random();
			
			int computerIndex = random.nextInt(3);
			String computerChoice = choices[computerIndex];
			System.out.println("Computer chose: " + computerChoice);
			
			if(userChoice.equalsIgnoreCase(computerChoice)) {
				System.out.println("It's a tie!");
				ties++;
			}else if(userChoice.equalsIgnoreCase("Rock") && computerChoice.equalsIgnoreCase("Scissors") ||
						userChoice.equalsIgnoreCase("Scissors") && computerChoice.equalsIgnoreCase("Paper") ||
						userChoice.equalsIgnoreCase("Paper") && computerChoice.equalsIgnoreCase("Rock")) {
				System.out.println("You Win!");
				userWins++;
			}else{
				System.out.println("Computer Wins!");
				compWins++;
				}	
		}
		
		System.out.println("Current Scores: ");
		 
		System.out.println("User : " + userWins);
		
		System.out.println("Computer: " + compWins);
		
		System.out.println("Ties: " + ties);
		
		
		System.out.println("\n Do you want to play again? yes/ no");
		
		playAgain = sc.nextLine();
		
		System.out.println();
		
		}while(playAgain.equalsIgnoreCase("yes"));
		
		System.out.println("\n Final Score Summary!!!");
		System.out.println("\n User Won : " + userWins + "time(s)");
		System.out.println("\n Comp Won : " + compWins + "time(s)");
		System.out.println("\n Ties: " + ties + "time(s)");
		
		System.out.println("Thank you for playing this game!");
	
		
		

	}

}
