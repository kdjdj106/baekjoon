import java.util.Scanner;
public class BeakJoon_while_1 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		
		while(true)
		{
			int a = stin.nextInt();
			int b = stin.nextInt();
			
			if(a== 0 && b==0)
				break;
			System.out.println(a+b);
		}

	}

}
