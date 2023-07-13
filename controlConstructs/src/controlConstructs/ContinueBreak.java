package controlConstructs;

public class ContinueBreak {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println("I = "+i);
			if(i==3)
			{
				System.out.println("Omkar");
				break;
			}
			else
			{
				System.out.println("Pralhad");
				continue;
			}
			//System.out.println("Kodnest"); (unreachable code)
			
		}
		System.out.println("out of construct");
	}

}
