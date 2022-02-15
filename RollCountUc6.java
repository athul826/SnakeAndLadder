package com.bridgelabz.snakeladder;

import java.util.Scanner;

public class RollCountUc6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startPosition = 0;
		int min = 1;
		int max = 6;
		int diceRollCount = 0;
		int winningPosition = 100;
		
			//Player reaches winning position till 100
				while(startPosition <= winningPosition) {
				System.out.println("Enter 1 to roll the dice :");
				int play = sc.nextInt();
				if(play == 1) {
		
						//To get Random Numbers
						int randomDice = (int)(Math.random() * (max- min+1) + min);
						System.out.println("The Dice Number is:" + randomDice);
		
						// To Check for option Using Random
						int checkOption = (int)(Math.random() * 10) % 3;
					
						switch(checkOption) {
						case 0 :
						 System.out.println("Option : NO PLAY !!");
						 break;
						 case 1 :
							System.out.println("Option : LADDER !!");
							startPosition += randomDice;
							// position changing when it is greater than 100
							if(startPosition > winningPosition) {
								startPosition -= randomDice;
							}	
						break;
						case 2 :
							System.out.println("Option : SNAKE !!");
							startPosition -= randomDice;
							// set position value zero when it becomes negative
							if(startPosition < 0) {
								startPosition = 0;
							}
						break;
						}
							System.out.println("current position =" + startPosition );
							diceRollCount ++;
					 }
					else {
						System.out.println("you Have Enterd Wrong Number");
					}
				}
				System.out.println(" YOU WON THE GAME !!!");
				System.out.println("Rolled Dice"+ diceRollCount +"times.");
				
				sc.close();

	}

}
