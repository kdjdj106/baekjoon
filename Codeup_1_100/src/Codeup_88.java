import java.util.Scanner;
public class Codeup_88 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		for(int i =1; i<=a; i++)
		{
			if(i%3 !=0)
				System.out.print(i);
			if(i==a)
				break;
			if(i%3 !=0)
			System.out.print(" ");
			
		}
		
	}

}
