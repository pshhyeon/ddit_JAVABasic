package kr.or.ddit.study06.sec05;

// ojdbc에 있는거 가져와서쓰는거임
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConn {

	// DB에 여러번 접속하면 안되기 때문에 싱글톤에 접속
	private static Connection conn = null;

	public static Connection getConnection() {

		// localhost <- IP: 1521 <-PORT: xe <- SID (오라클 접속할때 입력한 정보)
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "PSH";
		String pwd = "java";

		if (conn == null) {
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				conn = DriverManager.getConnection(url, user, pwd);
			} catch (SQLException e) {
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
		return conn;

	}

}
