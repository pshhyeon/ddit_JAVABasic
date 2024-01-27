package kr.or.ddit.study06.sec03;

public class Sing {
	// 곡명
	// 가수
	// 가사
	// 연도
	String song;
	String singer;
	String lyrics;
	int year;

	public Sing(String song, String singer, String lyrics, int year) {
		this.song = song;
		this.singer = singer;
		this.lyrics = lyrics;
		this.year = year;
	}

	@Override
	public String toString() {
		return "Sing [song=" + song + ", \nsinger=" + singer + ", \nlyrics=" + lyrics + ", \nyear=" + year + "]\n";
	}
}
