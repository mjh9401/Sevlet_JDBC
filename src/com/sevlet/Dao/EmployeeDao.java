package com.sevlet.Dao;

public class EmployeeDao {
//	response.setContentType("text/html; charset=utf-8");
//
//	String query = request.getParameter("q");
//	String field = request.getParameter("f");
//	Map<String, Object> ss = new HashMap<>();
//	
//	//System.out.println(query);
//	//System.out.println(field);
//
//	Connection con = null;
//	Statement stmt = null;
//	ResultSet rs = null;
//	
//	String sql = "SELECT * FROM employee";
//	String name = null;
//
//	try {
//		Class.forName("com.mysql.cj.jdbc.Driver");
//		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useUnicode=true&serverTimezone=Asia/Seoul", // DB URL
//				"root", "0000"); // USER_NAME과 PASSWORD
//		stmt = con.createStatement();
//
//		rs = stmt.executeQuery(sql);
//
////		List<Map<String, Object>> sss = new ArrayList<>();
//		String html = "";
//
//		html += "<h1>직원정보 조회</h1>";
////		while (rs.next()) {
////			ss.put("idx", rs.getInt("idx"));
////			ss.put("name", rs.getString("name"));
////			ss.put("address", rs.getString("address"));
////			ss.put("email", rs.getString("email"));
////			ss.put("tel", rs.getString("tel"));
////		}
//		//name = (String) ss.get("name");
//		response.getWriter().append(html);
//		//response.getWriter().append(name);
//
//		System.out.println("Success");
//	} catch (SQLException ex) {
//		System.out.println("SQLException" + ex);
//		ex.printStackTrace();
//	} catch (Exception ex) {
//		System.out.println("Exception:" + ex);
//		ex.printStackTrace();
//	} finally {
//		try {
//			if(con != null) {
//				con.close();
//			}
//		} catch (Exception e) {
//			
//		}
//	}
}
