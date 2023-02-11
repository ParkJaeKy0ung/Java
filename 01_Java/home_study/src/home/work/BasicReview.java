package home.work;

import java.util.Scanner;

public class BasicReview {
	
	// condition _if문
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("홀수/짝수 판별기! 숫자 입력하세요 : ");
		int input = sc.nextInt();
		
		if(input == 0) {
			System.out.println("판별 불가. 0!");
		}else if(input % 2 == 0) {  // 왜 Math.abs(input)로 입력 안 해도 음수 값 결과 정확하게 나오지
			System.out.println("짝수!");
		}else {
			System.out.println("홀수!");
		}
	}
	
	
	public void ex2() {
		// 놀이기구 탑승 제한 검사
		
		// 나이가 12세 이상, 키 140.0cm 이상일 경우에만 탑승 가능
		
		// 나이가 12세 미만 : "적정 연령이 아닙니다."
		// 키 140.0cm 미만 : "적정 키가 아닙니다."
		// 나이를 0세 미만 또는 100세 초과 입력 시 : "잘못 입력하셨습니다."
		
		// [실행화면]
		// 나이 입력 : 15
		// 키 입력 : 170.5
		// 탑승 가능
		
		/* 나이 제한 */
		// 나이 입력 : 10
		// 키 입력 : 150.5
		// 적정 연령이 아닙니다.
		
		/* 키 제한 */
		// 나이 입력 : 12
		// 키 입력 : 135.5
		// 적정 키가 아닙니다.
		
		/* 나이 0 미만 또는 100 초과 */
		// 나이 입력 : 120
		// 키 입력 : 185.5
		// 잘못 입력하셨습니다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		System.out.print("키 입력 : ");
		double height = sc.nextDouble();
		
		String result;
		
		if(age<0 || age>100) { // 나이를 0세 미만 또는 100세 초과 입력 시 : "잘못 입력하셨습니다."
			result = "잘못 입력하셨습니다.";
		}else if(age<12) { // 나이가 12세 미만 : "적정 연령이 아닙니다."
			result = "적정 연령이 아닙니다.";
		}else if(height<140.0) { // 키 140.0cm 미만 : "적정 키가 아닙니다."
			result = "적정 키가 아닙니다.";
		}else { // 나이가 12세 이상, 키 140.0cm 이상일 경우에만 탑승 가능
			result = "탑승 가능";
		}
		System.out.println(result);
	}
	
	
	public void ex2_1() {
		// 나이를 입력 받자마자 검사
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age<0 || age>100) {
			result = "나이를 잘못 입력하셨습니다.";
		}else if(age<12) {
			result = "적정 연령이 아닙니다.";
		}else {
			System.out.print("키 입력 : ");
			double height = sc.nextDouble();
			
			if(height<0 || height>220) {
				result ="키를 잘못 입력하셨습니다.";
			}else if(height<140) {
				result = "적정 키가 아닙니다.";
			}else {
				result = "탑승 가능합니다.";
			}
		}
		System.out.println(result);
	}
	
	
	public void ex3() {
		// 나이를 입력 받아
		// 13세 이하면 "어린이"
		// 13세 초과 19세 이하면 "청소년"
		// 19세 초과 "성인" 출력
		// 0세 이하는 "잘못 입력하셨습니다" 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 살이신가요 : ");
		int age = sc.nextInt();
		
		String result;
		
		if(age<=0) {
			result = "잘못 입력하셨습니다";
		}else if(age<=13) {
			result = "어린이";
		}else if(age<=19) {
			result = "청소년";
		}else {
			result="성인";
		}
		System.out.println(result);
	}
	
	
	
	// condition _switch문
	public void ex4() {
		// 키보드로 정수를 입력 받아
		// 1이면 "RED"
		// 2이면 "ORANGE"
		// 3이면 "YELLOW"
		// 4이면 "GREEN"
		// 1~4 아니면 "BLUE" 를 출력'
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		String res;
		
		switch(input) {
		case 1 : res = "RED"; break;
		case 2 : res = "ORANGE"; break;
		case 3 : res = "YELLO"; break;
		case 4 : res = "GREEN"; break;
		default : res = "BLUE";
		}
		System.out.println(res);
	}
	
	
	public void ex5() {
		// 메뉴를 입력 받아서 가격이 얼마인지 출력하기
		// "메뉴를 입력하세요 (김밥/라면/샌드위치/떡볶이) : "
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("메뉴를 입력하세요 (김밥/라면/샌드위치/떡볶이) : ");
		String menu = sc.next();
		
		int price;
		
		switch(menu) {
		case "김밥": price=4500; break;
		case "라면": price=4000; break;
		case "샌드위치": price=6000; break;
		case "떡볶이": price=5000; break;
		default : price=-1;
		}
		
		if(price != -1) {
			System.out.printf("%s는/은 %d원 입니다.", menu, price);
		}else {
			System.out.println("존재하지 않는 메뉴입니다.");
		}
	}
	
	
	public void ex6() {  // 오답 : 출력할 때 pirntf 안에 연산자도 %s로 입력받기, ***나눗셈은 값이 소수점으로 나올 수 있음!!!!! double!!!
	    // 산술 연산 계산기 만들기
	    // 두 정수(int)와 1개의 연산자( + - * / % (String) )를 입력 받아서 
	    // 연산 결과를 출력
	    // 단, 나누기(/) 연산 시 0으로는 나눌 수 없도록 한다.
		
	    // [실행 화면]
	    // 정수1 입력 : 5
	    // 연산자 입력 : +
	    // 정수2 입력 : 4
	    // 5 + 4 = 9
	      
	    // [실행 화면]
	    // 정수1 입력 : 5
	    // 연산자 입력 : /
	    // 정수2 입력 : 0
	    // 0으로는 나눌 수 없습니다.
	      
	    // [실행 화면]
	    // 정수1 입력 : 5
	    // 연산자 입력 : @
	    // 정수2 입력 : 3
	    // 존재하지 않는 연산자 입니다.
		
		// i1 -> a, i2 -> b
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수1 입력 : ");
		int a = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		System.out.print("정수2 입력 : ");
		int b = sc.nextInt();
		
		switch(op) {
		case "+": System.out.printf("%d %s %d = %d", a, op, b, a+b); break;
		case "-": System.out.printf("%d %s %d = %d", a, op, b, a-b); break;
		case "*": System.out.printf("%d %s %d = %d", a, op, b, a*b); break;
		case "/": 
			if(b==0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}else {
				System.out.printf("%d %s %d = %.3f", a, op, b, (double)a/b);  // 똑같은 실수 똑같이 함. double형으로 강제변환, %d(X)
			} break;
		case "%": 
			if(b==0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}else {
				System.out.printf("%d %s %d = %d", a, op, b, a%b);
			} break;
		default: System.out.println("존재하지 않는 연산자 입니다."); break;
		}
	}
	
	
	// Math.random()
	// 기본이 double형이기 때문에 주의해야 함. 
	// int rd = Math.random(); -> 오류! int rd = (int)Math.random();으로 해야 함.
	public void ex7() {
		int random = (int)(Math.random() * 10);  // 0~10 까지의 난수
		System.out.println(random);
	}
	
	
}
