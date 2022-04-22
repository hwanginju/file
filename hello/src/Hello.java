import java.util.*;
public class Hello {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("숫자입력(0=종료) : ");
			String tmp = sc.nextLine();
			int num = Integer.parseInt(tmp);
			if(num == 0) break;
			

			System.out.println("사칙연산");
			String str = sc.nextLine();
			char ch = str.charAt(0);

			switch(ch) {
			case '+' :
				sum += num;
				break;

			case '-' :
				sum -= num;
				break;

			case '*' :
				sum *= num;
				break;

			case '/' :
				sum /= num;
				break;
			default :
				System.out.println("마무리");
			}
		}
		System.out.println(sum);
	}	
}		
