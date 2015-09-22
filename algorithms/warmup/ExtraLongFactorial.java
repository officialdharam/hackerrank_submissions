import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ExtraLongFactorial {

  public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		BigInteger b2 = new BigInteger(1 + "");
		BigInteger b1 = new BigInteger(1 + "");
		BigInteger factorial = null;
		long l = 1L;
		int k = 0;
		if (n > 15) {
			k = 16;
		} else
			k = n;
		for (int i = 1; i <= k; i++) {
			l *= i;
		}

		
		factorial = new BigInteger(l + "");

		for (int i = 17; i <= n; i++) {
			b2 = new BigInteger(i + "");
			factorial = factorial.multiply(b2);
		}
		
		System.out.println(factorial.toString());
	}
}
