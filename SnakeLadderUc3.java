package com.bridgelabz.snakeladder;

import java.util.Scanner;

public class SnakeLadderUc3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int startPosition = 0;
		int min = 1;
		int max = 6;
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
			break;
			
			case 2 :
				System.out.println("Option : SNAKE !!");	
			break;
			}
		}
			sc.close();

	}
}

