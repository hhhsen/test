package examstudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Selectt {

	public static void main(String[] args) {
		System.out.println("请选择您要输入的类型：");
		System.out.println("	a：准考证号");
		System.out.println("	b：身份证号");
		Scanner scan = new Scanner(System.in);
		String x = scan.nextLine();
		String y;
		if (x.equals("a")) {
			System.out.println("请输入准考证号：");
			y = scan.nextLine();
			selectExamCard(y);
		} else if (x.equals("b")) {
			System.out.println("请输入身份证号：");
			y = scan.nextLine();
			selectID(y);
		} else {
			System.out.println("您的输入有误！请重新进入程序...");
		}
	}

	private static void selectID(String y) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			// 1.加载数据库驱动程序
			Class.forName("org.gjt.mm.mysql.Driver");
			String url = "jdbc:mysql://localhost:3306/myschool";
			String user = "root1";
			String password = "123123";
			// 2.获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 3.取得Statement
			stat = conn.createStatement();
			// 4.执行SQL语句
			String sql = "select StudentName,IDCard,ExamCard,Grade from examstudent where IDCard = " + y;
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				System.out.println("姓名：" + rs.getString(1));
				System.out.println("身份证号：" + rs.getString(2));
				System.out.println("准考证号：" + rs.getString(3));
				System.out.println("分数：" + rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stat != null) {
					stat.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

	private static void selectExamCard(String y) {
		Connection conn = null;
		Statement stat = null;
		ResultSet rs = null;
		try {
			// 1.加载数据库驱动程序
			Class.forName("org.gjt.mm.mysql.Driver");
			String url = "jdbc:mysql://localhost:3306/myschool";
			String user = "root1";
			String password = "123123";
			// 2.获取数据库连接
			conn = DriverManager.getConnection(url, user, password);
			// 3.取得Statement
			stat = conn.createStatement();
			// 4.执行SQL语句
			String sql = "select StudentName,IDCard,ExamCard,Grade from examstudent where ExamCard = " + y;
			// executeQuery()查询数据，executeUpdate()修改数据
			rs = stat.executeQuery(sql);
			while (rs.next()) {
				System.out.println("姓名：" + rs.getString(1));
				System.out.println("身份证号：" + rs.getString(2));
				System.out.println("准考证号：" + rs.getString(3));
				System.out.println("分数：" + rs.getString(4));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null) {
					rs.close();
				}
				if (stat != null) {
					stat.close();
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
