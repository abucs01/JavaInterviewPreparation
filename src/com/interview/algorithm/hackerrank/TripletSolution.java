package com.interview.algorithm.hackerrank;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TripletSolution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
	        int a0 = in.nextInt();
	        int a1 = in.nextInt();
	        int a2 = in.nextInt();
	        int b0 = in.nextInt();
	        int b1 = in.nextInt();
	        int b2 = in.nextInt();
	        int[] result = solve(a0, a1, a2, b0, b1, b2);
	        for (int i = 0; i < result.length; i++) {
	            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
	        }
	        System.out.println("");

	}
	


	public static int[]  solve (int a0, int a1, int a2,int b0,int b1,int b2){
		int []  tripletCalculation = new int[2]  ;
        int alice = 0;
        int bob = 0;
        
				
		if ((a0 >b0)){
			alice = alice+1;
		} else if(b0 > a0) {
			bob = bob+1;
		}
		if ((a1 > b1)){
			alice = alice+1;
		}  else if(b1 > a1) {
			bob = bob+1;
		}
		if ((a2 > b2)){
			alice = alice+1;
		} else if(b2 > a2) {
			bob = bob+1;
		}

		tripletCalculation[0] = alice;
		tripletCalculation[1] = bob;
		

		
		return tripletCalculation;
	}
	
	

}
