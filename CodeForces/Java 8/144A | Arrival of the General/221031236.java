// Problem: A. Arrival of the General
// Contest: Codeforces - Codeforces Round 103 (Div. 2)
// URL: https://codeforces.com/problemset/problem/144/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int n = reader.nextInt();
        int min = Integer.MAX_VALUE;
        int minIdx=0,maxIdx=0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0;i<n;i++){
         int num = reader.nextInt();
         if(min>=num){
          min=num;
          minIdx=i;
         }
         if(max<num){
          max=num;
          maxIdx=i;
         }
        }
        
        
        if((minIdx==n-1&&maxIdx==0)||min==max)
         System.out.print(0);
        else if(minIdx<maxIdx)
         System.out.println(maxIdx+(n-1-minIdx)-1);
        else
         System.out.println(maxIdx+(n-1-minIdx));
        
    }
    
    // Other methods here
}