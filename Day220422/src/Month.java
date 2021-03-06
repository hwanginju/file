import java.util.Scanner;

public class Month {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] monthString = {
				"Jan", "Feb", "Mar", "Apr", "May", "June",
				"Jul", "Aug", "Sep", "Oct", "Nob", "Dec"
		};
		System.out.println("해당 월의 영어 단어를 입력");
		System.out.println("첫글자 대문자");
		
		int retry = 0;
		int last = -1; //이월

		do {
			int month;
			do { //직전월과 같은 월이면 반복 같은 달이 아니면 do~while 벗어남
			
			month = (int)(Math.random()*12);
			}while(month == last);
			last = month;
			
			while(true) {
				System.out.println((month+1) + "월 : ");
				String qus = sc.nextLine();
				
				if(qus.equals(monthString[month]))break; //정답
			System.out.println("오답");
			}
			System.out.println("정답 >> 재도전(1) : 종료(0) :");
			retry = sc.nextInt();
			sc.nextLine();
			
		}while(retry == 1);
		System.out.println("프로그램 종료");
	}

}
