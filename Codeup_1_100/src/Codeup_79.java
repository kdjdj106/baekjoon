import java.util.Scanner;
public class Codeup_79 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		String str1 = stin.nextLine();
		String str2=  "q";
		String [] arr1 = str1.split(" ");
		for(int i =0; i<arr1.length; i++)
		{
			
			System.out.println(arr1[i]);
			if(arr1[i].equals(str2))
				break;
		}
	}

}
