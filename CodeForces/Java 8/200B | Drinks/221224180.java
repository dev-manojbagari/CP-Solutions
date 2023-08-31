// Problem: B. Drinks
// Contest: Codeforces - Codeforces Round 126 (Div. 2)
// URL: https://codeforces.com/problemset/problem/200/B
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
import java.math.BigDecimal;
import java.math.RoundingMode;
 
public class Main {
 
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    double sum = 0;
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }
        System.out.printf("%.12f", sum/n);
         
    }
    
    // Other methods here
}