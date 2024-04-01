package com.work.is.Strings;

public class FindAnExtraCharacterProgramFrequencyCounting {


    public static void main(String[] args){
        String s1 = "abcd";
        String s2 = "cbdae";

        System.out.println(findExtra(s1, s2));
    }

    public static char findExtra(String s1, String s2){
        int[] count = new int[26];
        int n = s1.length();
        for(int i = 0; i < n; i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        count[s2.charAt(n) - 'a']++;

        for(int i = 0; i <26;i++){
            if(count[i] == 1){
                return (char)(i + 'a');
            }
        }

        return 0;
    }
}

//Time Complexity: O(N).
//Auxiliary Space: We have just created a new array of size 26, therefore the space complexity of this solution would be O(1).