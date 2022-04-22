
public class Ex03 {

	public static void main(String[] args) {
		
		int sum = 0;
		double avg=0;

		int[] nArr = new int[10];

		for(int i=0; i<10; i++)
			nArr[i] = (int)(Math.random()*99)+1;
	
		for(int i=0; i<10; i++)
		   sum += nArr[i];
		
		System.out.println("ÃÑÁ¡ : " + sum);
		System.out.println("Æò±Õ : " +(double)sum/nArr.length);

	}

}
