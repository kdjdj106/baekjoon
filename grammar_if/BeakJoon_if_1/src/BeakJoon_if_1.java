import java.util.Scanner;
public class BeakJoon_if_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		
		if(a>b)
			System.out.println(">");
		if(a<b)
			System.out.println("<");
		if(a==b)
			System.out.println("==");
		
		

	}

}
