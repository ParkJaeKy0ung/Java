package edu.kh.project.board.model.service;

import java.util.List;
import java.util.Map;

import edu.kh.project.board.model.dto.Board;

public interface BoardService {

	// 게시판 종류 목록 조회 
	List<Map<String, Object>> selectBoardTypeList();

	// 게시글 목록 조회
	Map<String, Object> selectBoardList(int boardCode, int cp);

	// 게시글 상세 조회
	Board selectBoard(Map<String, Object> map);

	// 좋아요 여부 확인 서비스 호출
	int boardLikeCheck(Map<String, Object> map);

	// 좋아요 처리
	int like(Map<String, Integer> paramMap);

	// 조회 수 증가 서비스
	int updateReadCount(int boardNo);


}
