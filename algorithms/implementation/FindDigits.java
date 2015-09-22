import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FindDigits {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int N = m;
			int count = 0;
			while (m > 0) {
				int r = m % 10;
				if (r != 0 && N % r == 0) {
					count++;
				}
				m = m / 10;
			}
			System.out.println(count);
		}

	}
}
