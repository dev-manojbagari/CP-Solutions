// Problem: A. Word Capitalization
// Contest: Codeforces - Codeforces Round 172 (Div. 2)
// URL: https://codeforces.com/problemset/problem/281/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
 String word = reader.next();
 
 String one = word.substring(0, 1);
 one = one.toUpperCase();
 String two = word.substring(1, word.length());
 word = one + two;
 System.out.println(word);
 
    }
    
    // Other methods here
}