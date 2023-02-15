package edu.kh.oop.field.pack1;

import edu.kh.oop.field.pack2.FieldTest2; // 다른 패키지에 있는 
import edu.kh.oop.field.pack2.FieldTest3;

public class FieldRun extends FieldTest3{  // FieldTest3에 대한 상속구문 (protected) FieldTest3에 대한 필드?를? Run이 물려받음
	public static void main(String[] args) {
		
		// 클래스를 이용해서 객체(인스턴스) 생성
		
		// FieldTest2 은 FieldRun과 같은 패키지
		// -> import 없이 사용 가능
		FieldTest1 f1 = new FieldTest1();
		
		// FieldTest2 는 FieldRun과 다른 패키지에 존재
		// -> import 사용해야함. 
		// (import edu.kh.oop.field.pack2.FieldTest2;)
		// (import edu.kh.oop.field.pack2.FieldTest3;)
		FieldTest2 f2 = new FieldTest2();
		FieldTest3 f3 = new FieldTest3();
		
		
		// 접근제한자 확인
		
		/* FieldTest1 --> FieldRun과 같은 패키지 */
		System.out.println(f1.v1); 	   // public
		System.out.println(f1.v2);     // protected
		System.out.println(f1.v3);     // (default)
		// System.out.println(f1.v4);  // private  
		// -> The field FieldTest1.v4 is not visible
		// : private은 다른 클래스에서 보이지 않음!
		
		/* FieldTest2 --> FieldRun과 다른 패키지 */
		System.out.println(f2.v1);    // public
		// System.out.println(f2.v2); // protected  -- 상속관계면 가능함.
		// System.out.println(f2.v3); // (default)
		// System.out.println(f2.v4); // private  
		// 패키지가 다른 FieldTest2는
		// public만 접근 가능하고 나머지는 불가능
	}
	
	public void ex() {
		
		FieldTest3 t3 = new FieldTest3();
		System.out.println(t3.v1); // public
		
		// System.out.println(t3.v2); // protected
		System.out.println(v2);
		// FieldRun이 FieldTest3를 상속 받음
		// -> FieldTest3의 필드를
		//    FieldRun이 자신의 것처럼 사용 가능
		
	}
}
