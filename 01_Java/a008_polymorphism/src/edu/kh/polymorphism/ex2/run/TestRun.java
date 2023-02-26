package edu.kh.polymorphism.ex2.run;

import edu.kh.polymorphism.ex2.service.TestService;

public class TestRun {
	public static void main(String[] args) {
		
		TestService service = new TestService();
		
		service.ex1();  // 추상클래스 (Animal)
//		service.ex2();  // 인터페이스 (KH)
//		service.ex3();  // 인터페이스 (Calculator)
		
	}

}
