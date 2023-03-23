package edu.kh.jdbc.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import edu.kh.jdbc.model.dao.EmpDAO;
import edu.kh.jdbc.model.dto.Emp;

/**
 * @author user1
 *
 */
public class EmpService {

	private EmpDAO dao = new EmpDAO();

	
	/** 1. 재직 사원 정보 반환 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectAll() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectAll(conn);
		
		close(conn);
		
		return empList;
	}

	
	/** 2. 퇴직 사원 정보 반환 서비스
	 * @return empList
	 * @throws SQLException
	 */
	public List<Emp> selectRetirement() throws SQLException{
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.selectRetirement(conn);
		
		close(conn);
		
		return empList;
	}


	/** 3. 사번으로 사원 정보 조회 반환 서비스
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


	/** 4. 사원 정보 추가
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


	/** 5. 사번 입력받아 사원 정보 수정
	 * @param emp
	 * @return result
	 * @throws SQLException
	 */
	public int updateEmp(Emp emp) throws SQLException{
		// 반환형이 int인 이유!!!
		// -> DML 수행 결과는 반영된(성공) 행의 개수 반환
		// --> 행의 개수는 정수형 --> int 사용
		
		
		Connection conn = getConnection();
		
		int result = dao.updateEmp(conn, emp);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
				
		return result;
	}


	/** 6. 사번 입력받아 사원 정보 삭제
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


	/** 7. 사번 입력 받아 사원 퇴사 처리
	 * @param empId
	 * @throws SQLException
	 */
	public void retireEmp(int empId) throws SQLException{
		// void!!!
		
		Connection conn = getConnection();
		
		/*int result =*/ dao.retireEmp(conn, empId); // -> 성공 또는 예외만 (실패 이미 처리함)
		
		// 트랜잭션 처리
		// 예외 발생 시 SQL 수행이 정상적으로 진행되지 않음
		/*if(result > 0) */commit(conn);
		/*else rollback(conn);*/
		
		close(conn);
		
		/*return result;*/
	}
	
	
	/** 존재하는 사원인지, 퇴직한 사원인지 결과를 반환하는 서비스
	 * @param empId
	 * @return check (0: 없는 사원, 1: 퇴직한 사원, 2: 재직 중인 사원)
	 * @throws SQLException
	 */
	public int checkEmployee(int empId) throws SQLException {
		
		Connection conn = getConnection();
		
		int check = dao.checkEmployee(conn, empId);
		
		close(conn);
		
		return check;
	}

	/** 8. 최근 입사 사원
	 * @return
	 * @throws SQLException
	 */
	public List<Emp> hireLately() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Emp> empList = dao.hireLately(conn);
		
		close(conn);
		
		return empList;
	}


	/** 부서별 통계 조회 서비스
	 * @return mapList
	 * @throws SQLException
	 */
	public List<Map<String, Object>> selectDepartment() throws SQLException {
		
		Connection conn = getConnection();
		
		List<Map<String, Object>> mapList = dao.selectDepartment(conn);
		
		close(conn);
		
		return mapList;
	}






}
