package edu.kh.oop.field.run;

import edu.kh.oop.field.dto.Student;

/* Java 실행 단계
 * 
 * 0. 코드 훑어 보기
 * -> static 키워드 찾음
 * -> 찾은 static 키워드가 포함된 필드/변수/메서드를
 *    static 메모리 영역(정적 메모리 영역)에 생성/추가함
 *    
 * --> static 영역에 추가 시
 * 	   클래스명.필드명  ex)Student.Schoolname
 * 	   클래스명.메서드명 으로 기록된다.   
 *    
 * 1. main 실행   
 * 
 * */

public class StudentRun {
	
	public static void main(String[] args) {
		
		// Student 객체 생성
		Student s1 = new Student();
		
		s1.name = "김삼순";
		s1.grade = 5;
		
		// Student 객체 생성
		Student s2 = new Student();
		s2.name = "박철수";
		s2.grade = 2;
		
		
		//
		System.out.println("s1 학생 정보");
		System.out.println(s1.name);
		System.out.println(s1.grade);
		System.out.println(s1.SchoolName);
		
		System.out.println("-----------");
		
		System.out.println("s2 학생 정보");
		System.out.println(s2.name);
		System.out.println(s2.grade);
		System.out.println(s2.SchoolName);
		
		/* 학교 이름 변경 */
		// s1.SchoolName = "KH국민학교"; // s1, s2 참조변수를 사용하지 않고 클래스명.필드명 으로 사용하는게 정석 방법
		// s2.SchoolName = "KH국민학교";  -> s1의 값만 변경해도 static이기 때문에 s2도 같이 변경됨.
		
		// The static field Student.SchoolName should be accessed in a static way : 참조변수 이용했을 때 경고문
		
		// ** 참조변수를 이용해서 static으로 지정된 필드 값을 
		//	   바꿀 수 있지만
		//	  <클래스명.필드명>을 이용해서 다루는 것을 권장함.
		// 클래스명.필드명
		Student.SchoolName ="KH중학교";
		
		System.out.println("-----------");
		System.out.println("s1 학교명 : " + s1.SchoolName);
		System.out.println("s2 학교명 : " + s2.SchoolName);
		
		
		// public static final
		// : 어디서든 공유할 수 있는 상수
		System.out.println(Math.PI);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	
	}
}
