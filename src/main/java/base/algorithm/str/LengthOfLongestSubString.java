package base.algorithm.str;

import java.util.HashSet;
import java.util.Set;


/**
 * leetcode 3
 */
public class LengthOfLongestSubString {
    private static Set<Character> CHAR_SET = new HashSet<>();

    public static void main(String[] args) {
        String s = "aa";

        int res = solution(s);

        System.out.println(res);

    }

    private static int solution(String s){
        if (s == null || s.length() == 0){
            return 0;
        }

        if (s.trim().length()  == 0 || s.length() == 1){return 1;}

        int maxLen = 0;

        int strLen = s.length();

        int i = 0;
        int j = 1;


        while (i < strLen && j <= strLen){
            char c = s.charAt(j-1);

            if (!CHAR_SET.contains(c)){
                CHAR_SET.add(c);
                j++;
            }else {
                i++;
                j = i+1;
                maxLen = maxLen-CHAR_SET.size() > 0 ? maxLen : CHAR_SET.size();
                CHAR_SET.clear();
            }

        }


        return maxLen;
    }

}
