package controlConstructs;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the percentage"); 
		int marks=scanner.nextInt();
		if(marks>90) {
			System.out.println("Welcome to Techclub");
		}
	}
}
