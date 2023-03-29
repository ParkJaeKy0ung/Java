package edu.kh.inheritance.dto;

public class Child2Review extends Parent{
	
	private String house;
	
	public Child2Review() {
		System.out.println("♥Child2Review 기본 생성자");
	}
	
	public Child2Review(String house) {
		this.house = house;
		System.out.println("♥Child2Review 매개변수 생성자");
	}
	
	public String getHouse() {
		return house;
	}
	
	public void setHouse() {
		this.house = house;
	}
	
	@Override
	public int getMoney() {
		System.out.println("자식이 오버라이딩한 getMoney()");
		return super.getMoney() + 500;
	}

}
