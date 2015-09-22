import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float ps = 0, ng = 0, zr = 0;
		int num;
		for (int i = 0; i < n; i++) {
			num = sc.nextInt();
			if (num > 0)
				ps++;
			else if (num < 0)
				ng++;
			else
				zr++;
		}
		
		System.out.format("%4.3f", ps/n);
		System.out.println();
		System.out.format("%4.3f", ng/n);
		System.out.println();
		System.out.format("%4.3f", zr/n);
	}
}
