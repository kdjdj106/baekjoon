import java.util.Scanner;
public class Codeup_81 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		int b = stin.nextInt();
		for(int i=1; i<=a; i++)
		{
			for(int j=1; j<=b; j++)
			{
				System.out.println(i+" "+j);
			}
		}
	}

}
