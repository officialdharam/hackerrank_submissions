import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Map<String, String> MAP = new HashMap<String, String>();
		MAP.put("1", "one minute");
		MAP.put("2", "two minutes");
		MAP.put("3", "three minutes");
		MAP.put("4", "four minutes");
		MAP.put("5", "five minutes");
		MAP.put("6", "six minutes");
		MAP.put("7", "seven minutes");
		MAP.put("8", "eight minutes");
		MAP.put("9", "nine minutes");
		MAP.put("10", "ten minutes");
		MAP.put("11", "eleven minutes");
		MAP.put("12", "twelve minutes");
		MAP.put("13", "thirteen minutes");
		MAP.put("14", "fourteen minutes");
		MAP.put("15", "quarter");
		MAP.put("16", "sixteen minutes");
		MAP.put("17", "seventeen minutes");
		MAP.put("18", "eighteen minutes");
		MAP.put("19", "ninteen minutes");
		MAP.put("20", "twenty minutes");
		MAP.put("21", "twenty one minutes");
		MAP.put("22", "twenty two minutes");
		MAP.put("23", "twenty three minutes");
		MAP.put("24", "twenty four minutes");
		MAP.put("25", "twenty five minutes");
		MAP.put("26", "twnety six minutes");
		MAP.put("27", "twenty seven minutes");
		MAP.put("28", "twenty eight minutes");
		MAP.put("29", "twenty nine minutes");

		Map<Integer, String> MAP2 = new HashMap<Integer, String>();
		MAP2.put(1, "one");
		MAP2.put(2, "two");
		MAP2.put(3, "three");
		MAP2.put(4, "four");
		MAP2.put(5, "five");
		MAP2.put(6, "six");
		MAP2.put(7, "seven");
		MAP2.put(8, "eight");
		MAP2.put(9, "nine");
		MAP2.put(10, "ten");
		MAP2.put(11, "eleven");
		MAP2.put(12, "twelve");

		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		String string = MAP2.get(H);
		if (M == 0) {
			System.out.println(string + " o' clock");
		} else if (M == 30) {
			System.out.println("half past " + string);
		} else if (M > 30) {
			int i = 60 - M;
			String string2 = MAP.get(i+"");
			System.out.println(string2+" to "+MAP2.get((H+1) % 12));
		} else {
			String string2 = MAP.get(M+"");
			System.out.println(string2+" past "+MAP2.get(H));
		}
	}
}
