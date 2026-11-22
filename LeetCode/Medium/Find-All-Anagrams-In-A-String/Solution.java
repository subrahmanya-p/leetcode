class Solution {
    
    public List<Integer> findAnagrams(String s, String p) {

      List<Integer> list = new ArrayList<>();
     if (p.length() > s.length()) {
    return list;
} 
        int  [] hash= new int[26];
        int  [] window= new int[26];
        int k= p.length();
         for( int i=0;i<k;i++){
            hash[p.charAt(i)-'a']++;
         }
          for( int i=0;i<k;i++){
            window[s.charAt(i)-'a']++;
         }
         if(Arrays.equals(hash,window)){
            list.add(0);
         }
    for( int i=k;i<s.length();i++){
          window[s.charAt(i-k)-'a']--;
          window[s.charAt(i)-'a']++;
           if(Arrays.equals(hash,window)){
            list.add(i-k+1);
         }


    }
    return list;
}
}
