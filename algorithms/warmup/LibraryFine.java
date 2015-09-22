import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class LibraryFine {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int dd1, mm1, yy1;
		int dd2, mm2, yy2;
		dd1 = sc.nextInt();
		mm1 = sc.nextInt();
		yy1 = sc.nextInt();

		dd2 = sc.nextInt();
		mm2 = sc.nextInt();
		yy2 = sc.nextInt();

		Calendar cal1 = Calendar.getInstance();
		cal1.set(Calendar.YEAR, yy1);
		cal1.set(Calendar.MONTH, mm1);
		cal1.set(Calendar.DATE, dd1);
		
		
		Calendar cal2 = Calendar.getInstance();
		cal2.set(Calendar.YEAR, yy2);
		cal2.set(Calendar.MONTH, mm2);
		cal2.set(Calendar.DATE, dd2);
		
		if(cal1.before(cal2))
			System.out.println(0);
		
		else if (yy1 - yy2 > 0)
			System.out.println(10000);
		else if (mm1 - mm2 > 0) {
			System.out.println(500 * (mm1 - mm2));
		} else if (dd1 - dd2 > 0) {
			System.out.println(15 * (dd1 - dd2));
		}else{
			System.out.println(0);
		}
	}
}
