// Problem: A. Word
// Contest: Codeforces - Codeforces Beta Round 55 (Div. 2)
// URL: https://codeforces.com/problemset/problem/59/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String word = reader.next();
        
        int countLowerCase=0;
        int countUpperCase =0;
        
        for(char c:word.toCharArray()){
         if(Character.isLowerCase(c))
          countLowerCase++;
         else
          countUpperCase++;
        }
        
        if(countLowerCase>=countUpperCase)
         word=word.toLowerCase();
     else
      word=word.toUpperCase();
        
        System.out.println(word);
        
    }
    
    // Other methods here
}