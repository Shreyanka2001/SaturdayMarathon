import java.util.Scanner;
public class TerneryOperator1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age=sc.nextInt();
		System.out.println(age>=18?"you are eligible":"you are not eligible");
		
	}

}
