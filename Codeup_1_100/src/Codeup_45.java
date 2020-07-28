import java.util.Scanner;
public class Codeup_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		int a1 =stin.nextInt();
		int a2 =stin.nextInt();
		float a3 = (float)a1/(float)a2;
		System.out.println(a1+a2);
		System.out.println(a1-a2);
		System.out.println(a1*a2);
		System.out.println(a1/a2);
		System.out.println(a1%a2);
		System.out.printf("%.2f", a3);

	}

}
