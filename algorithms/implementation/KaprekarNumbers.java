import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class KaprekarNumbers {

    	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int P = sc.nextInt();
		int Q = sc.nextInt();
		int count = 0;
		for (long i = P; i <= Q; i++) {
			long S = i * i;
			String T = S + "";
			int l = T.length();

			String L = T.substring(0, l / 2);
			String R = T.substring(l / 2, l);

			int LInt = 0;
			int RInt = 0;
			try {
				LInt = Integer.parseInt(L);
			} catch (Exception e) {

			}
			try {
				RInt = Integer.parseInt(R);
			} catch (Exception e) {

			}
			if (LInt + RInt == i) {
				if (count > 0){
					System.out.print(" ");
				}
				count++;
				System.out.print(i);
			}
		}
		if(count == 0)
			System.out.println("INVALID RANGE");
	}
}
