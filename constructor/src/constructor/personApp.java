package constructor;
import java.util.*;
public class personApp {
	public static void main(String [] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter id");
		int id=sc.nextInt();
		System.out.println("enter name");
		sc.nextLine();
		String name=sc.nextLine();
		System.out.println("enter gender");
		String gender=sc.next();
		System.out.println("enter email");
		String email=sc.next();
		System.out.println("enter phone number");
		long phone=sc.nextLong();
		
		person p=new person(id, name, gender, email, phone);
		System.out.println(p.id+" "+p.name+" "+p.gender+" "+p.email+" "+p.phone);
				
		
		
	}
	

}
