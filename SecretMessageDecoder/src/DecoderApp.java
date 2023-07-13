import java.util.Scanner;
public class DecoderApp {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter character");
		char ch=sc.next().charAt(0);
		MessageDecoder decoder = new MessageDecoder();
		System.out.println(decoder.decodeCharacter(ch));
		
	}

}
