import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

        public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int n = sc.nextInt();
			int a = sc.nextInt();
			int b = sc.nextInt();
			int ab = Math.abs(b - a);
			int min = Math.min(a, b);
			int sum = (n-1) * min;
			for (int t = 0; t < n ; t++) {
				if (t > 0)
					System.out.print(" ");
				System.out.print(sum);
                if(ab == 0)
					break;
				
				sum += ab;
			}
			System.out.println();
		}
	}
}
