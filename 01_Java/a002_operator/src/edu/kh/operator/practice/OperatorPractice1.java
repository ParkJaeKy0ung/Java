package edu.kh.operator.practice;

import java.util.Scanner;

public class OperatorPractice1 {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int people = sc.nextInt();
		
		System.out.print("사탕 개수 : ");
		int candy = sc.nextInt();
		
		int result1 = candy / people;
		int result2 = candy % people;
		
		System.out.println();
		
		System.out.println("1인당 사탕 개수 : " + result1);
		System.out.println("남은 사탕 개수 : " + result2);
		
		
		
		
	}
}
