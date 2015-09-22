import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndBeast {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int N = sc.nextInt();
			int pivot = getPivot(N);
			if(pivot < 0)
				System.out.println(-1);
			else {
				char[] c = new char[N];
				int j = 0;
				for (; j < pivot; j++) {
					c[j] = '5';
				}
				for (; j < N; j++) {
					c[j] = '3';
				}
				System.out.println(new String(c));
			}
		}
	}

	static int getPivot(int N) {
		while (N > 0) {
			if (N % 3 == 0)
				break;
			else {
				N -= 5;
			}
		}
		return N;
	}
}
