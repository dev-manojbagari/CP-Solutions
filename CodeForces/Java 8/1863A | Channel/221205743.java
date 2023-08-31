// Problem: A. Channel
// Contest: Codeforces - Pinely Round 2 (Div. 1 + Div. 2)
// URL: https://codeforces.com/contest/1863/problem/0
// Memory Limit: 256 MB
// Time Limit: 1000 ms
// 
// Powered by CP Editor (https://cpeditor.org)
 
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
    
  
    
    
    int t = reader.nextInt();
    outer:
    for(int i=0;i<t;i++){
     
     int ts = reader.nextInt();
     int os = reader.nextInt();
    
     int n = reader.nextInt();
     int joinCount=0,leaveCount=0;
    boolean yes=false,no=false,maybe=false,notLeft=true;
      if(!reader.hasNext()) break;
      String status = reader.next();
     
     
     
     
         
     
      for(char c:status.toCharArray()){
      if(c=='+'){
       joinCount++;
            
       
      }else{
      
       leaveCount++;
      }
      
      if(joinCount+os-leaveCount==ts){
        yes=true;
        
      
     }}
     
     if(os==ts){
      System.out.println("YES");
     
     }else if(yes){
      System.out.println("YES");
     }else if(os+joinCount>=ts){
      System.out.println("MAYBE");
      
     }else {
      System.out.println("NO");
           
     }
     
    
     
     
     
     
     
     
     
     
    }
    
    
    }
    
    // Other methods here
}