import java.util.Scanner;
public class Codeup_64 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		int a =stin.nextInt();
		int b =stin.nextInt();
		int c =stin.nextInt();
		int d = (a<b ? a:b)<c ? (a<b ? a:b):c;
		System.out.println(d);

	}

}
