package session3_Assignments;

import java.util.Random;
import java.util.Scanner;

public class Assignment3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {		
		int N =  0;
		System.out.println("Enter any Number:");
		Scanner scaner=new Scanner(System.in);
		N=scaner.nextInt();
		int max= N-1;
		int min=0;
		System.out.println("N="+N);
		//Condition 0<= Random Number <= N-1;
	
		Random rad = new Random();
		System.out.println("Generated Random Number is: "+rad.nextInt((max - min)));
		
	}

}
