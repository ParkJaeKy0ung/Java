package edu.kh.polymorphism.ex1.service;

import edu.kh.polymorphism.ex1.dto.Car;
import edu.kh.polymorphism.ex1.dto.LightCar;
import edu.kh.polymorphism.ex1.dto.Truck;

public class CarServiceReview {
	
	public void ex1() {
		
		Car c1 = new Car();
		
		Car c2 = new Truck();
		Car c3 = new LightCar();
		
		c2.setWheel(4);
		c2.setSeat(8);
		c2.setFuel("경유");
		
//		c2.setWeight(2.5);  // 자식 객체의 부모 부분만 참조 가능
	}
	
	
	public void ex2() {
		
		Car c1 = new LightCar();
		
		((LightCar)c1).print();
		
		((LightCar)c1).setDiscountOffer(0.7);
		System.out.println( ((LightCar)c1).getDiscountOffer() );
		
		LightCar light1 = (LightCar)c1; // 얕은 복사 (주소 복사)
		light1.print();
	}
	
	
	public void ex3() {
		
		Car[] carList = new Car[3];
		
		carList[0] = new Truck(6, 4, "경유", 1); // 업캐스팅
		carList[1] = new LightCar(4, 4, "휘발유", 0.3);
		carList[2] = new Car(4, 2, "전기");
		
		for(Car c : carList) {
			System.out.println("바퀴 수 : " + c.getWheel());
			System.out.println("좌석 수 : " + c.getSeat());
			System.out.println("연료 형식: " + c.getFuel());
			
			if(c instanceof Truck) {
				System.out.println("최대 적재 하중 : " + ((Truck)c).getWeight());
			}else if(c instanceof LightCar) {
				System.out.println("할인율 : " + ((LightCar)c).getDiscountOffer());
			}else {
				System.out.println("차종이 등록되어있지 않습니다.");
			}
			
		}
		
		
		
	}
	
	

}
