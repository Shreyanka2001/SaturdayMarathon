import java.util.Scanner;
public class PlanetExplrerApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		PlanetExplorer explorer = new PlanetExplorer();
		System.out.println(explorer.calculateSurfaceArea(3.0));
	}

}
