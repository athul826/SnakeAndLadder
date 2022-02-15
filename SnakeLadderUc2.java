package com.bridgelabz.snakeladder;

import java.util.Scanner;

public class SnakeLadderUc2 {

	public static void main(String[] args) {
		int startPosition = 0;
		int min = 1;
		int max = 6;
		System.out.println("Enter 1 To Roll The Dice :");
		Scanner sc = new Scanner(System.in);
		int play = sc.nextInt();
		if (play == 1) {
			
		// To get Random number between 1 And 6
		int randomDice = (int)(Math.random() * (max - min+1) + min);
		System.out.println("Dice Number is :" +randomDice);
		} 
		else {
			
		System.out.println("You Have Entered Wrong Number");
		}
		sc.close();
	

	}
	

}
