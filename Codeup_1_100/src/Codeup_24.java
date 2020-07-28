import java.util.*;
public class Codeup_24 {

	public static void main(String[] args) {
		Scanner stin  = new Scanner(System.in);
		String str1 = stin.nextLine();
//		StringTokenizer st = new StringTokenizer(str1, "");
//		while(st.hasMoreTokens())
//		{
//			System.out.println("'"+st.nextToken()+"'");
//		}
		char [] ch = str1.toCharArray();
		for(int i =0; i<ch.length; i++)
			System.out.println("'"+ch[i]+"'");

	}

}
