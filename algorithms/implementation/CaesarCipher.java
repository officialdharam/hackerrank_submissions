import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String S = sc.next();
		int r = sc.nextInt();
		r = r%26;
		char[] c = S.toCharArray();
		for (int i = 0; i < N; i++) {
			if (c[i] >= 'A' && c[i] <= 'Z') {
				if (c[i] + r > 'Z')
					c[i] = (char) (c[i] + r - 1 - 'Z' + 'A');
				else
					c[i] = (char) (c[i] + r);
			} else if (c[i] >= 'a' && c[i] <= 'z') {
				if (c[i] + r > 'z')
					c[i] = (char) (c[i] + r - 1 - 'z' + 'a');
				else
					c[i] = (char) (c[i] + r);
			}
		}

		System.out.println(new String(c));
	}
}
