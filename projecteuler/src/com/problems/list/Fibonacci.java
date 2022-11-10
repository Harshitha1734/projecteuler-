package com.problems.list;

public class Fibonacci {
	
     public static int getFibonacci() {
    	 
    	int a=1;
    	int b=2;
    	int result=0;
    	int sum=2;
    	while(result<4000000) {
    	  result=a+b;
    	  a=b;
    	  b=result;
    	  if(result%2==0) {
    		  sum+=result;
    	  }
    	  
    	}
		return sum;
    	 
     }

	

}
