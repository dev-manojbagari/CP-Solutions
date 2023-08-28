// Problem: A. Panoramix's Prediction
// Contest: Codeforces - Codeforces Beta Round 69 (Div. 2 Only)
// URL: https://codeforces.com/problemset/problem/80/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
       Scanner reader = new Scanner(System.in);
       int n1 = reader.nextInt();
       int n2 = reader.nextInt();
       boolean ans = false;
       for(int i=1;n1+i<=Math.min(50,n2);i++){
         if(isPrime(n1+i)){
          ans = n1+i==n2;
          break;
          }
       }
        if(ans)
         System.out.println("YES");
     else
      System.out.println("NO");
     
    }
    
   static boolean isPrime(int n){
     
     // If n is less than or equal to 1, it is not prime
   if (n <= 1) {
     return false;
   }
  // Loop from 2 to the square root of n
  for (int i = 2; i <= Math.sqrt(n); i++) {
    // If n is divisible by i, it is not prime
    if (n % i == 0) {
      return false;
    }
  }
  // If none of the above conditions are met, n is prime
  return true;
     
     
     
    }
    
    // Other methods here
}