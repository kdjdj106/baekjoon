import java.util.Scanner;
public class Codeup_25 {

	public static void main(String[] args) {

		Scanner stin  = new Scanner(System.in);
		String str1 = stin.next();
		int []num =  new int [str1.length()];
		int a =10000;
		for(int i =0; i<num.length; i++)
		{
			num[i] = str1.charAt(i)-'0';
			System.out.println("["+ num[i]*a+"]");
			a/=10;
		}
		

	}

}
