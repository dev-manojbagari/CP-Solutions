// Problem: A. Beautiful Matrix
// Contest: Codeforces - Codeforces Round 161 (Div. 2)
// URL: https://codeforces.com/problemset/problem/263/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
 int[][] arr = new int[5][5];
 int row = 0, col = 0;
 
 for (int i = 0; i < 5; i++) {
     for (int j = 0; j < 5; j++) {
  arr[i][j] = reader.nextInt();
  if (arr[i][j] == 1) {
      row = i;
      col = j;
  }
     }
 }
 
 int minStep = 0;
 
 minStep = Math.abs(2 - row);
 minStep += Math.abs(2 - col);
 
 System.out.println(minStep);
 
    }
}