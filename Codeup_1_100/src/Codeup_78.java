import java.util.Scanner;
public class Codeup_78 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		int sum =0;
		for(int i=0; i<=a; i++)
		{
			if(i%2 ==0)
				sum += i;
		}
		System.out.println(sum);
	}

}
