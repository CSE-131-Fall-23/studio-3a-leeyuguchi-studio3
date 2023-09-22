package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Up to what number do you want to find all prime numbers?");
		int n = in.nextInt();
		int j = 0;
		
		boolean[] array = new boolean[n];
		for (int i=2; i<array.length;i++) {
			array[i]=true;
		}

		for (int i = 2; i < n; i++) {
			if (array[i]) {
				for (int k = 0; (Math.pow(i,2)+(k*i))<n; k++) {
					 j = (int)(Math.pow(i,2))+((k)*i);
						array[j]=false;
					}
				}
			}
	

		for (int i = 2; i < array.length; i++) {
			if (array[i]) {
				System.out.println(i);
			}
		}
	}

}
