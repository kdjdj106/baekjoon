import java.util.Scanner;
public class BeakJoon_while_2 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		
		
		while(stin.hasNextInt())
		{
			int a = stin.nextInt();
			int b = stin.nextInt();
			System.out.println(a+b);
		}

	}

}
