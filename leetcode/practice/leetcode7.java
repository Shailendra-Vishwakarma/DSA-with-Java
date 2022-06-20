package com.leetcode.practice;

public class leetcode7 {
	public static void main(String[] args) {
		System.out.println(reverse(1463847412));
		System.out.println(1<<31);
		System.out.println(1<<31-1);
		//System.out.println(Math.pow(-2, 31));
	}
    static int reverse(int x) {
    	int num=0;
    	if(x>(1<<31-1) || x<(1<<31^1))
    	//if(x>Math.pow(2, 31)-1 || x<Math.pow(-2, 31))
    	{
    		return 0;
    	}
    	
        
        else if(x>=0)
       {
          while(x>0)
        {
            
            int rem=x%10;
            int tem=rem;
            num=num*10+rem;
            x/=10;
            
        }
           return num;
       }
           else{
                 while(x<0)
        {
            
            int rem=x%10;
            int tem=rem;
            num=num*10+rem;
            x/=10;
            
            
        }
           }
       
           return num;
       }
   

}
