class Solution {
    public int prefixCount(String[] words, String pref) {
        int count=0;
      for(int i=0; i<words.length; i++)
      {
          String s="";
          for(int j=0; j<pref.length(); j++)
          {
              if(pref.charAt(j)==words[i].charAt(j) && words[i].length()>=pref.length())
              {
                  s+=words[i].charAt(j);
              }
              else
                  break;
            
              
          }
          if(pref.equals(s))
          count++; 
      }
        return count;
    }
}
