package Gussing_Game;

import java.util.Scanner;

public class GussingGame {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int randomInput= (int) (Math.random()*100);
//		System.out.println(randomInput);
		

		do {
			System.out.print("Gasse a Number:");
			int userInput=input.nextInt();
			if(randomInput==userInput) {
				System.out.println("Great!!!");
				System.out.println("Congratulation!!!");
				break;
			}
			else if(userInput>randomInput) {
				System.out.println("Input A Small Number");
			}
			else {
				System.out.println("Input ALarge Number");
			}
		}while(randomInput>0);
		
		
}
}