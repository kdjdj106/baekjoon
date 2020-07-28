import java.util.Scanner;
public class Codeup_90 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		long a1 = stin.nextInt();
		long a2 = stin.nextInt();
		long a3 = stin.nextInt();
		long a4 = stin.nextInt();
		long num = a1;
		for(int i =1; i<a4; i++)
		{
			num =(num*a2)+a3;
		}
		System.out.println(num);
		
		
	}

}
