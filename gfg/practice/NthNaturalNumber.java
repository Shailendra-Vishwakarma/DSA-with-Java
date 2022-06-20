package com.gfg.practice;

class NthNaturalNumber{
	public static void main(String[] args) {
		System.out.println(findNth(19));
		
	}
     static long findNth(long N)
    {
    	long ans=N;
        long count=0;
        for(int i=1; i<N; i++)
        {
             count=skip(i);
           
        }
        return ans+count;
    }
     static long skip(long i)
     {
    	 if(i==0)
    	 {
    		 return 0
    				 ;
    	 }
    	
    	 {
    	     if(i % 10 == 9)
    	         return i;
    	     else
    	         return skip(i / 10);
    	 }
     }
}