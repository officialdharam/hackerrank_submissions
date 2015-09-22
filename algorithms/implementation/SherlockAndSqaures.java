import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			A--;
			double sqrtA = Math.sqrt(A);
			double floorA = Math.floor(sqrtA);
			long roundA = Math.round(floorA);

			double sqrtB = Math.sqrt(B);
			double floorB = Math.floor(sqrtB);
			long roundB = Math.round(floorB);
			long count = roundB - roundA;
			System.out.println(count);
		}

	}
}
