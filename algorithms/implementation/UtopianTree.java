import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class UtopianTree {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int m = sc.nextInt();
			int l = 1;
			for (int j = 0; j < m; j++) {
				if (j % 2 == 0)
					l *= 2;
				else
					l += 1;
			}
			System.out.println(l);
		}
	}
}
