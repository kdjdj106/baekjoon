import java.util.Scanner;
public class BeakJoon_if_4 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y = stdIn.nextInt();
		
		if(x>0 && y>0)
			System.out.println("1");
		if(x<0 && y>0)
			System.out.println("2");
		if(x<0 && y<0)
			System.out.println("3");
		if(x>0 && y<0)
			System.out.println("4");
	}

}
