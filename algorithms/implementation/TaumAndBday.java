import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

   public static void main(String[] args) {
		
		//System.out.println(Long.MAX_VALUE);
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			long B = sc.nextInt();
			long W = sc.nextInt();
			long X = sc.nextInt();
			long Y = sc.nextInt();
			long Z = sc.nextInt();
			long cost = 0;
			long M = Math.min(X, Y);
			long N = Math.max(X, Y);
			if (M + Z < N) {
				if (M == X) {
					cost = W * (M + Z);
					cost += B * M;
				} else {
					cost = B * (M + Z);
					cost += W * M;
				}
			} else {
				cost = B * X;
				cost += W * Y;
			}
			System.out.println(cost);
		}
	}
}
