package base.algorithm.idea.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindLongestWord {
    public static void main(String[] args) {
        String s = "abpcplea";
        List<String>d = Arrays.asList(
                "ale","apple","monkey","plea"
        );

        String res = solution(s, d);

        System.out.println(res);

    }

    private static String  solution(String s, List<String> d){

        if (s == null || s.length() == 0 || d.isEmpty()){
            return null;
        }


        char[] chars = s.toCharArray();
        int len = chars.length;
        String maxLenStr = null;


        for (String s1: d){

            int i = 0;
            int j = 0;
            int tempLen = s1.length();



            while (i<len && j<tempLen){
                if (chars[i] == s1.charAt(j)){
                    i++;
                    j++;
                }else {
                    i++;
                }
            }

            if (j == tempLen && i<=len){

                if (maxLenStr != null){
                    int compareValue = s1.compareTo(maxLenStr);

                    if (s1.length() == maxLenStr.length()){
                        maxLenStr = compareValue > 0 ? maxLenStr: s1;
                    }else {
                        maxLenStr = (s1.length() - maxLenStr.length()) > 0 ? s1 : maxLenStr;
                    }

                }else {
                    maxLenStr = s1;
                }
            }

        }

        return maxLenStr;

    }


}
