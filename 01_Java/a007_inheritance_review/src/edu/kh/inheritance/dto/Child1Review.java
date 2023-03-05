package edu.kh.inheritance.dto;

public class Child1Review extends Parent{
	
	private String car;
	
	public Child1Review() {
		System.out.println("★Child1Review() 기본 생성자");
	}
	
	public Child1Review(String car) {
//		super();
		super(200_000_000, "조");
		
		this.car = car;
		System.out.println("★Child1Review 매개변수 생성자");
	}
	
	public String getCar() {
		return car;
	}
	
	public void setCar(String car) {
		this.car = car;
	}
	
	public String toString() {
		return car + " / " + super.toString();
	}

}
