import java.util.*;
import java.io.*;
public class javafest_string{
  public static void main (String [] args){
    Scanner sc = new Scanner(System.in);
    
    String s = "GeeksforGeeks";
    
    //String S = new string ("GeeksforGeeks");
    //1 Returns the number of cherecters in the string.
    System.out.println("String length = "+s.length());
    
    //2 Returns the character at ith index.
    System.out.println("Charecter at 3rd position = "+s.charAt(3));
    
    //3 Return the substring from the ith index character to end of string 
    System.out.println("Substring "+s.substring(3));
    
    //4 Returns the substring from i to j-1 index.
    System.out.println("Substring "+ s.substring(0,13));
    
    //5 String Concat
    String s1 = "Geeks";
    String s2 = "forGeeks";
    
    System.out.println("Concatenated string = " + s1.concat(s2));
    
    //6 Returns the index within the string
    // of the first occurrence of the specified string 
    String s4 = "Learn Share Learn";
    System.out.println("Index of Share " + s4.indexOf("Share"));
    
    //7 Returns the index within the string 
    //of the first occurrence of the specified string, starting at the specified index.
    System.out.println("Index of ea  = " + s4.indexOf("ea",3));
    
    //8 Returns the index within the string
    //of the last occurrence of the specified string.
    System.out.println("last index of a "+ s4.lastIndexOf("a"));
    
    //9 boolean checking equality of Strings
    Boolean out = "Geeks".equals("Geeks");
    Boolean out1 = "Geeks".equals("geeks");
    System.out.println("Checking Equality "+out);
    System.out.println("Checking Equality "+out1);
    
    //10 Compares string to another string, 
    //ignoring case considerations.
    
    Boolean out3 = "Geeks".equalsIgnoreCase("gEeks");
    System.out.println("Checking Equality " + out3);
    
    //11 If ASCII difference is zero then the two strings are similar
    int out4 = s1.compareTo(s2);
    int out5 = s1.compareToIgnoreCase(s2);
    System.out.println("the differenc between ASCII value is ="+out4);
    System.out.println("the differenc between ASCII value is ="+out5);
    
    // 12 using compareToIgnoreCase  if equal output 0
    int out6 = s1.compareToIgnoreCase(s2);
    System.out.println("the aschii difference is "+ out6);
    
    //13 converting all string to lower case
    String word1 = "GeekyMe";
    System.out.println("changing to lower Case = "+ word1.toLowerCase());
    
    //14 Converting cases
    String word2 = "GeekyMe";
    System.out.println("Changing to Upper case = "+ word2.toUpperCase());
    
    
    //15 Triming the word
    String word4 = "     Learn Share Learn   ";
    System.out.println("Trim the word = " + word4.trim());
    
    //16 Replacing characters
    
    String str1 = "feeksforfeeks";
    System.out.println("Original String = "+ str1);
    
    String str2 = str1.replace('f','g');
    System.out.println("Replaced f with g -> "+str2);
  }
}