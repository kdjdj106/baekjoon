import java.util.Scanner;
public class Codeup_83 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int a = stin.nextInt();
		for(int i =1; i<=a-1; i++)
		{
			if(i%3==0)
			System.out.print("X"+" ");
			else
				System.out.print(i+" ");
			
		}
		if(a%3==0)
		System.out.print("X");
		else
			System.out.print(a);
		
	}

}
