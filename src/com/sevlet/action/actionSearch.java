package com.sevlet.action;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sevlet.dto.Member;


@WebServlet("/actionSearch")
public class actionSearch extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyWord = request.getParameter("search");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		int idx =0;
		String name = null;
		String address = null;
		String email = null;
		String tel = null;

		String sql = "select * from employee where name = ?";
		try {
			// 1. JDBC ����̹� �ε�
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// 2. Connection ����
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/company?useUnicode=true&serverTimezone=Asia/Seoul", // DB URL
					"root", "0000");// USER_NAME�� PASSWORD
			
			// 3. PreparedStatement ��ü ����, ��ü ������ SQL ���� ����
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, keyWord);
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				/*
				 * SELECT�� ���� ����� �÷����� �о������
				 * getString(), getInt()���� �޼��带 ����մϴ�.
				 * -�ش� �޼����� �ް԰����� �о�� ���̺��� �÷����� �����ϴϴ�.
				 */
				idx = rs.getInt("idx");
				name = rs.getString("name");
				address = rs.getString("address");
				email = rs.getString("email");
				tel = rs.getString("tel");
				//System.out.println("idx : "+idx+"name : "+name+"address : "+address+"email : "+email+"tel : "+tel);
			}
			System.out.println("Success");
			
			Member member = new Member(idx,name,address,email,tel);
			List<Member> members = new ArrayList<>();
			members.add(member);
			
			request.setAttribute("membmers", members);
			
			RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
			
		} catch (SQLException ex ) {
			System.out.println("SQLException" + ex);
		} catch (ClassNotFoundException ex) {
			System.out.println("Exception:" + ex);
		} finally {
			if(rs !=null) {
				try {
					rs.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			
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
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
