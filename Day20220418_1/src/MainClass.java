import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) throws FileNotFoundException {
		{
			File file = new File("data/data.txt");
			
			FileInputStream src = new FileInputStream(file);
	
			Scanner sc = new Scanner(src);
			
			while(sc.hasNext()) {
				String tmp sc.next();
				System.out.println("%s", tmp);
			count++;
			}
			System.out.println("count : " + count);
	
		}
	int[] nums = new int[count];
	{
		// 배열 공간 data1.txt 내용 넣기
		File file = new File("data/data.txt");
		
		FileInputStream src = new FileInputStream(file);

		Scanner sc = new Scanner(src);
		
	
	
	}
	
	


}
