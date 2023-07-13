package com.kodnest.training.infiniteLoops;
import java.util.Scanner;
public class KodnestCalculator {
	Scanner sc=new Scanner(System.in);
    void Addition()
	{
    	System.out.println("Enter two numbers");
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	System.out.println("Addition is "+(num1+num2));
		
	}
    void Subtraction()
	{
    	System.out.println("Enter two numbers");
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	System.out.println("Difference is "+(num1-num2));
		
	}
    void Multiplication()
	{
    	System.out.println("Enter two numbers");
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	System.out.println("Product is "+(num1*num2));
		
	}
    void Division()
	{
    	System.out.println("Enter two numbers");
    	int num1=sc.nextInt();
    	int num2=sc.nextInt();
    	System.out.println("Division is "+(num1/num2));
		
	}
    void findSquare()
	{
    	System.out.println("Enter number");
    	int num1=sc.nextInt();
    	
    	System.out.println("Square is "+(num1*num1));
		
	}
}
