package edu.kh.oop.method.service;

import edu.kh.oop.method.dto.User;

import edu.kh.oop.method.view.UserView;

public class UserService {
	

	
	// 1. 회원 가입
	public User signup(String userId, String userPw, String userPwConfirm, String userName, char userGender) {
		
		// 전달 받은 값 중 비밀번호, 비밀번호 확인이 일치할 경우
		// User 객체를 생성해서 주소를 반환
		// 만약 일치하지 않는 경우 null 반환
		
		User user = null; // 아무것도 참조하지 않음
		
		// 비밀번호, 비밀번호 확인이 일치할 경우
		if(userPw.equals(userPwConfirm)) {
		
			// User 객체 생성 후 조수를 user에 저장
			user = new User(userId, userPw, userName, userGender);
		}
		
		return user;  // 주소 또는 null 반환
		
	}
	
	
	// 2. 로그인
	public void login(String userId, String userPw, User signUpUser) {
				   // 입력 받은 값				 // 가입한 회원 정보
		
		// 아이디 일치 여부 검사
		boolean idCheck = userId.equals(signUpUser.getUserId());
		
		// 비밀번호 일치 여부 검사
		boolean pwCheck = userPw.equals(signUpUser.getUserPw());
		
		
		// 아이디, 비밀번호가 모두 일치하는 경우
		if(idCheck && pwCheck) {
			// 로그인 처리
			
			// UserView에 있는 클래스 변수(static) loginUser에 
			// 가입한 회원의 정보를 가지고 있는 객체의 주소를 대입
			// 클래스명.
			UserView.loginUser = signUpUser;
			
		}
	}
	
	
	// 5. 회원 정보 수정
	public boolean userUpdate(String userName, char userGender, String userPw) {
		
		// 비밀번호 일치 여부 확인
		if( !UserView.loginUser.getUserPw().equals(userPw) ) { // 비밀번호가 같지 않을 때
			// 논리 부정 연산자 사용
			return false; //호출한 곳으로 false를 가지고 돌아감
		}
		
		// 비밀번호가 일치할 때
		// -> 로그인한 User 정보에 전달 받은 값을 세팅
		UserView.loginUser.setUserName(userName);
		UserView.loginUser.setUserGender(userGender);
				// 얕은 복사로 주소를 복사하여 사용하기 때문에 signUp 말고 loginUser로 해도 됨.
		
		return true;
	}
	
}
