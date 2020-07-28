import java.util.Scanner;
public class Codeup_69 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner stin = new Scanner(System.in);
		
		String str1 = stin.nextLine();
		int a = str1.charAt(0);
				switch(a)
				{
				  case 65: //문자 'A'가 정수값 65('A'의 아스키 값)로 저장되기 때문에 가능하다.
				    System.out.println("best!!!");
				    break;
				  case 66:
					  System.out.println("good!!");
				    break;
				  case 67:
					  System.out.println("run!");
				    break;
				  case 68:
					  System.out.println("slowly~");
					    break;
				  default:
					  System.out.println("what?");
				}

	}

}
