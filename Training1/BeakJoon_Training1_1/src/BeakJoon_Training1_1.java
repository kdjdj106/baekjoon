import java.util.Scanner;
public class BeakJoon_Training1_1 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int sum=0;
		int [] num = new int[5];
		
		for(int i = 0; i<5; i++)
		{
			num[i] = stin.nextInt();
			if(num[i]<40)
				num[i] = 40;
			sum += num[i];
		}
		
		System.out.println(sum/5);

	}

}
