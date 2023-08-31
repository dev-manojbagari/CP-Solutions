 
import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 int t = sc.nextInt();
 
 for (int i = 0; i < t; i++) {
     int ts = sc.nextInt();
     int os = sc.nextInt();
 
     int n = sc.nextInt();
     int tj = os, current = os;
     boolean yes = false;
     String status = sc.next();
 
     if (os == ts) {
  yes = true;
   System.out.println("YES");
   continue;
     }
 
     for (char c : status.toCharArray()) {
  if (c == '+') {
      tj++;
      current++;
  } else {
      current--;
  }
  if (current == ts)
      yes = true;
     }
 
 
     System.out.println(yes ? "YES" : tj >= ts ? "MAYBE" : "NO");
 }
 
 // Other methods here
    }
 
}