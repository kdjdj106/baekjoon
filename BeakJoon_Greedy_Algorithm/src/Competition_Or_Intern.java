import java.util.*;
public class Competition_Or_Intern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();
		
		for(int i =num3; i>0; i--)
		{
			if(num1>=num2*2)
			{
				num1 -= 1;
			}
			else
			{
				num2 -= 1;
			}
		}
		if(num1/2 >= num2)
			System.out.println(num2);
		else
			System.out.println(num1/2);

	}

}
