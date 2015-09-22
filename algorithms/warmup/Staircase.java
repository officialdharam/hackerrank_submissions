import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		char[] c = new char[n];
		Arrays.fill(c, ' ');
		String s = null;
		for (int i = 0; i < n; i++) {
			c[n - i-1] = '#';
			s = new String(c);
			System.out.println(s);
			s = null;
		}
	}
}
