package edu.kh.control.loop.ex;

import java.util.Scanner;

public class ForRun {
	
	public static void main(String[] args) {
		
		ForEx fx = new ForEx();
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("실행할 예제 번호 입력 : ");
		int i = sc.nextInt();
		
		switch(i) {
		// 기초
		case 1 : fx.ex1(); break;
		case 2 : fx.ex2(); break;
		case 3 : fx.ex3(); break;
		case 4 : fx.ex4(); break;
		case 5 : fx.ex5(); break;
		case 6 : fx.ex6(); break;
		
		// 응용
		case 7 : fx.ex7(); break;
		case 8 : fx.ex8(); break;
		case 9 : fx.ex9(); break;
		case 10 : fx.ex10(); break;
		case 11 : fx.ex11(); break;
		case 12 : fx.ex12(); break;
		case 13 : fx.ex13(); break;
		case 14 : fx.ex14(); break;
		}
		
		
	}

}
