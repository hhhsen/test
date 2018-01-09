package examstudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Delectt {

	public static void main(String[] args) {
		System.out.println("请输入学生的准考证号：");
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		Connection conn = null;
		Statement stat = null;
		try {
			//1.
			Class.forName("org.gjt.mm.mysql.Driver");
			String url = "jdbc:mysql://localhost:3306/myschool";
			String user = "root1";
			String password = "123123";
			//2.
			conn = DriverManager.getConnection(url, user, password);
			//3.
			stat = conn.createStatement();
			//4.
			String sql = "delete from examstudent where ExamCard = " + s;
			int rs = stat.executeUpdate(sql);
			if(rs == 1){
				System.out.println("删除成功！");
			}else{
				System.out.println("删除失败！");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
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
