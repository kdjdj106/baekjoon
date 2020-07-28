import java.util.Scanner;
public class Codeup_86 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		long a = stin.nextInt();
		long b = stin.nextInt();
		long c = stin.nextInt();
		
		double num1 = (a*b*c)/8;
		double num2 = num1/(1024*1024);
		System.out.println(num2);
		double num3 = (double)num2;
		System.out.printf("%.2f MB", num3);
		
	}

}
