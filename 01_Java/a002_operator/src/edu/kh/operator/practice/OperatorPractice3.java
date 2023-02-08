package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice3 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		
		int i = sc.nextInt();
		
		String result = i == 0 ? "0 입니다." 
					  : i > 0 ? "양수 입니다." : "음수 입니다.";
		
		System.out.println(result);

		
	}
}
