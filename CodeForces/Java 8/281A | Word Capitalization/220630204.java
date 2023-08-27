import java.util.Scanner;
 
public class Main {
 
    public static void main(String[] args) {
 Scanner reader = new Scanner(System.in);
 String word = reader.next();
 
 String one = word.substring(0, 1);
 one = one.toUpperCase();
 String two = word.substring(1, word.length());
 word = one + two;
 System.out.println(word);
 
    }
 
    // Other methods here
}