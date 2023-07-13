package controlConstructs;

public class jumpingControls {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
			if(i==2) 
			{
			break;
			}
			System.out.println("Kodnest");
		}
		System.out.println("out of construct");
	}

}
