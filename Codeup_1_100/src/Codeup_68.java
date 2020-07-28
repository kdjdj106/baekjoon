import java.util.Scanner;
public class Codeup_68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		int a =stin.nextInt();
		if(a>=90)
			System.out.println("A");
		else if(a>=70 && a<90)
			System.out.println("B");
		else if(a>=40 && a<70)
			System.out.println("C");
		else 
			System.out.println("D");

	}

}
