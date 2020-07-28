import java.util.Scanner;
public class Codeup_85 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		long a = stin.nextInt();
		long b = stin.nextInt();
		long c = stin.nextInt();
		long d = stin.nextInt();
		double num2 = 8*Math.pow(2, 10)*Math.pow(2, 10);
		double num1 = ((a*b*c*d)/num2);
		System.out.println(num1);
		double num3 = (double)num1;
		System.out.printf("%.1f MB", num3);
		
	}

}
