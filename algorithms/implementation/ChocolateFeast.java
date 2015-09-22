import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ChocolateFeast {

    public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int t = in.nextInt();
		for (int i = 0; i < t; i++) {
			System.out.println(Solve(in.nextInt(), in.nextInt(), in.nextInt()));
		}
	}

	private static long Solve(int N, int C, int M) {
		int c = N / C;
		int w = c;
		int k = 0;
		while (w >= M) {
			k = 0;
			k = w / M;
			w = (w % M) + k;
			c += k;
		}
		return c;
	}
    
    
}
