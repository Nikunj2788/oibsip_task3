package com.arminterface;

import java.util.Scanner;

public class bean {
public static void main(String[] args) {
try {

	
	Scanner sc = new Scanner(System.in);
	System.out.println("Welcome to the bank transaction ");
	System.out.println("Enter the pin number ");
	int pin= sc.nextInt();

	
	int balance = 1000;
	String name = "nikunj";
	int amount = 0;
	int take_amount =0;
	if(pin == 123) {
		System.out.println("hello" +name);
		while(true) {
			System.out.println("press 1 to check the Balance  ");
			System.out.println("press 2  to Add the Amount ");
			System.out.println("press 3  to withdrawn the Amount");
			System.out.println("press 4  to print the Recipt");
			System.out.println("press 5  to Exit/Quit");

			
			System.out.println();
			System.out.println("Enter the Choice");
			int choice = sc.nextInt();
		    switch (choice) {
			case 1: {
				System.out.println("Your current balance is "+balance);				
				break;
			}
			case 2:{
				System.err.println("Enter the amount to be added ");
				amount = sc.nextInt();
				balance =  balance+amount;
				System.out.println("your Amount is succesfully added" + balance);
				break;
			}
			case 3:{
				System.out.println("How much amount you want to withdrawn" +take_amount);
				take_amount  = sc.nextInt();
				if(take_amount > balance) {
					System.out.println("Insuffient amount is your account");				
				}
				else {
					balance = balance - take_amount;
					System.out.println("Your Amount is succesfully withdrawn" +balance);					
				}
			break;
			}
			case 4:{
				System.out.println("Thanks for using our Site");
				System.out.println("your current Balance is "+balance);
				System.out.println("You added amount" +amount);
				System.out.println("you withdrawn amount is "+take_amount);			
				break;
			}
             } 
		    if(choice == 5) {
				break;
			}
       }
} 
	else {
		System.out.println("Wrong pin Number");
	}
}
	catch (Exception e) {
	// TODO: handle exception
		
		}
 }
}

