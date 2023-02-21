package edu.kh.objectarray.view;

import java.util.Scanner;

import edu.kh.objectarray.dto.Student;
import edu.kh.objectarray.service.StudentService;

public class StudentView {
	
	private Scanner sc = new Scanner(System.in);
	
	private StudentService service = new StudentService();
	
	
	public void displayMenu() {
		
		int input = 0;
		
		do {
			System.out.println("------ [학생 관리 프로그램] ------");
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 전체 조회");
			System.out.println("3. 학생 정보 조회(인덱스)");
			System.out.println("4. 학생 정보 조회(이름)");
			System.out.println("5. 학생 정보 수정(인덱스)");
			System.out.println("6. 점수 합계, 평균, 최고점, 최저점 조회");
			System.out.println("0. 종료");
			System.out.println("--------------------------------");
			
			System.out.println("메뉴 선택 : ");
			input = sc.nextInt();
			
			System.out.println();
			
			switch(input) {
			case 1: addStudent(); break;
			case 2: selectAll(); break;
			case 3: selectIndex(); break;
			case 4: selectName(); break;
			case 5: updateStudent(); break;
			case 6: sumAvgMaxMin(); break;
			case 0: System.out.println("[프로그램이 종료됩니다.]");break;
			default: System.out.println("[잘못 입력하셨습니다.]"); 
			}
			
			System.out.println();
			
		}while (input != 0);
	}

	/** 1. 학생 추가 */
	private void addStudent() {
		
		System.out.println("[학생 추가]");
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classRoom = sc.nextInt();
		
		System.out.print("번호 : ");
		int number = sc.nextInt();
		
		System.out.print("이름 : ");
		String name = sc.next();
		
		boolean result = service.addStudent(grade, classRoom, number, name);
		
		if(result) System.out.println(name + " 학생이 추가되었습니다!");
		else System.out.println("더 이상 학생을 추가할 수 없습니다.");
	}

	/** 2. 학생 전체 조회 */
	private void selectAll() {
		System.out.println("[학생 전체 조회]");
		
		Student[] studentList = service.selectAll();
		
		for(int i=0; i<studentList.length; i++) {
			if(studentList[i]==null) {
				break;
			}
			System.out.println(studentList[i].toString());
		}
		
	}

	/** 3. 학생 정보 조회(인덱스) */
	private void selectIndex() {
		System.out.println("[학생 정보 조회(인덱스)]");
		
		System.out.print("조회할 학생의 인덱스 번호를 입력하세요 : ");
		int index = sc.nextInt();
		
		Student std = service.selectIndex(index);
		
		if(std != null) {
			System.out.println(std.toString());
		}else {
			System.out.println("해당 인덱스에 학생 정보가 존재하지 않습니다.");
		}
	}

	/** 4. 학생 정보 조회(이름) */
	private void selectName() {
		System.out.println("[4. 학생 정보 조회(이름)]");
		
		System.out.print("조회할 학생의 이름 : ");
		String inputName = sc.next();
		
		Student[] resultArr = service.selectName(inputName);
		
		if(resultArr != null) {
			for(Student s : resultArr) {
				if(s==null) break; /* 설명 필요 */
				System.out.println(s.toString());
			}
		}else {
			System.out.println("이름이 일치하는 학생이 없습니다.");
		}
		
	}

	/** 5. 학생 정보 수정(인덱스) */
	private void updateStudent() {
		
		System.out.println("[학생 정보 수정(인덱스)]");
		
		System.out.print("인덱스 : ");
		int index = sc.nextInt();
		
		System.out.print("국어 : ");
		int kor = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		
		boolean result = service.updateStudent(index, kor, eng, math);
		
		if(result) System.out.println("수정되었습니다.");
		else System.out.println("해당 인덱스에 학생이 존재하지 않습니다.");
		
	}

	/** 6. 점수 합계, 평균, 최고점, 최저점 조회 */
	private void sumAvgMaxMin() {
		System.out.println("[점수 합계, 평균, 최고점, 최저점]");
		
		int[] arr = service.sumAvgMaxMin();
		
		System.out.println("합계 : " + arr[0]);
		System.out.println("평균 : " + arr[1]);
		System.out.println("최고점 : " + arr[2]);
		System.out.println("최저점 : " + arr[3]);
		
	}

}
