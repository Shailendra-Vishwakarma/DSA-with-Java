class Solution {
    public boolean isPerfectSquare(int num) {
    
 //   Efficient Solution Using binary search: Time complexity is O(Log(sqrt(n))).
       long start=0;
        long end=num/2;
       
        while(start<=end)
        {
            long mid=start+(end-start)/2;
             if(num==1)
        {
            return true;
        }
            if(mid*mid==num)
            {
                return true;   
            }
            else if(mid*mid<num)
            {
                start=mid+1;
            }
            else
                end=mid-1;
           
        }
        return false;
        //Bruteforce Solution: Time complexity is O(sqrt(n)).
        long y=0;
       while(y*y<=num)
        {
            if(y*y==num)
             return true;
             y++;
       }
             return false;
    }
}
