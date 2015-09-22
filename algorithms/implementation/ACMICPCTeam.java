import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		String[] S = new String[N];
		for (int i = 0; i < N; i++) {
			S[i] = sc.next();
		}
		int maxTopics = Integer.MIN_VALUE;
		Map<Integer, List<Pair>> MAP = new HashMap<Integer, List<Pair>>();
		for (int i = 0; i < N - 1; i++) {
			BitSet bs = getBitSet(S[i]);
			for (int j = i + 1; j < N; j++) {
				if (i != j) {
					BitSet bs2 = getBitSet(S[j]);
					bs2.or(bs);
					int cardinality = bs2.cardinality();
					if (maxTopics <= cardinality) {
						maxTopics = cardinality;
						List<Pair> list = MAP.get(maxTopics);
						if (list == null)
							list = new ArrayList<Pair>();
						list.add(new Pair(i, j));
						MAP.put(maxTopics, list);
					}
				}
			}
		}
		List<Pair> list = MAP.get(maxTopics);
		System.out.println(maxTopics);
		System.out.println(list.size());
	}

	static BitSet getBitSet(String s) {
		BitSet bs = new BitSet();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '1')
				bs.set(i);
		}
		return bs;
	}
}

class Pair {
	@Override
	public String toString() {
		return "Pair [a=" + a + ", b=" + b + "]";
	}

	int a, b;

	Pair(int a, int b) {
		this.a = a;
		this.b = b;
	}

}
