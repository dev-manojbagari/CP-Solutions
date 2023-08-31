 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 
 for (int i = 0; i < t; i++) {
     int ts = sc.nextInt();
     int os = sc.nextInt();
 
     int n = sc.nextInt();
     int j = 0, l = 0;
     boolean yes = false;
     String status = sc.next();
 
     if (os == ts) {
  yes = true;
  // System.out.println("YES");
  // continue;
     }
 
     for (char c : status.toCharArray()) {
  if (c == '+') {
      j++;
  } else {
      l--;
  }
  if (os + j + l == ts)
      yes = true;
     }
 
 
     System.out.println(yes ? "YES" : os + j >= ts ? "MAYBE" : "NO");
 }
 
 // Other methods here
    }
 
}