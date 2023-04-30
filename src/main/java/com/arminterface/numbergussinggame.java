package com.arminterface;
import java.util.Scanner;
import java.util.Random;

public class numbergussinggame {
		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        Random random = new Random();
		        int maxAttempts = 5; // maximum number of attempts per round
		        int numRounds = 3; // number of rounds to play
		        int score = 0; // initialize score to 0
		        
		        for (int round = 1; round <= numRounds; round++) {
		            int randomNumber = random.nextInt(100) + 1; // generate random number between 1 and 100
		            int numAttempts = 0; // initialize number of attempts to 0
		            
		            System.out.println("Round " + round + ": Guess a number between 1 and 100 (you have " + maxAttempts + " attempts).");
		            
		            while (numAttempts < maxAttempts) {
		                System.out.print("Attempt " + (numAttempts+1) + ": ");
		                int guess = scanner.nextInt();
		                
		                if (guess == randomNumber) {
		                    System.out.println("Congratulations, you guessed the number!");
		                    int points = maxAttempts - numAttempts; // calculate points based on number of attempts
		                    score += points; // add points to score
		                    System.out.println("You earned " + points + " points in this round. Your current score is " + score + ".");
		                    break;
		                } else if (guess < randomNumber) {
		                    System.out.println("Too low, try again.");
		                } else {
		                    System.out.println("Too high, try again.");
		                }
		                
		                numAttempts++;
		            }
		            
		            if (numAttempts == maxAttempts) {
		                System.out.println("Sorry, you did not guess the number. The correct number was " + randomNumber + ".");
		            }
		        }
		        
		        System.out.println("Game over! Your final score is " + score + ".");
		    }

	}
