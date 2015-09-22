import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String time = sc.next();
		DateFormat TWELVE_TF = new SimpleDateFormat("hh:mm:ssa");
		DateFormat TWENTY_FOUR_TF = new SimpleDateFormat("HH:mm:ss");
		try {
			
			System.out.println(TWENTY_FOUR_TF.format(TWELVE_TF.parse(time)));
		} catch (ParseException e) {
		}
		System.exit(0);
	}
}
