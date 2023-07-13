
public class ArithmeticOperation {
	public static void main(String[] args) {
		int diff=subtractNumbers(20, 5);
		System.out.println(diff);
		int product=multiplyNumbers(4, 5);
		System.out.println(product);
		double division=divideNumbers(20, 4);
		System.out.printf("%.2f\n",division);
		int rem=findRemainder(10, 3);
		System.out.println(rem);
		
	}
	public static int subtractNumbers(int num1, int num2)
	{
		return num1-num2;
	}
	public static int multiplyNumbers(int num1, int num2)
	{
		return num1*num2;
	}
	public static double divideNumbers(int num1, int num2)
	{
		return num1/num2;
	}
	public static int findRemainder(int num1, int num2)
	{
		return num1%num2;
	}
}
