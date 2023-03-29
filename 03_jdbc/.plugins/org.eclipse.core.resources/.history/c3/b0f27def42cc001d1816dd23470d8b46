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
	
	
	/** 5. 학생 정보 수정(인덱스)
	 * @param index:int
	 * @param kor:int
	 * @param eng:int
	 * @param math:int
	 * 
	 * @return 수정 성공 시 true / 실패 시 false
	 * */
	public boolean updateStudent(int index, int kor, int eng, int math) {
		if((index<0 || index>=studentArr.length) || studentArr[index]==null) {
			return false;
		}
		
		studentArr[index].setKor(kor);  /* 설명 필요 */
		studentArr[index].setEng(eng);
		studentArr[index].setMath(math);
		return true;
	}
	
	
	/** 6. 학생 총점 점수 합계, 평균, 최고점, 최저점 
	 * @return arr : int[] (인덱스 순서대로 합계, 평균, 최고점, 최저점)
	 *  */
	public int[] sumAvgMaxMin() {
		int[] arr = new int[4];
		
		int size = 0;
		
		for(int i=0; i<studentArr.length; i++) {
			if(studentArr[i] == null) break;
			else size++;
		}
		
		int[] sumArr = new int[size];
		
		for(int i=0; i<sumArr.length; i++) {
			sumArr[i] = studentArr[i].getKor() + studentArr[i].getEng() + studentArr[i].getMath();
			arr[0] += sumArr[i];
		}
		
		arr[1] = arr[0] /size;
		
		int max = sumArr[0];
		int min = sumArr[0];
		
		for(int s : sumArr) {
			if(s>max) max=s;
			if(s<min) min=s;
		}
		arr[2] = max;
		arr[3] = min;
		
		return arr;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
