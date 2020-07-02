import java.util.Scanner;
public class BeakJoon_for_3 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);

		int sum = 0;
		int a = stin.nextInt();
		
		for(int i=1; i<=a; i++)
		{
			 sum = sum + i;
			 
			
		}
		System.out.println(sum);
	}

}
