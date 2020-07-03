import java.util.Scanner;
public class BeakJoon_while_3 {

	public static void main(String[] args) {
		Scanner stin = new Scanner(System.in);
		
		int num = stin.nextInt();
		int a, b, c, d=0;
		int count=0;
		int e = num;
		while(true)
		{
			
				a = num/10;
				b = num%10;
				c = (a+b)%10;
				d = b*10 + c;
				
				count++;
				num=d;
				
				if(e == d)
					break;
				
			
		}
		System.out.println(count);
		

	}

}
