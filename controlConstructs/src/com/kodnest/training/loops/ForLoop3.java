package com.kodnest.training.loops;
import java.util.Scanner;

public class ForLoop3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the energy levels");
		int energyLevel=sc.nextInt();
		int i=energyLevel;
		while(i>=1)
		{
			System.out.println("KodMan is fighting and energyLevel is:  "+i);
			i--;
		}
	}

}
