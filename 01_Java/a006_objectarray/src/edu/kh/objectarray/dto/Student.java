package edu.kh.objectarray.dto;

public class Student {
	
	// 필드 (캡슐화 원칙에 의해 모두 private)
	private int grade;
	private int classRoom;
	private int number;
	private String name;
	
	private int kor;
	private int eng;
	private int math;
	
	
	// 생성자
	public Student() {} // 기본 생성자
	
	// 매개변수 생성자 (오버로딩 적용)
	public Student(int grade, int classRoom, int number, String name) {
		
		// this 참조변수
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}
	
	
	// getter / setter
	public int getGrade() { // public 반환형 get필드명
		return grade;
	}
	
	public void setgGrade(int grade) { // public 반환형 set필드명
		this.grade = grade;
	}
	
	public int getClassRoom() {
		return classRoom;
	}
	
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void setNumber(int number) {
		this.number = number;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	
	public void setEng(int eng) {
		this.eng = eng;
	}
	
	public int getMath() {
		return math;
	}
	
	public void setMath(int math) {
		this.math = math;
	}
	
	
	// 객체의 필드 값을 하나의 문자열 형태로 반환하는 메서드
	public String toString() {
		return String.format("%d학년 %d반 %d번 %s [%d, %d, %d]", grade, classRoom, name, kor, eng, math);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
