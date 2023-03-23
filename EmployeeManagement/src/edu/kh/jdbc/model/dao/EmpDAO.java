package edu.kh.jdbc.model.dao;

import static edu.kh.jdbc.common.JDBCTemplate.close;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.model.dto.Emp;

public class EmpDAO {

	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	/** 1. 재직 사원 조회 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectAll(Connection conn) throws SQLException{
		
		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, DEPT_TITLE, JOB_NAME, SALARY, PHONE, EMAIL\r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "JOIN JOB USING (JOB_CODE)\r\n"
					+ "LEFT JOIN DEPARTMENT ON (DEPT_ID = DEPT_CODE)\r\n"
					+ "WHERE ENT_YN = 'N'\r\n"
					+ "ORDER BY JOB_CODE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String departmentTitle = rs.getString(3);
				String jobName = rs.getString(4);
				int salary = rs.getInt(5);
				String phone = rs.getString(6);
				String email = rs.getString(7);
				
				Emp emp = new Emp();
				
				emp.setEmpId(empId);
				emp.setEmpName(empName);
				emp.setDepartmentTitle(departmentTitle);
				emp.setJobName(jobName);
				emp.setSalary(salary);
				emp.setPhone(phone);
				emp.setEmail(email);
				
				empList.add(emp);
			}
			
		}finally {
			close(rs);
			close(stmt);
		}
		
		return empList;
	}


	/** 2. 퇴직 사원 조회 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> selectRetirement(Connection conn) throws SQLException {
		
		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, NVL(PHONE, '없음') PHONE, EMAIL, TO_CHAR(ENT_DATE, 'YYYY\"년\" MM\"월\" DD\"일\"') ENT_DATE \r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "WHERE ENT_YN = 'Y'\r\n"
					+ "ORDER BY ENT_DATE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);

			while(rs.next()) {
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String phone = rs.getString(3);
				String email = rs.getString(4);
				String entDate = rs.getString(5);
				
				Emp emp = new Emp();
				
				emp.setEmpId(empId);
				emp.setEmpName(empName);
				emp.setPhone(phone);
				emp.setEmail(email);
				emp.setEntDate(entDate);
				
				empList.add(emp);
			}
			
		}finally {
			close(rs);
			close(stmt);
		}
		
		return empList;
	}


	/** 3. 사원 1명 정보 조회 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @param input
	 * @return emp
	 * @throws SQLException
	 */
	public Emp selectEmpId(Connection conn, int input) throws SQLException{
		
//		Emp emp = new Emp(); (XXX)
		Emp emp = null; // 조회가 안 되면 아무것도 안 담김 (== null)
		
		try {
			String sql = "SELECT EMP_ID, EMP_NAME, DEPT_TITLE, JOB_NAME, SALARY, PHONE, EMAIL, HIRE_DATE, ENT_YN\r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "JOIN DEPARTMENT ON (DEPT_ID = DEPT_CODE)\r\n"
					+ "JOIN JOB USING (JOB_CODE)\r\n"
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, input);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) { // 조회 결과가 1행 뿐임!!! -> while(X), if(O)
				
				int empId = rs.getInt(1); // 읽어온 거 변수에 저장
				String empName = rs.getString(2);
				String departmentName = rs.getString(3);
				String jobName = rs.getString(4);
				int salary = rs.getInt(5);
				String phone = rs.getString(6);
				String email = rs.getString(7);
				Date hireDate = rs.getDate(8);
				String entYn = rs.getString(9);
				
				emp = new Emp(); // 조회 결과가 있으면 그때 새 emp에 담음.
				
				emp.setEmpId(empId); // 변수를 세팅
				emp.setEmpName(empName);
				emp.setDepartmentTitle(departmentName);
				emp.setJobName(jobName);
				emp.setSalary(salary);
				emp.setPhone(phone);
				emp.setEmail(email);
				emp.setHireDate(hireDate);
				emp.setEntYN(entYn);
				
				/* 합친 거
				  emp.setEmpId(rs.getInt("EMP_ID"));
				  --> 가독성 떨어진다고 실무에서는 위 방법을 더 많이 사용함
				 */
				
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return emp;
	}


