import java.util.Scanner;
public class PowOfSq {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		System.out.println(squareNumber(num));
		}
	public static int squareNumber(int num)
	{
		return num*num;
	}

}
