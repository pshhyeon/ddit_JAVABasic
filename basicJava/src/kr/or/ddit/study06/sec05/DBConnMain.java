package kr.or.ddit.study06.sec05;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnMain {
	public static void main(String[] args) {
		DBConnMain db = new DBConnMain();
		db.selectAll();
	}

	private Connection conn = null;
	private Statement stmt = null;
	private ResultSet rs = null;

	public void selectAll() {
		try {
			conn = DBConn.getConnection(); // DB접속정보
			stmt = conn.createStatement(); // 쿼리를 DB에 전송

			String sql = "  SELECT MEM_ID, MEM_NAME, MEM_BIR FROM MEMBER  " + 
						" WHERE MEM_ID = 'a001'";
			// 쿼리 를 작성할 때 혹시 모를 실수를 대비해서 앞뒤에 공백을 넣는게 좋다
			rs = stmt.executeQuery(sql); // 결과 저장
			while (rs.next()) {// 결과값이 있으면 계속 출력한다
				String id = rs.getString("MEM_ID");
				String name = rs.getString("MEM_NAME");
				String bir = rs.getString("MEM_BIR");

				System.out.println(id + "\t" + name + "\t" + bir);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
