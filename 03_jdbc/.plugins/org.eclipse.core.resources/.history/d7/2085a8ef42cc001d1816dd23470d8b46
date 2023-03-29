package edu.kh.inheritance.dto;

public class Parent {
	
	private int money = 400_000_000;
	private String lastName = "박";
	
	public Parent() {
		System.out.println("▶parent() 기본 생성자");
	}

	public Parent(int money, String lastName) {
		super();
		this.money = money;
		this.lastName = lastName;
		System.out.println("▶parent(int, String) 매개변수 생성자");
	}

	
	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	@Override
	public String toString() {
		return money + " / " + lastName;
	}
}
