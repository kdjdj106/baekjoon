import java.util.Scanner;
public class Codeup_84 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		int r = stin.nextInt();
		int g = stin.nextInt();
		int b = stin.nextInt();
		int cnt =0;
		for(int i=0; i<r; i++)
			  for(int j=0; j<g; j++)
			    for(int k=0; k<b; k++)
			    {
			    	System.out.println(i+" "+j+" "+k);
			    	cnt++;
			    }
		System.out.println(cnt);
		
	}

}
