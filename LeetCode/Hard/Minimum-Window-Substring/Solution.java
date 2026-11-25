import java.util.HashMap;

class Solution {

    public String minWindow(String s, String t) {

        int n = s.length();

        HashMap<Character, Integer> tMap = new HashMap<>();

        for (char c : t.toCharArray()) {
            tMap.put(c, tMap.getOrDefault(c, 0) + 1);
        }

        String ans = "";
        int left = 0;
        int count = t.length();

        HashMap<Character, Integer> sMap = new HashMap<>();

   
        for (int right = 0; right < n; right++) {

            char ch = s.charAt(right);

            sMap.put(ch, sMap.getOrDefault(ch, 0) + 1);

            if (tMap.containsKey(ch) && sMap.get(ch) <= tMap.get(ch)) {
                count--;
            }

         
            while (count == 0 && left <= right) {

                String sub = s.substring(left, right + 1);
                if (ans.equals("") || ans.length() > sub.length()) {
                    ans = sub;
                }

                char chLeft = s.charAt(left);

                if (tMap.containsKey(chLeft) && sMap.get(chLeft) <= tMap.get(chLeft)) {
                    count++;
                }

                sMap.put(chLeft, sMap.get(chLeft) - 1);

                if (sMap.get(chLeft) == 0) {
                    sMap.remove(chLeft);
                }


                left++;
            }
        }

        return ans;
    }
}
