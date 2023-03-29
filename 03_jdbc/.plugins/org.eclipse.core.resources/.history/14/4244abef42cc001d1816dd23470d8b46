package home.work;

import java.util.Scanner;

public class ConditionWrongAnswerNote {
	
	// Condition, For문 ex() 오답
	public void ex1() {
		Scanner sc = new Scanner(System.in);
		
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
		
		System.out.print("정수1 입력 : ");
		int i1 = sc.nextInt();
		
		System.out.print("연산자 입력 : ");
		String op = sc.next();
		
		System.out.print("정수2 입력 : ");
		int i2 = sc.nextInt();
		
		switch(op) {
		case "+" : System.out.printf("%d %s %d = %d", i1, op, i2, i1 + i2); break;  // 오답) + - * / % 도 변수 입력되어 있음 -> %s 와 op 입력!!!
		case "-" : System.out.printf("%d %s %d = %d", i1, op, i2, i1 - i2); break;
		case "*" : System.out.printf("%d %s %d = %d", i1, op, i2, i1 * i2); break;
		case "/" : 
			if(i2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}else {
				System.out.printf("%d %s %d = %.3f", i1, op, i2, (double)i1 / i2);           // 오답) %d 소수점X
			}
			break;
		case "%" :                                                                  // 오답) %도 0으로 나누면 오류. /와 마찬가지로 해야 함.
			if(i2 == 0) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}else {
				System.out.printf("%d %s %d = %d", i1, op, i2, i1 / i2);
			}
			break;	
		default : System.out.println("존재하지 않는 연산자 입니다.");
		}
	}
	
	
	public void ex2() {
		// 두 정수를 입력 받아
		// 두 정수 사이의 모든 정수의 합 출력하기
		// (단, 첫 번째 입력 받는 정수가 무조건 작다고 가정))
		
		// [실행 화면]
		// 정수 1 입력 : 2
		// 정수 2 입력 : 5
		// 2부터 5까지 모든 정수의 합 : 14
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 1 입력 : ");
		int num1 = sc.nextInt();
		
		System.out.print("정수 2 입력 : ");
		int num2 = sc.nextInt();
		
		int sum = 0;
		for(int i=num1 ; i<=num2 ; i++) {
			sum += i;
		}
		System.out.printf("%d부터 %d까지 모든 정수의 합 : %d", num1, num2, sum);
	}
	
	
	public void ex3() {
		// 입력, 합계(sum), for
		
		// 정수 5개를 입력 받아 합계 출력하기
		
		Scanner sc = new Scanner(System.in);
		/*
		System.out.print("정수 입력 1 : ");
		sum += sc.nextInt();
		System.out.print("정수 입력 2 : ");
		sum += sc.nextInt();
		System.out.print("정수 입력 3 : ");
		sum += sc.nextInt();
		.
		.
		.
		
		System.out.println(sum);
		*/
		
		int sum = 0; // 합계를 저장할 변수 선언 및 0으로 초기화
		
		for(int i=1; i<=5; i++) {
			System.out.printf("정수 입력 %d : ", i);
			sum += sc.nextInt();
		}
		System.out.println(sum);
	}
	
	
	public void ex4() {
		// ex8() 응용
		
		// 정수를 몇 번 입력 받을지 먼저 입력하고
		// 입력된 정수의 합계를 출력
		
		// [실행 화면]
		// 입력 받을 정수의 개수 : 2
		// 입력 1 : 3
		// 입력 2 : 5
		// 합계 : 8
		
		// 입력 받을 정수의 개수 : 4
		// 입력 1 : 3
		// 입력 2 : 5
		// 입력 3 : 1
		// 입력 4 : 2
		// 합계 : 11
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력 받을 정수의 개수 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			System.out.printf("입력 %d : ", i);
			sum += sc.nextInt();  // sum = sum + sc.nextInt();
		}
		System.out.println("합계 : " + sum);
	}
	
	
	public void ex5() {
		// 입력 받은 단의 구구단 출력하기
		// 단, 입력 받은 단이 2~9 사이가 아니라면
		// "잘못 입력하셨습니다." 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단 입력 : ");
		int input = sc.nextInt();
		
		if(2<=input && input<=9) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d x %d = %d \n", input, i, input*i);
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}	
	}
	
	
	public void ex6() {
		// 입력된 정수 : 4
		// 4321
		// 321
		// 21
		// 1
		
		// 입력된 정수 : 3
		// 321
		// 21
		// 1
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력된 정수 : ");
		int input = sc.nextInt();
		
		for(int x=input; x>=1; x--) { //
			for(int y=x; y>=1; y--) {
				System.out.print(y);
			}
			System.out.println();
		}
	}
	
	
	public void ex7() {
		// 1부터 20 사이의 3의 배수의 합과 개수를 출력 (3,6,9,12,15,18)
		
		// [실행화면]
		// sum : 63
		// count : 6
		
		int sum = 0; // 합계 저장용 변수
		int count = 0; // 카운트용 변수
		
		for(int i=1; i<=20; i++) {
			if(i % 3 == 0) { // 3의 배수인 경우
				sum += i; // 누적
				count++; // 개수 증가(+1)
			}
		}
		System.out.println("sum : " + sum);
		System.out.println("count : " + count);
	}
	
	
	public void ex8() {
		// 1  2  3  4 
		// 5  6  7  8
		// 9 10 11 12
		
		int count = 1; // 숫자를 세기 위한 변수 선언
		
		for(int row=1; row<=3; row++) {  // 3행(=3줄)
			for(int col=1; col<=4; col++) {  // 4열
				System.out.printf("%3d", count++);
			}
			System.out.println();  // 개행
		}
	}
	
	
	
	// Condition, For문 practice() 오답
	public void ex9() {
		/*
		1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.

		ex.
		정수를 하나 입력하세요 : 8
		1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 = 36
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수를 하나 입력하세요 : ");
		int input = sc.nextInt();
		
		int sum = 0;
		
		for(int i=1; i<=input; i++) {
			sum += i;
			System.out.print(i);
			
			if(input != i) {
				System.out.print(" + ");
			}
		}
		System.out.println(" = " + sum);
	}
	
	/* 3번 다른 방법
	for(int i=1; i<=input; i++) {
		sum += i;
		
		if(i == input) {   // 마지막 O
			System.out.print(i + "=" + sum);
		}else {    // 마지막 X
			System.out.print(i + "+");}
		}
	*/
	
	
	public void ex10() {
		
	}
	
	
	public void ex11() {
		
	}
	

}
