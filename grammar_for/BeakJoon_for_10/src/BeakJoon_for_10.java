import java.util.Scanner;

public class BeakJoon_for_10 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int n = stin.nextInt();
		for(int i =1; i<=n; i++)
		{
			for(int j=n; j>=1; j--)
			{
				if(j>i)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println("");
		}

	}

}
