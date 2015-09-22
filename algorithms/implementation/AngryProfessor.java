import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class AngryProfessor {

	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) {
		Solution sol = new Solution();
		int noOfTestCases = Integer.parseInt(sol.read());
		String firstLine = null;
		String secondLine = null;
		String[] split = null;
		for (int i = 0; i < noOfTestCases; i++) {
			firstLine = sol.read();
			split = firstLine.split(" ");

			DS d = new DS();
			d.N = Integer.parseInt(split[0]);
			d.K = Integer.parseInt(split[1]);
			
			secondLine = sol.read();
			split = secondLine.split(" ");
			
			for(int j = 0 ; j < d.N ; j++){
				if(split[j].charAt(0) == '-' || split[j].charAt(0) == '0')
					d.P++;
			}
			System.out.println(d.P < d.K ? "YES":"NO");
		}
	}
	
	private String read() {
		String readString = null;
		try {
			readString = br.readLine();
		} catch (IOException ioe) {
			System.out.println("IO error trying to read your name!");
		}
		return readString;
	}
}

class DS{
	int N, K, P;	
}
