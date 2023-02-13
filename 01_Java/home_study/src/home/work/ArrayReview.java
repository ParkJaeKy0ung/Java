package home.work;

import java.util.Scanner;

public class ArrayReview {
	

	public void ex1() {
		int[] arr;
		arr = new int[4];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		System.out.println("arr[0] : " + arr[0]);
		System.out.println("arr[1] : " + arr[1]);
		System.out.println("arr[2] : " + arr[2]);
		System.out.println("arr[3] : " + arr[3]);
		
		System.out.println("--------------------");
		
		
		int sum = 0;
		
		for(int i=0; i<4; i++) {
			System.out.printf("arr[%d] : %d \n", i, arr[i]);
			
			sum += arr[i];
		}
		System.out.println("합계 : " + sum);
	}
	

	public void ex2() {
		
		int[] numbers = new int[4];
		
		numbers[0] = 15;
		numbers[1] = 25;
		numbers[2] = 10;
		numbers[3] = 100;
		
		for(int i=0; i<numbers.length; i++) {
			numbers[i] = i * 10 + 1;
		}
		System.out.println(numbers[0]); // 1
		System.out.println(numbers[1]); // 11
		System.out.println(numbers[2]); // 21
		System.out.println(numbers[3]); // 31
	}
	

	public void ex3() {
		// 오늘의 점심 메뉴 뽑기
		
		String[] menuArr = {"김밥+라면", "서브웨이", "KFC", "맘스터치", "순대국", "뼈해장국", "닭갈비", "마라탕", "우육면", "파스타", "샐러드"};
		
		int ran = (int)(Math.random() * menuArr.length);
		
		System.out.println("오늘 점심 뭐 먹지? : " + menuArr[ran]);
	}
	

	public void ex4() {
		// 3명의 키를 입력 받아 평균 구하기
		
		// 1번 키 입력 : 170.5
		// 2번 키 입력 : 165.7
		// 3번 키 입력 : 180.4
		
		// 입력 받은 키 : 170.5   165.7   180.4
		// 평균 키 : 172.20cm
		
		Scanner sc = new Scanner(System.in);
		
		double[] heightArray = new double[3];
		
		for(int i=0; i<heightArray.length; i++) {
			System.out.printf("%d번 키 입력 : ", i+1);
			heightArray[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("입력 받은 키 : ");
		
		double sum = 0.0;
		
		for(int i=0; i<heightArray.length; i++) {
			System.out.print(heightArray[i] + " ");
			sum += heightArray[i];
		}
		System.out.printf("\n평균 키 : %.2fcm", sum/heightArray.length);
	}
	
	
	public void ex5() {
		
	}
	
	
	public void ex6() {
		
	}
	
	
	public void ex7() {
		
	}
	
	
	public void ex8() {
		
	}
	
	
	public void ex9() {
		
	}
	
	
	public void ex10() {
		
	}
	

}
