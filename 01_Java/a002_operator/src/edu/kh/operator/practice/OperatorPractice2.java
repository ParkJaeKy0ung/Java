package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice2 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classes = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("성별 : ");
		String sex = sc.next();
		
		System.out.print("성적 : ");
		float score = sc.nextFloat();
		
		System.out.println();
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f점 입니다.", grade, classes, number, name, sex, score);
		
		
		
		
		
	}
}
