package kr.or.ddit.study06.sec03;

import java.util.ArrayList;

public class SingExample {
	public static void main(String[] args) {
		ArrayList<Sing> s = new ArrayList<>();
		s.add(new Sing("멋쟁이도마도(2024ver)", "박상현",
				"\n울퉁불퉁 멋진 몸매에 빨간옷을입고~\n 새콤달콤 향기풍기는~ 멋쟁이 토.마.토 토마토!\n 나! 는! 야! 쥬스될거야~ 꿀꺽!\n 나! 는! 야! 케첩될거야~ 찍!\n 나! 는! 야! 춤을출꺼야 헤이!\n 뽐내는 토마토 토마토\n",
				2024));
		s.add(new Sing("ㄱㄱㄱ", "ㄴㄴㄴ", "ㄷㄷㄷ", 2023));
		s.add(new Sing("ㄹㄹㄹ", "ㅁㅁㅁ", "ㅂㅂㅂ", 2023));
		s.add(new Sing("ㅅㅅㅅ", "ㅇㅇㅇ", "ㅈㅈㅈ", 2023));
		s.add(new Sing("ㅊㅊㅊ", "ㅋㅋㅋ", "ㅌㅌㅌ", 2023));
		
		
		for (Sing sing : s) {
			System.out.println(sing);
		}
	}
}
