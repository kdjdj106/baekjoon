import java.util.Scanner;
public class BeakJoon_for_9 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		for(int i =1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
