package edu.kh.polymorphism.ex1.service;

import java.util.Scanner;

import edu.kh.polymorphism.ex1.dto.*;

public class CarServiceReview {
	
	public void ex1() {
		Car c1 = new Car();
		
		Car c2 = new Truck();
		Car c3 = new LightCar();
		
		c2.setWheel(10);
		c2.setSeat(3);
		c2.setFuel("경유");
		
//		c2.setWeight(2.5);	
		// 부모 타입 참조 변수로 참조 시 
		// 자식 객체의 부모 부분만 참조 가능
	}
	
	
	public void ex2() {
		Car c1 = new LightCar();
		
		((LightCar)c1).print(); // 다운캐스팅 + 메서드 실행
		
		((LightCar)c1).setDiscountOffer(3.3); // 다운캐스팅
		System.out.println( ((LightCar)c1).getDiscountOffer() );
		
		LightCar light1 = (LightCar)c1; // 다운캐스팅 + 얕은 복사
		light1.print(); // 메서드 실행 (System.out.println)
	}
	
	
	public void ex3() { // 다형성 + 객체배열 + instanceof
		
		Car[] carList = new Car[3];
		
		carList[0] = new Truck(6, 4, "경유", 1); // 업캐스팅
		carList[1] = new LightCar(3, 7, "휘발유", 0.3); // 업캐스팅
		carList[2] = new Car(4, 2, "전기");
		
		for(Car c : carList) {
			System.out.println("바퀴 수 : " + c.getWheel());
			System.out.println("좌석 수 : " + c.getSeat());
			System.out.println("연료 형식 : " + c.getFuel());
			
			if(c instanceof Truck) { // 참조하는 객체의 자료형을 판단하여 다운캐스팅 진행
				System.out.println("최대 적재 하중 : " + ((Truck)c).getWeight());
				// c가 참조하는 객체가 Truck 객체일 경우 최대 적재 하중 : 2.5t
			}else if(c instanceof LightCar) {
				System.out.println("할인율 : " + ((LightCar)c).getDiscountOffer() * 100 + "%");
			}else {
				System.out.println("차종이 등록되어있지 않습니다.");
			}
			System.out.println("-----------------------------");
		}
	}	
	
	
	public void ex4() { // 객체배열 + 다형성 + instanceof + 매개변수 다형성 + 바인딩(동적/정적)
		// 바인딩 : 메서드 호출 구문과 수행될 메서드를 연결하는 것 (묶는 것)
		Car[] carList = new Car[3];
		
		carList[0] = new Truck(6, 4, "경유", 1);
					// -> 동적 바인딩 : Truck의 toString 실행
		carList[1] = new LightCar(3, 7, "휘발유", 0.3);
					// -> 동적 바인딩 : LightCar의 toString 실행
		carList[2] = new Car(4, 2, "전기");
					// -> 동적 바인딩 : Car의 toString 실행
		
		for(Car c : carList) {
			printCar(c); // 차량 정보 출력
		}
	}
	
	public void printCar(Car c) { // 차량 정보를 출력하는 메서드
		
		String type = null; // 변수 선언 및 초기화
		
		// 매개변수가 전달 받은 c가 참조하는 객체에 따라서 
		// type의 값 지정
		if(c instanceof Truck) type = "[Truck]";
		else if(c instanceof LightCar) type = "[LightCar]";
		else type = "[Car]";
		
		System.out.println(type + "에 대한 정보입니다.");
		System.out.println(c.toString());
						// -> 동적 바인딩으로 해당 객체의 toString 정보 출력됨.
	}

	
	public void ex5() { // 반환형의 다형성(업캐스팅) 적용
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생성할 자동차 종류를 선택하세요.");
		System.out.println("1. 트럭");
		System.out.println("2. 경차");
		System.out.println("3. 자동차");
		
//		Car c = new createCar(sc.nextInt());
		
		System.out.println("차가 생성되었습니다.");
	}
	
	public Car createCar(int num) {
		
		switch(num) {
		case 1: return new Truck();
		case 2: return new LightCar();
		case 3: return new Car();
		}
		
		return null;
	}
}
