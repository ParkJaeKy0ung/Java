package edu.kh.jdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import edu.kh.jdbc.dto.Employee2;

public class SelectNameDAO {

	public List<Employee2> select(String input) {
		
		List<Employee2> empList = new ArrayList();
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 메모리에 드라이버 객체 로드
			
			String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
			String user = "kh_pjk";
			String pw = "oracle_pjk123A";
			
			
			conn = DriverManager.getConnection(url, user, pw);
			
			String condition = null;
			
			if(input.toLowerCase().equals("null")) {
				condition = "WHERE JOB_NAME IS NULL";
			}else {
				condition = "WHERE JOB_NAME = '" + input + "'";
			}
			
			String sql = "SELECT NVL(DEPT_TITLE, '부서없음'), JOB_NAME, EMP_NAME, EMAIL "
					+ "FROM EMPLOYEE "
					+ "LEFT JOIN DEPARTMENT ON (DEPT_ID = DEPT_CODE) "
					+ "LEFT JOIN JOB USING (JOB_CODE) "
					+ "WHERE JOB_NAME = '" + input + "' "
					+ "ORDER BY EMP_NAME";
			
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String deptTitle = rs.getString(1);
				String jobName = rs.getString(2);
				String empName = rs.getString(3);
				String email = rs.getString(4);
				
				Employee2 emp = new Employee2(deptTitle, jobName, empName, email); // 객체 추가
				
				empList.add(emp); // 리스트 추가
				
			}
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
			try {
				
				if (rs != null) rs.close();
				if (stmt != null) stmt.close();
				if (conn != null) conn.close();
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return empList;
	}

}
