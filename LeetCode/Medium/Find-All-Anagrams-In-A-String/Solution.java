class Solution {
     public boolean isAnagram(String s1, String s2){
        if(s1.length()!=s2.length()){
            return  false;
        }
        int [] hash= new  int[26];
         for(char ch:s1.toCharArray()){
            hash[ch-'a']++;  
     }
      for(char ch:s2.toCharArray()){
            hash[ch-'a']--;

            
     }
      for(int value:hash){
        if(value!=0){
            return false;
        }
        
      }
       return true;
     }
    public List<Integer> findAnagrams(String s, String p) {
      List<Integer> list = new ArrayList<>();
       int left=0;
      for( int i=p.length()-1;i<s.length();i++){
        if(isAnagram(s.substring(left,i+1),p)){
            list.add(left);
        }
        left++;
      }
      return list;   
    }
}
