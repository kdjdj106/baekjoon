import java.util.Scanner;
public class BeakJoon_Training1_4 {

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
		for(int i = n-1; i>0; i--)
		{
			for(int j =1; i>=j; j++ ) 
			{
				System.out.print("*");
			}
			System.out.println("");
		}
		


	}

}
