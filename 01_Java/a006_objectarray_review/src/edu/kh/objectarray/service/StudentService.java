package edu.kh.objectarray.service;

import edu.kh.objectarray.dto.Student;

public class StudentService {
	
	private Student[] studentArr = new Student[5];
	
	public StudentService() {
		studentArr[0] = new Student(3, 5, 17, "홍길동");
		studentArr[1] = new Student(2, 3, 11, "김철수");
		studentArr[2] = new Student(1, 7, 3, "최미영");
	}
	
	
	/** 1. 학생 추가 서비스
	 * @param grade:int
	 * @param classRoom : int
	 * @param number : int
	 * @param name: String
	 * 
	 * @return result : boolean (학생 추가 성공 시 true)
	 * */
	public boolean addStudent(int grade, int classRoom, int number, String name) {
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i] == null) {
				studentArr[i] = new Student(grade, classRoom, number, name);
				return true;
			}
		}
		return false;
	}
	
	
	/** 2. 학생 전체 조회
	 * @return studentArr : Student[]
	 * */
	public Student[] selectAll() {
		return studentArr;
	}
	
	
	/** 3. 학생 정보 조회(인덱스)
	 * @param index : int
	 * 
	 * @return studentArr[index] : Student 참조 변수
	 * */
	public Student selectIndex(int index) {
		if(!(0<=index && index<=4)) {
			return null;
		}
		return studentArr[index];
	} 
	
	
	/** 4. 학생 정보 조회(이름)
	 * @param inputName : String
	 * 
	 * @return resultArr : student[] (조회할 학생이 없을 경우 null)
	 * */
	public Student[] selectName(String inputName) {
		
		Student[] resultArr = new Student[studentArr.length];
		
		int index = 0;
		
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i] == null) {
				break;
			}
			
			if(studentArr[i].getName().equals(inputName)) {
				resultArr[index++] = studentArr[i];
			}
		}
		if(index==0) {
			return null;
		}
		
		return resultArr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
