package examstudent;

import java.sql.Connection;
import java.sql.SQLException;

public class Transactionn {
	public static void main(String [] args) {
		Connection conn = DbUtil.getConnection();
		try {
			//关闭自动提交
			conn.setAutoCommit(false);
			String sql = "update bank set money = money + ? where id = ? and money + ? > 0";
			//id = 3的减500
			int result = DbUtil.update(conn, sql, -500,3,-500);
			if(result<=0){
				System.out.println("减五百出错");
				conn.rollback();
				return;
			}
			//id = 1的加500
			result = DbUtil.update(conn, sql, 500,1,500);
			if(result<=0){
				System.out.println("加五百出错");
				conn.rollback();
				return;
			}
			//id = 3的减600
			result = DbUtil.update(conn, sql, -600,3,-600);
			if(result<=0){
				System.out.println("减六百出错");
				conn.rollback();
				return;
			}
			//id = 2的加600
			result = DbUtil.update(conn, sql, 600,2,600);
			if(result<=0){
				System.out.println("加六百出错");
				conn.rollback();
				return;
			}
			conn.commit();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
			DbUtil.close(conn, null, null);
			System.out.println("完毕");
		}
		
	}
}
