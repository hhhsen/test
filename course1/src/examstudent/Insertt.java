package examstudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Insertt {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		try {
			String url = "jdbc:mysql://localhost:3306/myschool";
			String user = "root1";
			String password = "123123";
			// 1.加载数据库驱动程序
			Class.forName("org.gjt.mm.mysql.Driver");
			// 2.获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 3.取得Statement
			String sql = "insert into examstudent(FlowID,StudentName,Type,Grade)values(?,?,?,?)";
			ps = conn.prepareStatement(sql);
			//4.设置值
			ps.setInt(1, 9);
			ps.setString(2, "张三");
			ps.setObject(3, 4);
			ps.setInt(4, 88);
			// 5.执行SQL语句
			int rs = ps.executeUpdate();
			System.out.println(rs);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
