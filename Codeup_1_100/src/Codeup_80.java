import java.util.Scanner;
public class Codeup_80 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		int sum=0 , i=0;
		while(sum<a)
		{
			sum += i;
			i++;
		}
		System.out.println(i-1);
	}

}
