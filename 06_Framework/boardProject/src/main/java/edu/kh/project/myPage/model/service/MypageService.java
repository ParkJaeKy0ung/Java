package edu.kh.project.myPage.model.service;

import org.springframework.stereotype.Service;

import edu.kh.project.member.model.dto.Member;

@Service // 비즈니스 로직 처리 클래스 + Bean 등록 (IOC)
public interface MypageService {

	int updateInfo(Member updateMember);

}
