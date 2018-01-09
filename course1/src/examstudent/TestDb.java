package examstudent;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public class TestDb {
	private static Connection conn = DbUtil.getConnection();
	
	public static void main(String[] args) {
		//insertDb();
		queryDb();
		//baseName();
	}
	
	/**
	 * 增加数据
	 */
	public static void insertDb(){
		String sql = "insert into examstudent(FlowID,StudentName,Location,Grade)values(?,?,?,?)";
		int result = DbUtil.update(conn, sql, 8,"张三","深圳",88);
		System.out.println(result);
		DbUtil.close(conn, null, null);
	}
	/**
	 * 查询数据
	 */
	public static void queryDb(){
		String sql = "select FlowID,StudentName,Grade from examstudent where FlowID = ?";
		List<Map<String,Object>> list = DbUtil.query(conn, sql, 5);
		for(Map<String,Object>map:list){
			System.out.println("ID:"+map.get("FlowID"));
			System.out.println("Name:"+map.get("StudentName"));
			System.out.println("Grade"+map.get("Grade"));
		}
		DbUtil.close(conn, null, null);
	}
	/**
	 * 获取数据库信息
	 */
	public static void baseName(){
		DatabaseMetaData dmd;
		try {
			dmd = conn.getMetaData();
			System.out.println("数据库名称："+dmd.getDatabaseProductName());
			System.out.println("驱动信息："+dmd.getDriverName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
		DbUtil.close(conn, null, null);
	}
	/*public static void rsmd(){
		String sql = "select FlowID,StudentName,Grade from examstudent where FlowID = ?";
		ResultSet rs = DbUtil.query(conn, sql, 5);
		try{
			ResultSetMetaData rsd = rs.getMetaData();
			System.out.println("列数："+rsd.getColumnCount());
			System.out.println("列名："+rsd.getColumnName(1));
			System.out.println("列类型："+rsd.getColumnType(1));
		}catch(SQLException e){
			e.printStackTrace();
		}
		DbUtil.close(conn, null, null);
	}*/
	

}
