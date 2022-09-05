package LeetCode;
import java.util.Scanner;
import java.util.HashMap;

public class Roman_To_Integer{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        HashMap<Character, Integer> RomanValues = new HashMap<>();
        RomanValues.put('I', 1);
        RomanValues.put('V', 5);
        RomanValues.put('X', 10);
        RomanValues.put('L', 50);
        RomanValues.put('C', 100);
        RomanValues.put('D', 500);
        RomanValues.put('M', 1000);

        int n = 0;

        for(int i = 0; i < s.length() - 1; i++){
            if(RomanValues.get(s.charAt(i)) < RomanValues.get(s.charAt(i+1))) n -= RomanValues.get(s.charAt(i));
            else n += RomanValues.get(s.charAt(i));
        }
        n += RomanValues.get(s.charAt(s.length() - 1));
        System.out.println(n);
    }
}