import java.util.Scanner;
public class BeakJoon_if_5 {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int h = stdIn.nextInt();
		int m = stdIn.nextInt();
		int b1, b2;
		
		int a = 60*h + m; // 모두 분으로 바꿈
		int b = a- 45; // 분에서 45를 뺌
		if(b <= 0)
		{
			b = 24*60 +b; // 음수가되면 
		}
		
		b1 = b /60;
		if(b1 == 24)
			b1 = 0;
		b2 = b % 60;
		
		System.out.println(b1 +" "+b2);
	}

}
