package com.java.customer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;



/**
 * Servlet implementation class TestDb
 */
@WebServlet("/TestDb")
public class TestDb extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		String userName="root";
		String password="root";
		String jdbcUrl="jdbc:mysql://localhost:3306/testing?useSSL=false";
		String driver="com.mysql.jdbc.Driver";
		try {
			PrintWriter out=response.getWriter();
			out.println("Connection to db"+jdbcUrl);
			Class.forName(driver);
		Connection connection=DriverManager.getConnection(jdbcUrl, userName, password);
			out.println("Successfully");
			connection.close();
			
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new ServletException(e);
		}
	}

}
