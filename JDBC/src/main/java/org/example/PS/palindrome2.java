package org.example.PS;

public class palindrome2 {
    public static void main(String[] args) {
       String  s =
                "aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga";
        System.out.println(validPalindrome(s));

    }

    public static boolean validPalindrome(String s) {
        boolean removed = false;
        int  i = 0;
        int j = s.length() - 1;
        while(i < j){
            char charI = s.charAt(i);
            char charJ = s.charAt(j);
            if(s.charAt(i) != s.charAt(j)) {
                if(removed == true)return false;
                char charI1 = s.charAt(i + 1);
                char j1 = s.charAt(j - 1);
                if(s.charAt(i + 1) == s.charAt(j))i++;
                else if(s.charAt(j - 1) == s.charAt(i))j--;
                else return false;
                removed = true;
            }
            i++;
            j--;
        }
        return true;

    }
}
