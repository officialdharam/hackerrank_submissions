import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a[][] = new int[N][N];
		for (int i = 0; i < N; i++) {
			String S = sc.next();
			char[] C = S.toCharArray();
			for (int j = 0; j < N; j++) {
				a[i][j] = C[j] - 48;
			}
		}

		for (int i = 1; i < N - 1; i++) {
			for (int j = 1; j < N - 1; j++) {
				int m = a[i + 1][j];
				int n = a[i - 1][j];
				int o = a[i][j + 1];
				int p = a[i][j - 1];
				if (a[i][j] > m && a[i][j] > n && a[i][j] > o && a[i][j] > p) {
					a[i][j] = 10;
				}
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N ; j++) {
				if (a[i][j] == 10) {
					System.out.print('X');
				} else
					System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}
}
