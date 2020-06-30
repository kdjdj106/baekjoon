package Beakjoon01;
import java.util.Scanner;
public class Beakjoon01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner stdIn = new Scanner(System.in);
		
		int i = stdIn.nextInt();
		

		if(i % 4==0 || i % 400 == 0 && i %100 != 0)
		{
			System.out.println("1");
		}
		else
		{
			System.out.println("0");
		}
			

	}

}