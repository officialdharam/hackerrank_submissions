import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CutTheSticks {

   	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] a = new int[N];
		int min = Integer.MAX_VALUE;
		for (int i = 0; i < N; i++) {
			int nextInt = sc.nextInt();
			a[i] = nextInt;
			if (nextInt < min)
				min = nextInt;
		}
		int cuts = 0;
		do {
			cuts = 0;
			int tempMin = Integer.MAX_VALUE;
			for (int i = 0; i < N; i++) {
				if (a[i] != 0) {
					a[i] -= min;
					cuts++;
					if (tempMin > a[i] && a[i] != 0)
						tempMin = a[i];
				}
			}
			min = tempMin;
			if(cuts != 0)
				System.out.println(cuts);
		} while (cuts > 0);

	}
}
