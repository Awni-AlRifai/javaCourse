package org.example.PS;

public class IsPalindrome {
    IsPalindrome(){

    }
    public static void main(String[] args) {

    }
    public static String toLowerCase(String str){
        char[] charArray = str.toCharArray();
        for(int i = 0; i < charArray.length; i++){
            if(charArray[i] >= 'A' && charArray[i] <= 'Z'){
                charArray[i] =(char) ((int)charArray[i] + 32);
            }
        }
        return String.valueOf(charArray);
    }

    public static String trim(String str){
        String returnedString = "";
        char[] charArray = str.toCharArray();
        for(char c:charArray){
            if(c == ' ')continue;
            returnedString+=c;
        }
        return returnedString;
    }
    public static boolean isPal(String s){
       char[] c = s.toCharArray();
       for(int i = 0, j = c.length - 1; i < j;){
           if(!Character.isLetterOrDigit(c[i]))i++;
           else if(!Character.isLetterOrDigit(c[j]))j--;
           else if(Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
               return false;
       }
       return true;
    }
}
