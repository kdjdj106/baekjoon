import java.util.Scanner;
public class Codeup_67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		int a =stin.nextInt();
		if(a<0)
			System.out.println("minus");
		else
			System.out.println("plus");
		if(a%2 ==0)
			System.out.println("even");
		else
			System.out.println("odd");
		

	}

}
