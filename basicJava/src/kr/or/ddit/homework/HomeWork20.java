package kr.or.ddit.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HomeWork20 {
	public static void main(String[] args) {
		HomeWork20 obj = new HomeWork20();
		obj.process();
	}

	public void process() {
		List<Map> parkList = dataInput();
		String carNum = "0000";
		// 입력한 차량 주차 시간 계산
		getMin(parkList, carNum);
		// 입력한 차량 주차 요금 계산
		pay(getMin(parkList, carNum));
		System.out.println(pay(getMin(parkList, carNum)));
		
	}

	public int pay(int min) {
		// 기본시간 | 기본요금 | 단위시간 | 단위요금
		// 60분 | 2000원 | 10분 | 300원
		// ex) 73분 = 기본요금 2000 + 단위시간 * 단위요금 600 = 2600원
		int sum = 2000;
		if (min > 60) {
			sum += Math.round((double) (min - 60) / 10) * 300;
//			sum += (min - 60) / 10 * 300;
//			if ((min - 60) % 10 != 0) {
//				sum += 300;
//			}
		}
		return sum;
	}

	public int getMin(List<Map> parkList, String carNum) {
		int parkIn = 0;
		int parkOut = 0;
		int total = 0;
		
		for (Map<String, String> m : parkList) {
			if (carNum.equals(m.get("차량번호"))) {
				if (m.get("내역").equals("입차")) {
					parkIn = getTime(m.get("시각"));
				}
				if (m.get("내역").equals("출차")) {
					parkOut = getTime(m.get("시각"));
				}
			}
			if (parkIn != 0 && parkOut != 0) {
				total += (parkOut - parkIn);
				parkIn = 0;
				parkOut = 0;
			}
		}

		return total;
	}

	public int getTime(String time) {
		// 05:34 -> 05 34
		// hour < 05
		// mins < 34
		// 334
		int hours = Integer.parseInt(time.split(":")[0]);
		int mins = Integer.parseInt(time.split(":")[1]);
		return hours * 60 + mins;
	}

	private List<Map> dataInput() {
		// 시각 차량번호 내역
		// 05:34 5961 입차
		// 06:00 0000 입차
		// 06:34 0000 출차
		// 07:59 5961 출차
		// 07:59 0148 입차
		// 18:59 0000 입차
		// 19:09 0148 출차
		// 22:59 5961 입차
		// 23:00 5961 출차
		List<Map> parkList = new ArrayList();

		Map m1 = new HashMap();
		m1.put("시각", "05:34");
		m1.put("차량번호", "5961");
		m1.put("내역", "입차");
		parkList.add(m1);

		Map m2 = new HashMap();
		m2.put("시각", "06:00");
		m2.put("차량번호", "0000");
		m2.put("내역", "입차");
		parkList.add(m2);

		Map m3 = new HashMap();
		m3.put("시각", "06:34");
		m3.put("차량번호", "0000");
		m3.put("내역", "출차");
		parkList.add(m3);

		Map m4 = new HashMap();
		m4.put("시각", "07:59");
		m4.put("차량번호", "5961");
		m4.put("내역", "출차");
		parkList.add(m4);

		Map m5 = new HashMap();
		m5.put("시각", "07:59");
		m5.put("차량번호", "0148");
		m5.put("내역", "입차");
		parkList.add(m5);

		Map m6 = new HashMap();
		m6.put("시각", "18:59");
		m6.put("차량번호", "0000");
		m6.put("내역", "입차");
		parkList.add(m6);

		Map m7 = new HashMap();
		m7.put("시각", "19:09 ");
		m7.put("차량번호", "0148");
		m7.put("내역", "출차");
		parkList.add(m7);

		Map m8 = new HashMap();
		m8.put("시각", "22:59");
		m8.put("차량번호", "5961");
		m8.put("내역", "입차");
		parkList.add(m8);

		Map m9 = new HashMap();
		m9.put("시각", "23:00");
		m9.put("차량번호", "5961");
		m9.put("내역", "출차");
		parkList.add(m9);

		Map m10 = new HashMap();
		m10.put("시각", "23:00");
		m10.put("차량번호", "0000");
		m10.put("내역", "출차");
		parkList.add(m10);

		return parkList;
	}

}
