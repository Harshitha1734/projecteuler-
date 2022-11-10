package com.problems.list;

public class PrimeFactors {
	
	public static long largestPrimeFactor(long n) {
		long max=1;
		for(long i=2;i<Math.sqrt(n);i++) {
			if(n%i!=0) {
				continue;
			 }else {
				   if(false==prime(i) && max<i) {
					   max=i;
				   }
				   else {
					   continue;
				   }
				}
			}
		return max;
		
	}
	public static boolean prime(long z) {
		boolean res=false;
		
		for(long j=2;j<z/2;j++) {
			if(z%j==0) {
				res=true;
				break;
			}
		}
		return res;
		
	}

}
