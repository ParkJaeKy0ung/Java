package edu.kh.project.myPage.model.service;

import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dto.Member;

@Service // 비즈니스 로직 처리 클래스 + Bean 등록 (IOC)
public interface MypageService {

	/** 회원 정보 수정(?)
	 * @param updateMember
	 * @return
	 */
	int updateInfo(Member updateMember);

	
	/** 비밀번호 변경 서비스
	 * @param currentPw
	 * @param newPw
	 * @param memberNo
	 * @return result
	 */
	int changePw(String currentPw, String newPw, int memberNo);


	/** 회원 탈퇴 서비스
	 * @param memberPw
	 * @param memberNo
	 * @return result
	 */
	int secession(String memberPw, int memberNo);

}
