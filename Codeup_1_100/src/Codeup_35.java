import java.util.*;
public class Codeup_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		String a= stin.nextLine();
		int num = Integer.parseInt(a, 16);
		String num2 = Integer.toOctalString(num);
		System.out.println(num2);

	}

}
