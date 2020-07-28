import java.util.*;
public class String_Greedy {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		String [] arr1 = str1.split("");
		String [] arr2 = str2.split("");
		int a=0;
		for(int i =0; i<arr2.length- arr1.length +1; i++)
		{
			String str = str2.substring(i, i+str1.length());
			int same =0;
			for(int j=0; j<str.length(); j++)
			{
				if(str1.charAt(j) == str.charAt(j))
					++same;
			}
			if(same>a)
				a= same;
		}
		System.out.println(str1.length()-a);

	}

}
