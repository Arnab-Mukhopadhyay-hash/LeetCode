package LeetCode;
import java.util.Scanner;

public class Palindrom {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		/* A rather brute force approach with integers the complexity is O(lenght of the number) */
//		int n = scan.nextInt();
//		int dn = n;
//		int sum = 0;
//		while(n != 0) {
//			int d = n%10;
//			sum = sum*10 + d;
//			n = n/10;
//		}
//		if(sum == dn) System.out.println("true");
//		else System.out.println("false");
		
		/* Using strings */
		// A simpler approach
		String str = scan.next();
		String nstr = "";
		for(int i = 0; i <str.length(); i++) {
//			char ch = str[i];
			nstr = str.charAt(i) + nstr;
		}
		System.out.println(str.equals(nstr));
	}

}
