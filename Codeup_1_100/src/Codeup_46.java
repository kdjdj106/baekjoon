import java.util.Scanner;
public class Codeup_46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		int a1 =stin.nextInt();
		int a2 =stin.nextInt();
		int a3 =stin.nextInt();
		System.out.println(a1+a2+a3);
		float a4 =((float)a1+(float)a2+(float)a3)/3;
		System.out.printf("%.1f", a4);

	}

}
