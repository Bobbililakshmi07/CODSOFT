import java.util.Scanner;

class GuessGame
{
	public static void main(String args[])
	{
		int answer,guess,i=0,chances=5;
		boolean won=false;

		answer = (int) (Math.random()*100) + 1;
		
		Scanner sc = new Scanner(System.in);
		
		while(i<chances)
		{
			System.out.print("\nEnter your guess: ");
			guess = sc.nextInt();
		
			if(guess==answer)
			{
				System.out.print("Congratulations! You are winner....");
				won = true;
				break;
			}
			else if(guess<answer && i<chances-1)
			{
				System.out.println("Clue: Your guess is low. Guess high!");
				System.out.println("Chances remaining = " + (chances-i-1));
			}
			else if(guess>answer && i<chances-1)
			{
				System.out.println("Clue: Your guess is high. Guess low!");
				System.out.println("Chances remaining = " + (chances-i-1));
			}

			i++;
		}

		if(!won)	System.out.print("\nYou've lost. Answer is " + answer);

		sc.close();
	}
}
