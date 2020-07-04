import java.util.Arrays;
import java.util.Scanner;
public class BeakJoon_Training1_3 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int [] num = new int[3];
		for(int i = 0; i<3; i++)
		{
			num[i] = stin.nextInt();
		}
		Arrays.sort(num);
		System.out.print(num[1]);

	}

}
