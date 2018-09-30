package com.company;
import java.util.*;

public class Main
{

    public static void main(String[] args)
    {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter the word you would like encrypted.");
        String word = kb.next();

        int percent = (int)(Math.random()*word.length());
        String word2= word.substring(percent)+word.substring(0,percent);

        int start = (int)(Math.random()*5);

        for(int j=1;j<=word.length();j++)
        {
            String output;
            char out= word2.charAt(j-1);
            if(start%5==0)
            {
                output=Integer.toBinaryString(out);
            }
            else if(start%5==1)
            {
                output=Integer.toOctalString(out);
            }
            else if(start%5==2)
            {
                output=Integer.toString(out);
            }
            else if(start%5==3)
            {
                output= Integer.toHexString(out);
            }
            else
            {
                output = Character.toString(out);
            }
            start++;
            System.out.print(output);
        }
    }
}