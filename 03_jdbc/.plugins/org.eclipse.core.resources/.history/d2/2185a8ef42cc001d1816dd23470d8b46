package edu.kh.inheritance.run;

import edu.kh.inheritance.dto.Child1Review;
import edu.kh.inheritance.dto.Child2Review;
import edu.kh.inheritance.dto.Parent;

public class TestRun {
	public static void main(String[] args) {
		
		Parent p = new Parent(1_000_000_000, "김");
		System.out.println("======\n");
		
		Child1Review cr1 = new Child1Review("아반떼");
		Child2Review cr2 = new Child2Review("시그니엘");
		System.out.println("======\n");
		
		System.out.println(cr1.getMoney());
		System.out.println(cr1.getLastName());
		
		System.out.println(cr2.getMoney()); // 자식클래스에서 오버라이딩!
		System.out.println(cr2.getLastName());
		
//		System.out.println(cr1.money()); -> XXX!!!
		
		System.out.println("--------------------");
		System.out.println(cr1.toString());
	}

}
