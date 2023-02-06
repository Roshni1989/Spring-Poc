package com.example.springpoc;

public class Palindrome {

    public static void main(String[] args) {
        String input = "raaseddsaar";
        boolean palindrome = isPalindrome(input);

        if(palindrome){
            System.out.println(input+" Is a Palindrome");
        }else{
            System.out.println(input+" Not a Palindrome");
        }
    }

    private static boolean isPalindrome(String input) {
        char[] charArray = input.toCharArray();
        for(int i = 0, j = input.length()-1; i< input.length()/2; i++,j--){
            if(charArray[i] == charArray[j]){
                continue;
            }else{
                return false;
            }
        }
        return true;
    }
}
