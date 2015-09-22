import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Encryption {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int L = S.length();
		double sqrt = Math.sqrt(L);
		double A = Math.floor(sqrt);
		double B = Math.ceil(sqrt);
		int X = (int) Math.round(A);
		int Y = (int) Math.round(B);
		if (X * Y < L) {
			X = Y;
		}
		char[][] C = new char[X][Y];

		for (int i = 0; i < L; i++) {
			C[i / Y][i % Y] = S.charAt(i);
		}

		int counter = 0;
		for (int i = 0; i < X * Y; i++) {
			if (counter % X == 0 && counter > 0)
				System.out.print(" ");
			char c = C[i % X][i / X];
			if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z'))
				System.out.print(c);
			counter++;
		}
	}
}
