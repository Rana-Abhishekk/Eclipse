package Stud.com.task.code;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RepeatedElements {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = scn.nextInt();
		}
		List<Integer> li = new ArrayList<>();
		
		
		for(int i=0;i<n;i++) {
			if(i<n-1) {
			if(arr[i]!=arr[i+1]) {
				li.add(arr[i]);
			}
			}
			if(i==n-1) {
				li.add(arr[i]);
			}
		}
		int[] res = new int[li.size()];
		for(int i=0;i<li.size();i++) {
			res[i] = li.get(i);
		}
		for(int i=0;i<li.size();i++) {
		System.out.println(res[i]);
		}
	}

}
