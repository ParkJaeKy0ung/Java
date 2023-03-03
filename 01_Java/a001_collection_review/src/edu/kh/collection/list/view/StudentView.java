package edu.kh.collection.list.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import edu.kh.collection.list.service.StudentService;

public class StudentView {

	private Scanner sc = new Scanner(System.in);
	private StudentService service = new StudentService();
	
	public void displayMenu() {
		int input = 0;
		
		do {
			try {
				
				
				
			} catch(InputMismatchException e) {
				System.out.println("[잘못된 형식의 입력입니다.]");
				sc.nextLine();
				input = -1;
			}
			System.out.println();
			
		}while(input!=0);
	}

}
