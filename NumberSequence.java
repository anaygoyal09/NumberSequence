// Anay Goyal
// 11/25/2024
// NumberSequence.java
import java.util.Scanner;
public class NumberSequence
{
	private int changeNum =-100;
	private int difference = -10;
	private String pattern = new String("");
	private int userNextNum;
	
	public static void main(String[] args)
	{
		NumberSequence NS = new NumberSequence();
		NS.sequence();
		NS.decidePattern();
		NS.questions();
		
		
	}
	public void sequence()
	{

		System.out.print("\n\n\n"); 
		System.out.println("Welcome to the sequence game! In this fun game you will be given"
		+ " 5 numbers from a sequence \nand you have to find the next number and the pattern\n");
		changeNum = (int)((Math.random()*21)-10);
		difference = (int)((Math.random()*10)+1);
		for(int i = 1; i<=5; i++)
		{
			System.out.print(changeNum+",");
			changeNum = changeNum+difference;
		}
		System.out.print("_");
	}
	public void decidePattern()
	{
		pattern = "add " + difference; 
	}
	public void questions()
	{
		Scanner in = new Scanner(System.in);
		int numTries = 0;
		System.out.print("\nWhats the next Number? ");
		userNextNum = in.nextInt();
		while(userNextNum != changeNum || numTries != 3)
		{
			
			System.out.print("Try again. " + userNextNum +" is not the next number. What's the next number?");
			userNextNum = in.nextInt();
			numTries++;
		}
		
		
		
		
		
	}
	
}
