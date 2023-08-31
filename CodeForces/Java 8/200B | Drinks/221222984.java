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
        Scanner reader = new Scanner(System.in);
        
        int td = reader.nextInt();
        BigDecimal oj = new BigDecimal("0");
        
        for(int i=0;i<td;i++)
         oj=oj.add(new BigDecimal(reader.next()));
         
        System.out.println(oj.divide(BigDecimal.valueOf(td), 12, RoundingMode.HALF_UP));
         
    }
    
    // Other methods here
}