// Problem: A. Nearly Lucky Number
// Contest: Codeforces - Codeforces Beta Round 84 (Div. 2 Only)
// URL: https://codeforces.com/problemset/problem/110/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader  = new Scanner(System.in);
        long num = reader.nextLong();
        int luckyCount =0;
        
        while(num>0){
         long lastDigit = num%10;
         
         if(lastDigit==4||lastDigit==7)
          luckyCount++;
         
          
         num = num/10;
          
        }
        
        if(luckyCount==4||luckyCount==7){
         System.out.println("YES");
        }else
         System.out.println("NO");
        
        
        
        
    }
    
    // Other methods here
}