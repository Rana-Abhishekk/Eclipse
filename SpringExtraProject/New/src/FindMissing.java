import java.util.Arrays;
import java.util.Scanner;

public class FindMissing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n-2];
		for(int i=0;i<arr.length;i++) {
			arr[i] = scn.nextInt();
		}
		
		
		int[] res = new int[n];
		Arrays.fill(res, 0);
		for(int i=0;i<arr.length;i++) {
			res[arr[i]]++;
		}
		for(int i=0;i<res.length;i++) {
			if(res[i]==0) {
				System.out.println(i);
			}
		}

	}

}
