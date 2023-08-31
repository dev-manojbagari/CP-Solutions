// Problem: A. Perfect Permutation
// Contest: Codeforces - Codeforces Round 144 (Div. 2)
// URL: https://codeforces.com/problemset/problem/233/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        if(n%2!=0){
         System.out.print(-1);
         return;
         }
         
        for(int i=1;i<=n;i++){
      if(i%2!=0){
       System.out.print((i+1)+" ");  
      }else{
       System.out.print((i-1)+" ");
      }
     }
     
     System.out.println();
         
    }
    
    
    // Other methods here
}