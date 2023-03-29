package edu.kh.jdbc.board.model.service;

import static edu.kh.jdbc.common.JDBCTemplate.*;

import java.sql.Connection;
import java.util.List;

import edu.kh.jdbc.board.model.dao.CommentDAO;
import edu.kh.jdbc.board.model.dto.Comment;

public class CommentService {
	
	private CommentDAO dao = new CommentDAO();

		
	/** 댓글 삽입 서비스
	 * @param commentContent
	 * @param boardNo
	 * @param memberNo
	 * @return
	 * @throws Exception
	 */
	public int insertComment(String commentContent, int boardNo, int memberNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.insertComment(conn, commentContent, boardNo, memberNo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}

	
	/** 로그인한 회원이 쓴 댓글이 맞는지 확인하는 서비스
	 * @param boardNo
	 * @return
	 */
	public Comment checkId() {
		// TODO Auto-generated method stub
		return null;
	}

	
	/** 댓글 수정 서비스
	 * @param boardNo
	 * @return result
	 * @throws Exception
	 */
	public int updateComment(int boardNo) throws Exception{
		
		Connection conn = getConnection();
		
		int result = dao.updateComment(conn, boardNo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}


	/** 댓글 삭제 서비스
	 * @param boardNo
	 * @return result
	 * @throws Exception
	 */
	public int deleteComment(int boardNo) throws Exception {
		
		Connection conn = getConnection();
		
		int result = dao.deleteCommit(conn, boardNo);
		
		if(result > 0) commit(conn);
		else rollback(conn);
		
		close(conn);
		
		return result;
	}



}
