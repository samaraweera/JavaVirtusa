
import java.util.Scanner;

public class ReverseNumber {
	private static Scanner sc;
	
	public static void main(String[] args) {
		int Number, Reminder, Reverse;
		sc = new Scanner(System.in);
		
		System.out.println("\n Enter Number : ");
		Number = sc.nextInt();
		
		for(Reverse = 0; Number > 0; Number = Number/10) {
			Reminder = Number %10;
			Reverse = Reverse * 10 + Reminder;
		}
		System.out.format("\n Reverse of entered number is = %d\n", Reverse);
}
}

//Edited File

import java.util.Scanner;

public class Main
{
	
	public static void main(String[] args) {
	    
		int number, reminder, reverse;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Number : ");
		
		number = sc.nextInt();
		
		for(reverse = 0; number > 0; number = number/10) {
			reminder = number %10;
			reverse = reverse * 10 + reminder;
		}
		
		System.out.format("Reverse of entered number is = %d\n", reverse);
    }
}
