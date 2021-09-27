/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Koby Montenegro
 */

package Exercise24;

import java.util.Arrays;
import java.util.Scanner;

class Main
{
    static boolean isAnagram(String str1, String str2)
    {
        boolean status = true;

        if (str1.length() != str2.length())
        {
            status = false;
        }
        else
        {
            //Convert strings into character arrays
            char[] Array1 = str1.toCharArray();
            char[] Array2 = str2.toCharArray();
            status = Arrays.equals(Array1, Array2);
        }

        if (status == false)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams: ");

        System.out.print("Enter the first string: ");
        String str1 = scan.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scan.nextLine();


        if(isAnagram(str1,str2))
        {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        }
        else
        {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }

        scan.close();

    }
}