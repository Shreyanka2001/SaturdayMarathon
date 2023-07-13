import java.util.Scanner;
public class demo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter + or - or * or /");
		char opt=sc.next().charAt(0);
		switch(opt) 
		{
		case '+':
			System.out.println("addition operator");
			break;
		case '-':
			System.out.println("subtraction operator");
			break;
		case '*':
			System.out.println("multiplication operator");
			break;
		case '/':
			System.out.println("division operator");
			break;
		default:
			System.out.println("Idiot look into the message carefully!!");
			
		}
		
	}

}
