package com.kodnest.training.infiniteLoops;
import java.util.Scanner;
public class KodnestcalculatorApp {
	public static void main(String[] args) {
		System.out.println("Hell0, User Welcome to KodnestCalculator!!");
		KodnestCalculator KC=new KodnestCalculator();
		Scanner sc=new Scanner(System.in);
		for(;;)
		{
		System.out.println("***********MENU***********");
		System.out.println("+ ------>Addition");
		System.out.println("- ------>Subtraction");
		System.out.println("* ------>Multiplication");
		System.out.println("/ ------>Division");
		System.out.println("^ ------>findSquare");
		System.out.println("! ------>Exit");
		System.out.println("Select your choice");
		char choice=sc.next().charAt(0);
		switch(choice)
		{
		case '+':KC.Addition();
		        break;
		case '-':KC.Subtraction();
				break;
		case '*':KC.Multiplication();
		        break;
		case '/':KC.Division();
        		break;
		case '^':KC.findSquare();
                 break;
		case '!':System.out.println("ok tata bye bye!!");
			return;
		default:
			System.out.println("Please visit vasan eye care......see the message");
			break;
				
		}
		}
		
	}

}
