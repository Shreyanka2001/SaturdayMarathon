package controlConstructs;
import java.util.Scanner;

public class demo2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first num");
		int firstNum=sc.nextInt();
		System.out.println("Enter sec num");
		int secNum=sc.nextInt();
		if(firstNum>secNum) 
		{
			int dif=secNum-firstNum;
			System.out.println(dif);
			
		}
		else
		{
			int diff=firstNum-secNum;
			System.out.println(diff);
		}
	}

}
