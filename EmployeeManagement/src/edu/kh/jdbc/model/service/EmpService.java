package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

/**
 * @author user1
 *
 */
public class EmpService {

	private EmpDAO dao = new EmpDAO();

	
	/** 재직 사원 정보 반환 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectAll() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectAll(conn);
		
		close(conn);
		
		return empList;
	}

	
	/** 퇴직 사원 정보 반환 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectRetirement() throws SQLException{
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectRetirement(conn);
		
		close(conn);
		
		return empList;
	}


	/** 사번으로 사원 정보 조회 반환 서비스
	 * @param input
	 * @return emp
	 * @throws SQLException
	 */
	public Emp selectEmpId(int input) throws SQLException{
		
		Connection conn = getConnection();
		
		Emp emp = dao.selectEmpId(conn, input);
		
		close(conn);
		
		return emp;
	}


	/** 사원 정보 추가
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int insertEmp(Emp emp) throws SQLException{
		
		Connection conn = getConnection();
		
		int result = dao.insertEmp(conn, emp);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/** 사번 입력받아 사원 정보 수정
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int updateEmp(Emp emp) throws SQLException{
		
		Connection conn = getConnection();
		
		int result = dao.updateEmp(conn, emp);
		
		if(result > 0) commit(conn);
		else commit(conn);
		
		close(conn);
				
		return result;
	}


	/** 사번 입력받아 사원 정보 삭제
	 * @param empId
	 * @param check
	 * @return result
	 * @throws SQLException
	 */
	public int deleteEmp(int empId, char check) throws SQLException{
		
		Connection conn = getConnection();
		
		int result = dao.deleteEmp(conn, empId, check);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		return result;
	}


	/** 사번 입력 받아 사원 퇴사 처리
	 * @param empId
	 * @param check
	 * @return
	 * @throws SQLException
	 */
	public int retireEmp(int empId) throws SQLException{
		
		Connection conn = getConnection();
		
		int result = dao.retireEmp(conn, empId);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/**
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> hireLately() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.hireLately(conn);
		
		close(conn);
		
		return empList;
	}



}
