package com.problems.list;

public class MultiplesOf3Or5 {
	
	public static long sumOfAllMultiples(int num1,int num2,int limit) {
		int result=0;
		return sumOfMultiples(num1,limit)+sumOfMultiples(num2,limit)-sumOfMultiples(num1*num2,limit);
		
	}
	
	public static int sumOfMultiples(int n,int limit) {
		int sum=0;
		for(int i=n;i<limit;i++) {
			if(i%n==0) {
				sum+=i;
			}
			else {
				continue;
			}
		}
		return sum;
		
	}

}
