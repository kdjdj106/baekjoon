import java.util.Scanner;
public class Codeup_91 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a1 = stin.nextInt();
		int a2 = stin.nextInt();
		int a3 = stin.nextInt();
		int a=1;
		while(true)
		{
			if(a%a1==0 && a%a2==0 && a%a3==0)
				{
					System.out.println(a);
					break;
				}
			a++;
		}
		
	}

}
