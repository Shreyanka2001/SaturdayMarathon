package com.kodnest.training.loops;
import java.util.Scanner;

public class dowhile {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int pageNo=100;
		
		boolean bored=true;
		int i=1;
		do
		{
			System.out.println("Kodman read page :"+i);
			i++;
			System.out.println("Do you want to continue?");
			bored=sc.nextBoolean();
			
		}while(bored);
		System.out.println("OKAY KHATAM TATA BYE BYE");
		
	}

}
