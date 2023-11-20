package fizzbuzz;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean flag = true;
		
		//This is the winning number
		int max = 10001;
		
		//Iterates every time the player inputs
		int count = 0;
		
		
		//Loop evaluates whether input is acceptable by the rules of Fizz Buzz
		while (flag) {
			
			System.out.print("enter number or word:");
			count++;
			
			String line = scan.nextLine();
			
			//Makes input case-insensitive
			line = line.toLowerCase();
			
			
			
			if (count % 15 == 0 && !line.equals("fizz buzz")) { //Check for divisible by 15
				flag = false;
				System.out.println("you are eliminated"); //If it is divisible by 15 and the player types the wrong word, then they lose
			
			
			} else if (count % 5 == 0 && !line.equals("buzz") && count % 15 != 0) { //Check for divisible by 5
				flag = false;
				System.out.println("you are eliminated");
			
			
			} else if (count % 3 == 0 && !line.equals("fizz") && count % 15 != 0 ) { //Check for divisible by 3
				flag = false;
				System.out.println("you are eliminated");
			
			
			} else if (count % 3 != 0 && count % 5 != 0 && count % 15 != 0) { //Handles when numbers are not divisible by 3, 5 or 15
				try {
					int num = Integer.parseInt(line); 
					if (count != num) { //This handles if the player types a number and it is the wrong number, so they lose
						flag = false;
						System.out.println("you are eliminated");
						
						
					} else if(num==max) { //If the player reaches the winning number, they win.
						flag = false;
						System.out.println("you win");
					}
				} catch (NumberFormatException e) { //The player is supposed to type a number here, if it is not a number they lose
					flag = false;
					System.out.println("you are eliminated");
				}
			}

		}
	}
	
	
}
