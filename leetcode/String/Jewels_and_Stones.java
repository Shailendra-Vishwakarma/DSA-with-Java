class Solution {
    public int numJewelsInStones(String jewels, String stones) {
     int count=0;
        // for(int i=0; i<jewels.length(); i++)
        // {
        //     for(int j=0; j<stones.length(); j++)
        //     {
        //         if(jewels.charAt(i)==stones.charAt(j))
        //         {
        //             count++;
        //         }
        //     }
        // }
        
     ArrayList<Character> list=new ArrayList<>();
	 for(int i=0; i<jewels.length(); i++)
	 {
		  list.add(jewels.charAt(i));
	 }
	 for(int i=0; i<stones.length(); i++)
	 {
		 if(list.contains(stones.charAt(i)))
		 {
			 count++;
		 }
	 }
        return count;
    }
}
