
import java.util.*;
public class Random{
	public static void main(String[] args){

//	9,6,7,3,5 오름차순으로 정렬
		int[] arr = { 9, 6, 7, 3, 5}; //배열 초기화
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			} 
			System.out.print(i+1 + "회전"); 
			for(int p=0; p<arr.length; p++) {
				System.out.print(arr[p] + "");
			}System.out.println();
			
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "");
		}
		System.out.println();
	}
}

