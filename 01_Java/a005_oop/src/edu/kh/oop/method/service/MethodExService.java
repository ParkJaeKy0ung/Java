package edu.kh.oop.method.service;

// 기능 제공용 객체를 만들기 위한 클래스
// -> 비즈니스 로직 작성 
public class MethodExService {

	// 2. 매개 변수 O, 반환 값 X
	// void : 반환 값 없음
	// 매개 변수 : 전달 받은 값을 저장할 변수
	public void threeNumbersSumAndAverage(int a, int b, int c) {
		// 세 숫자의 합과 평균
		
		// 전달 받은 세 정수의 합
		int sum = a + b + c;
		
		// 전달 받은 세 정수의 평균
		double avg = sum / 3.0;
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + avg);
	}
	
	
	// 3. 매개 변수 X, 반환 값 O
	// [1부터 10 사이의 난수 5개를 저장한 배열을 반환받아 출력]
	public int[] fiveRandomNumbers() {  // public void 입력하면 반환 값이 없으므로 return에서 오류 발생
		// -> !!! 반환하는 자료형을 작성 !!!!
		
		int[] arr = new int[5];
		
		for(int i=0; i<arr.length; i++) {
			
			// 생성된 난수를 배열 요소에 저장
			arr[i] = (int)(Math.random() * 10 + 1);  // 1~10 난수
		}
		
		// return : 반환, 돌아가다
		// -> 호출한 위치로 돌아감
		// -> 돌아갈 때 가져갈 값이 있으면
		// 	  return 옆에 작성
		return arr;
		//     -> 반환된 int[]은 실제 배열이 아닌
		//        int[] 의 '주소값'이다.
		//        arr[i]에 저장된 '값'이 아님.
	}
	
	
	// 4. 매개 변수 O, 반환 값 O
	public String calculate(int num1, int num2, String op) {  
		   // 문자열(String) 반환
		
		// 매개변수명 중복되어도 상관X. 오히려 이해도 향상
		// (단, 변수명이 같다고 해서 같은 변수는 아님 (동명이인 개념))
		
		// +, -, * : 문제 없음
		// /, % : 0으로 나눌 경우 오류 발생
		
		// 정상 계산 : "5 + 10 = 15"  -> 결과값 자료형 : String
		// 오류 발생 : "0으로 나눌 수 없습니다."
		
		String result = null;
		// String은 참조형 == 주소를 저장
		// null : 참조하는 게 없다(==주소를 저장하고 있지 않다)
		// null == 비어있다 (false)
		
		
		// 만약에 두번째 숫자가 0이고 
		// 연산 기호가 / 또는 % 인 경우
		
		// ==, != : 비교 연산자
		// 참조형을 비교할 때는 값이 아닌 주소를 비교한다!!!!!
		// (참조형의 주소는 객체가 생성될 때 매다 새롭게 만들어지기 때문에)
		// -> 대부분 같지 않다로 판별됨
		
		// 해결방법 : 참조형의 값 자체를 비교하는 equals() 사용
		// boolean a.equals(b)
		// -> a와 b가 참조하는 객체의 
		//    값이 같다면 true, 아니면 false를 반환하는 메서드
		//    --> boolean이 반환되는 
		
		
		if(num2==0 && (op.equals("/") || op.equals("%"))) {
			result = "0으로 나눌 수 없습니다.";
			
			// ************************************************* 
			// 코드 수행 중 return 구문을 만나면 
			// 그 즉시 메서드를 종료하고 호출한 곳으로 돌아감!
			// *************************************************
			return result;
		}
		
		
		
		// String.format("패턴", 변수);
		// -> 패턴 형태의 문자열(String)을 반환
		switch(op) {
		case "+": result = String.format("%d %s %d = %d", num1, op, num2, num1+num2); break;
		case "-": result = String.format("%d %s %d = %d", num1, op, num2, num1-num2); break;
		case "*": result = String.format("%d %s %d = %d", num1, op, num2, num1*num2); break;
		
		case "/": result = String.format("%d %s %d = %d", num1, op, num2, num1/num2); break;
		case "%": result = String.format("%d %s %d = %d", num1, op, num2, num1%num2); break;
		
		default : result = "연산 기호가 잘못 입력 되었습니다.";
		}		
				
				
		return result;
	}
	
	
	
	
	
	
	
	
	
}
