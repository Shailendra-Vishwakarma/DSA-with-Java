class Solution {
    public boolean halvesAreAlike(String s) {
     int[] vowel={'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
     int count1=0,count2=0;
        for(int i=0; i<s.length()/2; i++)
        {
            for(int j=0; j<vowel.length; j++)
            {
                if(s.charAt(i)==vowel[j])
                {
                    count1++;
                }
            }
        }
        for(int i=s.length()/2; i<s.length(); i++)
        {
            for(int j=0; j<vowel.length; j++)
            {
                if(s.charAt(i)==vowel[j])
                {
                    count2++;
                }
            }
        }
        if(count1==count2)
            return true;
        else
            return false;
    }
}