	/** 4. 사원 정보 추가 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int insertEmp(Connection conn, Emp emp) throws SQLException{
		
		int result = 0;
		
		try {
			String sql = "INSERT INTO EMPLOYEE VALUES (SEQ_EMP_ID.NEXTVAL,"
					+ "?, ?, ?, ?, ?, ?, ?, ?, ?, ?, SYSDATE, NULL, 'N')";
			
			// empName, empNo, email, phone, deptCode, jobCode, salLevel, salary, bonus, managerId
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emp.getEmpName());
			pstmt.setString(2, emp.getEmpNo());
			pstmt.setString(3, emp.getEmail());
			pstmt.setString(4, emp.getPhone());
			pstmt.setString(5, emp.getDeptCode());
			pstmt.setString(6, emp.getJobCode());
			pstmt.setString(7, emp.getSalLevel());
			pstmt.setInt(8, emp.getSalary());
			pstmt.setDouble(9, emp.getBonus());
			pstmt.setInt(10, emp.getManagerId());
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	/** 5. 사원 정보 수정 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int updateEmp(Connection conn, Emp emp) throws SQLException{
		
		// 1. 결과 저장용 변수/객체 선언
		int result = 0;
		
		// 2. SQL 구문 작성
		//	  PreparedStatement(sql) / Statement() 생성
		
		try {
			String sql = "UPDATE EMPLOYEE \r\n"
					+ "SET EMAIL = ?, PHONE = ?, SALARY = ?, BONUS = ?\r\n"
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, emp.getEmail());
			pstmt.setString(2, emp.getPhone());
			pstmt.setInt(3, emp.getSalary());
			pstmt.setDouble(4, emp.getBonus());
			pstmt.setInt(5, emp.getEmpId());
			
			// 3. 수행 후 결과 반환 받아 결과 저장용 변수에 저장
			//    SELECT문 : executeQuery([SQL])
			//    DML문    : executeUpdqte([SQL])
			//    [SQL] 작성하는 경우 : Statement 객체 사용할 때
			result = pstmt.executeUpdate();			
			
		}finally {
			// 4. JDBC 객체 자원 반환
			close(pstmt);
		}
		// 5. 결과 반환
		return result;
	}


	/** 6. 사원 정보 삭제 SQL 수행 후 결과 반환 메서드
	 * @param conn
	 * @param empId
	 * @param check
	 * @return result
	 * @throws SQLException
	 */
	public int deleteEmp(Connection conn, int empId, char check) throws SQLException{
		
		int result = 0;
		
		try {
			String sql = "DELETE FROM EMPLOYEE\r\n"
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			
			result = pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		return result;
	}


	/** 7. 사원 퇴사 SQL 수행
	 * @param conn
	 * @param empId
	 * @param check
	 * @throws SQLException
	 */
	public void retireEmp(Connection conn, int empId) throws SQLException{
		// void !!!
		
		/*int result = 0;*/
		
		try {
			String sql = "UPDATE EMPLOYEE \r\n"
					+ "SET ENT_YN = 'Y', ENT_DATE = SYSDATE \r\n"
					+ "WHERE EMP_ID = ?";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empId);
			
			/*result = */pstmt.executeUpdate();
			
		}finally {
			close(pstmt);
		}
		
		/*return result;*/
	}
	
	
	/** 존재하는 사원인지, 퇴직한 사원인지 조회하는 SQL 수행 후 결과 반환
	 * @param conn
	 * @param empId
	 * @return check
	 * @throws SQLException
	 */
	public int checkEmployee(Connection conn, int empId) throws SQLException{
		int check = 0;
		
		try {
			String sql = "SELECT CASE \r\n"
					+ "			WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = ?) = 0\r\n"
					+ "			THEN 0\r\n"
					+ "			WHEN (SELECT COUNT(*) FROM EMPLOYEE WHERE EMP_ID = ? AND ENT_YN = 'Y') = 1\r\n"
					+ "			THEN 1\r\n"
					+ "			ELSE 2\r\n"
					+ "		END \"CHECK\"\r\n"
					+ "FROM DUAL";
			/*
			SELECT * 
			FROM (SELECT EMP_ID, EMP_NAME, NVL(DEPT_TITLE, '부서없음') DEPT_TITLE, HIRE_DATE
				FROM EMPLOYEE
				LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)
				ORDER BY HIRE_DATE DESC)
			WHERE ROWNUM <= 5
			*/
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, empId);
			pstmt.setInt(2, empId);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				check = rs.getInt("CHECK");
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return check;
	}
	

	/** 8. 
	 * @param conn
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> hireLately(Connection conn) throws SQLException {
		
		List<Emp> empList = new ArrayList<>();
		
		try {
			String sql = "SELECT *\r\n"
					+ "FROM (SELECT EMP_ID, EMP_NAME, DEPT_TITLE, HIRE_DATE, RANK() OVER(ORDER BY HIRE_DATE DESC) 순위\r\n"
					+ "	  FROM EMPLOYEE\r\n"
					+ "	  JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID))\r\n"
					+ "WHERE 순위 <= 5";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				int empId = rs.getInt(1);
				String empName = rs.getString(2);
				String departmentTitle = rs.getString(3);
				Date hireDate = rs.getDate(4);
				
				Emp emp = new Emp();
				
				emp.setEmpId(empId);
				emp.setEmpName(empName);
				emp.setDepartmentTitle(departmentTitle);
				emp.setHireDate(hireDate);
				
				empList.add(emp);
			}
			
		}finally {
			close(rs);
			close(pstmt);
		}
		
		return empList;
	}


	/** 부서별 통계 조회 SQL 수행 후 결과 반환
	 * @param conn
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment(Connection conn) throws SQLException {
		
		// 1. 결과 저장용 객체 생성
		List<Map<String, Object>> mapList = new ArrayList<>();
		
		try {
			// 2. SQL 작성 후 수행
			String sql = "SELECT DEPT_CODE, NVL(DEPT_TITLE, '부서없음') DEPT_TITLE, COUNT(*) 인원, FLOOR(AVG(SALARY)) 평균\r\n"
					+ "FROM EMPLOYEE\r\n"
					+ "LEFT JOIN DEPARTMENT ON (DEPT_CODE = DEPT_ID)\r\n"
					+ "GROUP BY DEPT_CODE, DEPT_TITLE\r\n"
					+ "ORDER BY DEPT_CODE";
			
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String deptTitle = rs.getString("DEPT_TITLE");
				int count = rs.getInt("인원");
				int avg = rs.getInt("평균");
				
				Map<String, Object> map = new LinkedHashMap<>();
											// 입력 순서가 유지되는 Map
				
				map.put("deptTitle", deptTitle);
				map.put("count", count);
				map.put("avg", avg);
				
				// Map을 List에 추가
				mapList.add(map);
			}
			
		}finally {
			close(rs);
			close(stmt);
		}
		
		// 5. 결과 반환
		return mapList;
	}
}
