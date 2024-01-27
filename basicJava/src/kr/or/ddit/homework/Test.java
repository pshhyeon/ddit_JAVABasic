package kr.or.ddit.homework;
import java.util.*;
public class Test {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		for (int i = 0; i < 1000; i++) l.add((new Random().nextInt(6) + 1) + (new Random().nextInt(6) + 1));
		for (int i = 2; i <= 12; i++) {
			int cnt = Collections.frequency(l, i);
			String s = "";
			for (int j = 0; j < cnt * 100 / l.size(); j++) s += "■";
			System.out.printf("%2d: %s\n", i, s);
		}
	}
}