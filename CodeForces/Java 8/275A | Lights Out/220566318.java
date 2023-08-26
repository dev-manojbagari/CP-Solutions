// Problem: A. Lights Out
// Contest: Codeforces - Codeforces Round 168 (Div. 2)
// URL: https://codeforces.com/problemset/problem/275/A
// Memory Limit: 256 MB
// Time Limit: 2000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] lights = new int[3][3];
        int[][] org = new int[3][3];
 
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                lights[i][j] = in.nextInt();
                org[i][j] = 1;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (lights[i][j] == 0)
                    continue;
                if (lights[i][j] % 2 == 0)
                    continue;
                else {
                    org[i][j] = 1 - org[i][j];
                    if ((j + 1) < 3) {
 
                        org[i][j + 1] = 1 - org[i][j + 1];
                    }
                    if ((i + 1) < 3) {
                        org[i + 1][j] = 1 - org[i + 1][j];
                    }
                    if ((i - 1) >= 0) {
                        org[i - 1][j] = 1 - org[i - 1][j];
                    }
                    if ((j - 1) >= 0) {
                        org[i][j - 1] = 1 - org[i][j - 1];
                    }
 
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++)
                System.out.print(org[i][j]);
            System.out.println();
        }
        in.close();
 
    }
 
}