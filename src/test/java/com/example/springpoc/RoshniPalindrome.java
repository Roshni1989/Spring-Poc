package com.example.springpoc;

public class RoshniPalindrome {
    public static void main(String[] args) {
        String str = "abccba";

        boolean palindrome = isPalindrome(str);
        if (palindrome) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }

    }


    private static boolean isPalindrome(String str) {
        char[] arr = str.toCharArray();

        for (int i = 0, j=str.length()-1; i < str.length()/2; i++,j--) {
            //System.out.println("inside outer for loop: "+i+" char is:"+arr[i]);
            //for (int j = arr.length - 1; j > 0; j--) {
            //System.out.println("inside inner for loop j: "+j+" for char[j]"+arr[j]+" value of i: "+i+"arr[i]"+arr[i]);
            if (arr[i] == arr[j]) {
                continue;
            }
            else {
                return false;
            }
        }
        return true;
        }


    }


