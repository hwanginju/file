import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Suwon {

	public static void main(String[] args) throws IOException {
		
		int count=0;
		
		String[] region = new String[count];
		String[] city = new String[count];
		String[] district = new String[count];
		String[] dong = new String[count];
		String[] variety = new String[count];
		String[] howmany = new String[count];
		String[] owner = new String[count];
		
		{
			File file = new File("data/suwon.txt");
			FileInputStream infile = new FileInputStream(file);
			Scanner sc = new Scanner(infile);
			
			sc.nextLine();
			
			for(int i=0; i<count; i++) {
				String line = sc.nextLine();
				
				String[] tokens = line.split(",");
				region[i] = tokens[0];
				city[i] = tokens[1];
				district[i] = tokens[2];
				dong[i] = tokens[3];
				variety[i] = Integer.parseInt(tokens[4]);
			}
			for(int i=0; i<count; i++) {
				System.out.println("%s %s %s %s %d\n", region[i], city[i], district[i]);
			
			
//			while(sc.hasNextLine()) {
//				sc.hasNextLine();
//				count++;
			}
			
//			System.out.println("count :" + count);
//			sc.close();
//			infile.close();
		}
		{
			
		}
	}

}
