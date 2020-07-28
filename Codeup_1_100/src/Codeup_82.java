import java.util.Scanner;
public class Codeup_82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		String str1 = stin.nextLine();
		int a = Integer.parseInt(str1, 16);
		for(int i =1; i<16; i++)
		{
			String str2 = Integer.toHexString(i).toUpperCase();
			int b = a*i;
			String str3 = Integer.toHexString(b).toUpperCase();
			System.out.println(str1+"*"+str2+"="+str3);
		}
		
	}

}
