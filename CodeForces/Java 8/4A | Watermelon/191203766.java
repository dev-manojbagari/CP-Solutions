    import java.util.Scanner;
    public class Solution{
        
        public static void main(String[] a){
            
 Scanner input = new Scanner(System.in);
 int n = input.nextInt();
 
 if (n <= 2) {
     System.out.println("NO");
     return;
 }
 
 if (n % 2 == 0) {
     System.out.println("YES");
 
 } else {
     System.out.println("NO");
 
 }
            
        }
        
        
        
        
        
        
    }