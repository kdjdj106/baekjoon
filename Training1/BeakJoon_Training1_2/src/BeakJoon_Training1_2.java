import java.util.Scanner;
public class BeakJoon_Training1_2 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int cost [] = new int[5];
		int burger =0;
		int drink = 0;
		for(int i = 0; i<3; i++)
		{
			cost[i] = stin.nextInt();
			if(i == 0)
				burger = cost[i];
			if(cost[i]<burger)
				burger = cost[i];
		}
		
		for(int i = 3; i<5; i++)
		{
			cost[i] = stin.nextInt();
			if(i == 3)
				drink = cost[i];
			if(cost[i]<drink)
				drink = cost[i];
		}
		
		int sum = burger+drink-50;
		System.out.println(sum);

	}

}
