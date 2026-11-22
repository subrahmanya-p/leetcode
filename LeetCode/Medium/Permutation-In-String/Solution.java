class Solution {

    public boolean checkInclusion(String s1, String s2) {
     int n=s1.length();
      int m=s2.length();
       int left=0;
       if(n>m){
        return false;
       }
         int hash1[] = new int [26];
          int hash2[] = new int [26];
            

          for(char ch: s1.toCharArray()){
            hash1[ch -'a']++;
          }
           for(int i=0; i<m;i++ ){

            hash2[s2.charAt(i)-'a']++;
             if(i-left+1>n){
                hash2[s2.charAt(left)-'a']--;
                left++;
             }
              if(i-left+1==n &&Arrays.equals(hash1,  hash2) ){
                 return true;
              }
           }
 return false;
           } 


}
