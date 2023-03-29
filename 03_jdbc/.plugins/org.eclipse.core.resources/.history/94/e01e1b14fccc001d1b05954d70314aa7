package edu.kh.jdbc.member.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.member.dao.MemberDAO;
import edu.kh.jdbc.member.model.dto.Member;

public class MemberService {

	private MemberDAO dao = new MemberDAO();

	
	/** 회원 목록 조회 서비스
	 * @return
	 * @throws Exception
	 */
	public List<Member> selectMemberList() throws Exception {
		
		Connection conn = getConnection();
		
		List<Member> memberList = dao.selectMemberList(conn);
		
		close(conn);
		
		return memberList;
	}

}
