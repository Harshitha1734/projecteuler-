package com.problems.list;

public class LargestPalindromic {
	
	public static long largestPalindrome(long n) {
		long max=0;
	for(int j=999;j>100;j--) {
		for(int i=999;i>100;i--) {
			long prod=j*i;
			if(true==Palindrome(prod) && max<prod) {
				max=prod;
				break;
			}
		}
	}
		return max;
		
	}
	
	public static boolean Palindrome(long n) {
		boolean result=false;
		String reversed="";
		String temp="";
		String store=""+n;
		while(n>0) {
			long p=n%10;
			temp+=p;
			n=n/10;
		}
		StringBuilder str= new StringBuilder();
	    reversed+=temp;
		if(store.contentEquals(reversed)) {
			
			result=true;
		}
		return result;
		
	}

}
