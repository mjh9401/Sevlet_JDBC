package com.sevlet.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/actionSevlet")
public class actionSevlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idx = 1;
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		String tel = request.getParameter("tel");
		
		
		
		/*request 값들 null인지 확인 후 db연결 데이터 삽입*/
		

		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String sql = "insert into employee(idx,name,address,email,tel) values (?,?,?,?,?)";

		try {
			// 1. JDBC 드라이버 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");
			// 2. Connection 생성
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useUnicode=true&serverTimezone=Asia/Seoul", // DB URL
					"root", "0000"); // USER_NAME과 PASSWORD
			// 3. PreparedStatement 객체 생성, 객체 생성시 SQL 문장 저장
			pstmt = con.prepareStatement(sql);
			
			// 4. pstmt.set<데이터타입>(? 순서, 값) ex) setString(), .setInt()...
			
			idx = idx +1;
			pstmt.setInt(1, idx);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, email);
			pstmt.setString(5, tel);
			
			// 5. SQL 문장을 실행하고 결과를 리턴 - SQL 문장 실행 후, 변경된 row 수 in type 리턴
			int row = pstmt.executeUpdate();
		
			System.out.println("Success");
		} catch (SQLException ex ) {
			System.out.println("SQLException" + ex);
		} catch (ClassNotFoundException ex) {
			System.out.println("Exception:" + ex);
		} finally {
			if(pstmt != null) {
				try {
					pstmt.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
			if(con != null) {
				try {
					con.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
