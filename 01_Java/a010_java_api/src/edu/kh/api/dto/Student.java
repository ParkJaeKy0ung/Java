package edu.kh.api.dto;

public class Student {
	
	private int grade;
	private int classRoom;
	private int number;
	private String name;
	
	
	public Student() {}
	
	public Student(int grade, int classRoom, int number, String name) {
		this.grade = grade;
		this.classRoom = classRoom;
		this.number = number;
		this.name = name;
	}

	
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
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
	
	
	@Override
	public String toString() {
		return String.format("%d / %d / %d / %s", grade, classRoom, number, name);
		
	}
	
	
	
}
