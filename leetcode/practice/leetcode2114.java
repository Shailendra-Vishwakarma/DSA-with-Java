package com.leetcode.practice;

class leetcode2114 {
	public static void main(String[] args) {
		String[] sentences= {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		System.out.println(mostWordsFound(sentences));
	}
    static
    int mostWordsFound(String[] sentences) {
    int ans=0;
        int max=0;
        for(int i=0; i<sentences.length; i++)
        {
            int count=1;
            for(int j=0; j<sentences[i].length(); j++)
            {
                if(sentences[i].charAt(j)== ' ')
                {
                   count++; 
                }
                ans=count;
            }
            if(ans>max)
            {
                max=ans;
            }
            
        }
        return max;
        
    }
}
