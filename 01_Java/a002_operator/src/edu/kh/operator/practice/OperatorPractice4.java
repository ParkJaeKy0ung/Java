package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice4 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		System.out.println();
		
		int result1 = kor + eng + math;
		float result2 = (kor + eng + math) / 3 ;
				
		
		System.out.printf("합계 : %d", result1);
		System.out.println();
		System.out.printf("합계 : %.1f", result2);
		
		System.out.println();
		String result3 = (kor >= 40 && eng >= 40 && math >= 40) && ((kor + eng + math) / 3) >= 60 ?
				"합격" : "불합격";
		
		System.out.println(result3);
		
		
		
		
	}
}
