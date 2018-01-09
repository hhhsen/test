package examstudent;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class DbUtil {
	private static String driverClass = "org.gjt.mm.mysql.Driver";
	private static String url = "jdbc:mysql://localhost:3306/myschool";
	private static String user = "root1";
	private static String password = "123123";
	static{
		try {
			Class.forName(driverClass);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	public static Connection getConnection(){
		Connection conn = null;
		try {
			conn = DriverManager.getConnection(url,user,password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static int update(Connection conn,String sql,Object...objs){
		PreparedStatement ps = null;
		int result = -1;
		try {
			ps = conn.prepareStatement(sql);
			if(objs != null){
				for(int i = 0;i < objs.length;i++){
					ps.setObject(i+1, objs[i]);
				}
			}
			result = ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		close(null,ps,null);
		return result;
	}
	public static List<Map<String,Object>> query(Connection conn,String sql,Object...objs){
		PreparedStatement ps = null;
		ResultSet rs = null;
		List<Map<String,Object>> list = new ArrayList<>();
		try{
			ps = conn.prepareStatement(sql);
			if(objs != null){
				for(int i = 0;i<objs.length;i++){
					ps.setObject(i+1, objs[i]);
				}
			}
			rs = ps.executeQuery();
			ResultSetMetaData rsd = rs.getMetaData();
			int columnCount = rsd.getColumnCount();
			while(rs.next()){
				Map<String,Object> map = new HashMap<>();
				for(int i = 1;i<=columnCount;i++){
					map.put(rsd.getColumnName(i),rs.getObject(i));
				}
				list.add(map);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		close(null,ps,rs);
		return list;
	}
	public static void close(Connection conn, PreparedStatement ps,ResultSet rs) {
		try {
			if(rs != null){
				rs.close();
			}
			if(ps != null){
				ps.close();
			}
			if(conn != null){
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
