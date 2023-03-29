package edu.kh.operator.ex;

public class OperatorEx3 {
	
	public static void main(String[] args) {
		
		// 논리 연산자 : &&(AND), ||(OR)
		
		
		// && 연산자 : 둘 다 true이면 true, 나머진 false
		// ~와, 그리고(이고), 이면서(면서), 까지, 사이
		
		// 입력 받은 정수가 100 이상이면서 짝수인가? (i >= 100) && (i % 2 == 0)
		int num1 = 98;
		boolean result1 = (num1 >= 100) && (num1 % 2 == 0);
		
		System.out.println("100 이상이면서 짝수? " + result1);
		
		// 입력 받은 정수가 50 이하이고 3의 배수인가? (i <= 50) && (i % 3 == 0)
		int num2 = 42;
		boolean result2 = (num2 <= 50) && (num2 % 3 == 0);
		
		System.out.println("50 이하이고 3의 배수? " + result2);
				
		// 입력 받은 정수가 1부터 100 사이의 숫자인가? (1 <= i) && (i <= 100)
		int num3 = 208;
		boolean result3 = (1 <= num3) && (num3 <= 100);
		// boolean result3 = 1 <= num3 && 100 >= num3;
		
		System.out.println("1부터 100 사이의 숫자인가? " + result3);
		
		
		
		// || 연산자 : 둘 다 false이면 false, 나머진 true
		// ~이거나(거나), 또는
		
		// 정수가 10을 초과하거나 홀수인가?
		int num4 = 6;
		boolean result4 = num4 > 10 || num4 % 2 == 1;
		
		System.out.println("10을 초과하거나 홀수인가? " + result4);
		
		// 정수는 0부터 50 사이의 숫자 또는 음수인가? (=> 50 이하인가?)
		int num5 = 3;
		boolean result5 = 0 <= num5 && num5 <= 50 || num5 < 0; // (=> num5 <= 50)
				
		System.out.println("0부터 50 사이의 숫자 또는 음수인가? " + result5);
		
		
		
		// 논리 부정 연산자 : !
		// - 논리 값을 반대로 바꾸는 연산자
	
		// 11은 짝수가 아니다
		System.out.println( "11은 짝수가 아니다 : " + !(11 % 2 == 0) ); // true
		
		System.out.println( !!true ); // true
		
		System.out.println( true || false && !false ); // true
		
		
		
	}
}
