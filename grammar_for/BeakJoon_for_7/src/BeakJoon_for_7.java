import java.util.Scanner;

public class BeakJoon_for_7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		int a=0, b=0;
		int sum [] = new int [n];
		for(int i = 0; i<n; i++)
		{
			a = stin.nextInt();
			b = stin.nextInt();
			sum[i] = a+b;
		}
		for(int i = 0; i<sum.length; i++)
		{
			System.out.println("Case " + "#"+(i+1)+": " +sum[i]);
		}

	}

}
