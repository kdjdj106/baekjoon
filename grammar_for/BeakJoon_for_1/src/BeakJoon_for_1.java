import java.util.Scanner;
public class BeakJoon_for_1 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
	int a = stdIn.nextInt();
	
	for(int i = 1; i<10; i++)
	{
		System.out.println(a+ " * " + i + " = " + a*i);
	}

	}

}