import java.util.Scanner;
public class Codeup_87 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		int sum =0;
		int b =0;
		for(int i =0; ; i++)
		{
			sum +=i;
			if(sum>=a)
				break;
			b++;
		}
		System.out.println(sum);
		
	}

}
