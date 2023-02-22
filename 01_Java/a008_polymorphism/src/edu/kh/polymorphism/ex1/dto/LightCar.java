package edu.kh.polymorphism.ex1.dto;

public class LightCar extends Car {

	// 필드
	private double discountOffer; // 할인 혜택
	
	
	// 기본 생성자
	public LightCar() {
		super();
	}
	// 매개변수 생성자
	public LightCar(int wheel, int seat, String fuel, double discountOffer) {
		super(wheel, seat, fuel);
		
		this.discountOffer = discountOffer;
	}
	
	
	// getter / setter
	public double getDiscountOffer() {
		return discountOffer;
	}
	public void setDiscountOffer(double discoutOffer) {
		this.discountOffer = discoutOffer;
	}
	
	
	// Car.toString() 오버라이딩
	@Override
	public String toString() {
		return super.toString() + " / 할인율 : " + discountOffer * 100 + "%";
	}
	
	
	// 메서드
	public void print() {
		System.out.println("고속도로 요금, 주차장 요금, 세금 혜택을 받을 수 있다.");
	}
	
}
