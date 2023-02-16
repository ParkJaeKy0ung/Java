package oop.basic.review;

public class BasicRunRe {
	public static void main(String[] args) {
		
		// main 메서드에 필드 생성, 객체 기능 호출
		
		// 1. 객체 생성
		NationRe n1 = new NationRe();
		
		
		// 5. 값 초기화
		n1.setpNo("001230-1234567");
		
		n1.name = "홍길동";
		n1.gender = '남';
		n1.address = "서울시 중구 남대문로 120";
		n1.phone = "010-1234-1234";
		n1.age = 25;
		
		
		// 6. 객체 속성 값 출력
		System.out.println(n1.getpNo());
		
		System.out.println(n1.name);
		System.out.println(n1.gender);
		System.out.println(n1.address);
		System.out.println(n1.phone);
		System.out.println(n1.age);
		
		
		// 7. 객체 기능 호출하기
		n1.meidcalBenefits();
		n1.speakKorean();
		
		
		
	}

}
