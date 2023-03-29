package edu.kh.collection.list.view;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import edu.kh.collection.list.dto.Student;
import edu.kh.collection.list.service.StudentService;

public class StudentView {

	private Scanner sc = new Scanner(System.in);
	private StudentService service = new StudentService();
	
	public void displayMenu() {
		int input = 0;
		
		do {
			try {
				System.out.println("\\n--- 학생 관리 프로그램 ---\\n");
				System.out.println("1. 학생 정보 추가");
				System.out.println("2. 학생 전체 조회");
				System.out.println("3. 학생 정보 수정");
				System.out.println("4. 학생 정보 제거");
				System.out.println("5. 학생 이름 검색");
				System.out.println("6. 학생 주소 검색");
				System.out.println("7. 학년별 조회");
				System.out.println("8. 성별 조회");
				System.out.println("9. 성적 순서 조회");
				System.out.println("0. 프로그램 종료");
				System.out.println();
				
				System.out.print("메뉴 선택 >> ");
				
				input = sc.nextInt();
				sc.nextLine();
				
				System.out.println();
				
				switch(input) {
				case 1: addStudent(); break;
				case 2: selectAll(); break;
				case 3: break;
				case 4: break;
				case 5: break;
				case 6: break;
				case 7: break;
				case 8: break;
				case 9: break;
				case 0: System.out.println("[프로그램 종료]"); break;
				default : System.out.println("[잘못 입력하셨습니다.]");
				}
				
			} catch(InputMismatchException e) {
				System.out.println("[잘못된 형식의 입력입니다.]");
				sc.nextLine();
				input = -1;
			}
			System.out.println();
			
		}while(input!=0);
	}

	
	/**
	 * 학생 정보 추가
	 */
	private void addStudent() {
		System.out.println("\n--- 학생 정보 추가 ---\n");
		
		Student std = inputStudent();
		
		if(service.addStudent(std)) {
			System.out.println("[학생 정보가 추가되었습니다.]");
		}
		
	}


	private Student inputStudent() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * 전체 학생 조회
	 */
	private void selectAll() {
		System.out.println("\n--- 전체 학생 조회 ---\n");
		
		List<Student> list = service.selectAll();
		
		for(Student s : list) {
			System.out.println(s);
		}
	}

}
