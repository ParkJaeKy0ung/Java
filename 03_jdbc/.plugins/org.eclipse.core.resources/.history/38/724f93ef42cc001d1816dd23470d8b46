package edu.kh.array.practice;

import java.lang.reflect.Array;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		/*
		길이가 9인 배열을 선언 및 할당하고, 1부터 9까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		짝수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		[실행 화면]
		1 2 3 4 5 6 7 8 9
		짝수 번째 인덱스 합 : 25
		*/
		
		int arr[] = new int[9];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i+1;  // i=0, 1/ i=1, 2/ i=3, 2 ...
			System.out.print(arr[i] + " ");
			
			if(i%2==0) {
				sum += arr[i];
			}
		}
		System.out.printf("\n짝수 번째 인덱스 합 : %d", sum);
	}
	
	
	
	public void practice2() {
		/*
		길이가 9인 배열을 선언 및 할당하고, 9부터 1까지의 값을 반복문을 이용하여
		순서대로 배열의 각 인덱스 요소에 대입하고 출력한 후
		홀수 번째 인덱스 값의 합을 출력하세요. (0 번째 인덱스는 짝수로 취급)
		
		[실행 화면]
		9 8 7 6 5 4 3 2 1
		홀수 번째 인덱스 합 : 20
		 */
		int[] arr = new int[9];
		
		int num = 9;
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			
			arr[i] = num--;	
			System.out.print(arr[i] + " ");	
			
			if(i%2==1) {
				sum += arr[i];
			}		
		}
		System.out.printf("\n홀수 번째 인덱스 합 : %d", sum);
	}
	
	
	
	public void practice3() {
		/*
		사용자에게 입력 받은 양의 정수만큼 배열 크기를 할당하고
		1부터 입력 받은 값까지 배열에 초기화한 후 출력하세요.
		
		[실행 화면]
		양의 정수 : 5
		1 2 3 4 5
		
		[실행 화면]
		양의 정수 : 8
		1 2 3 4 5 6 7 8
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		
		for(int i=0; i<input; i++) {
			arr[i]=i+1; // 1~input  // i=0, 1/ i=1, 2/ i=2, 3 ...
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public void practice4() {
		/*
		정수 5개를 입력 받아 배열을 초기화 하고
		검색할 정수를 하나 입력 받아 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		
		[실행 화면 1]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 8
		인덱스 : 1
		
		[실행 화면 2]
		입력 0 : 5
		입력 1 : 8
		입력 2 : 9
		입력 3 : 10
		입력 4 : 4
		검색할 값 : 1
		일치하는 값이 존재하지 않습니다.
		*/
		Scanner sc = new Scanner(System.in);
		
		// 정수 5개를 입력 받아 배열을 초기화 하고
		int[] num = new int[5];
		
		for(int i=0; i<num.length; i++) {
			System.out.printf("입력 %d : ", i);
			num[i] = sc.nextInt();
		}

		// 검색할 정수를 하나 입력 받아
		System.out.print("검색할 값 : ");
		int search = sc.nextInt();
		
		// 배열에서 같은 수가 있는 인덱스를 찾아 출력.
		// 배열에 같은 수가 없을 경우 “일치하는 값이 존재하지 않습니다“ 출력
		int index = 0;
		
		boolean flag = true;
		
		for(int i=0; i<num.length; i++) {
			if(search == num[i]) { // 입력값과 일치하는 값이 존재하는 경우
				index = i;
				flag = false;
				break; // 일치 값 찾은 경우 더 이상 반복 X
			}
		}
		
		if(flag) {  // --> true
			System.out.println("일치하는 값이 존재하지 않습니다.");
		}else {   // --> false
			System.out.println("인덱스 : " + index);
		}
	}
	
	
	
	public void practice5() {
		/*
		문자열을 입력 받아 문자 하나 하나를 char배열에 대입하고
		검색할 문자가 문자열에 몇 개 들어가 있는지, 몇 번째 인덱스에 위치하는지 인덱스를 출력하세요.
		[실행 화면]
		문자열 : application
		문자 : i
		application에 i가 존재하는 위치(인덱스) : 4 8
		i 개수 : 2
		*/
		
		// 문자열.charAt(인덱스번호)
		// - 문자열에서 해당 인덱스번째 문자 하나(char 자료형)를 반환
						
		Scanner sc = new Scanner(System.in);  // 문자열을 입력 받아
		
		System.out.print("문자열 : ");
		String word = sc.next();

		int count = 0; // 몇 개 들어가 있는지
				
		System.out.print("문자 : "); // 검색할 문자 입력		
		char target = sc.next().charAt(0); 
		
		System.out.printf("%s에 %c가 존재하는 위치(인덱스) : ", word, target);
				
		char[] arr = new char[word.length()]; // 문자열 길이 만큼의 char 배열 생성
				
		for(int i=0; i<word.length(); i++) { // 문자 하나하나를 char 배열에 대입
			arr[i] = word.charAt(i);
						
			if(target==arr[i]) {  // 검색(입력)한 값이 arr배열 문자와 같다면
				System.out.print(i + " ");
				count++; // 개수를 1씩 증가
			}
		}

		System.out.print("\ni 개수 : " + count);
	}
	
	
	
	public void practice6() {
		/*
		사용자가 배열의 길이를 직접 입력하여 그 값만큼 정수형 배열을 선언 및 할당하고
		배열의 크기만큼 사용자가 직접 값을 입력하여 각각의 인덱스에 값을 초기화 하세요.
		그리고 배열 전체 값을 나열하고 각 인덱스에 저장된 값들의 합을 출력하세요.
		
		[실행 화면]
		정수 : 5
		배열 0번째 인덱스에 넣을 값 : 4
		배열 1번째 인덱스에 넣을 값 : -4
		배열 2번째 인덱스에 넣을 값 : 3
		배열 3번째 인덱스에 넣을 값 : -3
		배열 4번째 인덱스에 넣을 값 : 2
		4 -4 3 -3 2
		총 합 : 2
		*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int input = sc.nextInt();
		
		int[] arr = new int[input];
		int sum = 0;
		
		for(int i=0; i<input; i++) {
			System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		for(int i=0; i<input; i++) {
			System.out.print(arr[i] + " ");   // arr[i] 값을 어떻게 기억하지..?
		}
		
		System.out.println("\n총 합 : " + sum);
	}
	
	
	
	public void practice7() {
		/*
		주민등록번호를 입력 받아 char 배열에 저장한 후 출력하세요.
		단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
		
		[실행 화면]
		주민등록번호(-포함) : 123456-1234567
		123456-1******
		*/
		// 문자열.charAt(인덱스번호)
		// - 문자열에서 해당 인덱스번째 문자 하나(char 자료형)를 반환
		
		// 주민등록번호를 입력 받아
		Scanner sc = new Scanner(System.in);

		System.out.print("주민등록번호(-포함) : ");
		String pNo = sc.next();
		
		// char 배열에 저장한 후 출력하세요.
		char[] arr = new char[pNo.length()];
				
		int index = 8; // 인덱스 초기화 (인덱스 8부터 *)
		
		for(int i=0; i<pNo.length(); i++) {  
			arr[i] = pNo.charAt(i);
						
			// 단, char 배열 저장 시 성별을 나타내는 숫자 이후부터 *로 저장하세요.
			if(i>=index) {
				System.out.print("*");
			}else {
				System.out.print(arr[i]);
			}
		}
	}
	
	
	
	public void practice8() {
		/*
		3이상인 홀수를 입력 받아 배열의 중간까지는 1부터 1씩 증가하여 오름차순으로 값을 넣고,
		중간 이후부터 끝까지는 1씩 감소하여 내림차순으로 값을 넣어 출력하세요.
		단, 입력한 정수가 홀수가 아니거나 3 미만일 경우 “다시 입력하세요”를 출력하고
		다시 정수를 받도록 하세요.
		
		[실행 화면]
		정수 : 4
		다시 입력하세요.
		정수 : -6
		다시 입력하세요.
		정수 : 5
		1, 2, 3, 2, 1
		*/
		Scanner sc = new Scanner(System.in);
		
		int num = 1;
		int input = 0;

		do {
			System.out.printf("정수 : ");
			input = sc.nextInt(); // 입력 받은 값이
			
			if(input>=3 && input%2==1) { // 만약 3이상인 홀수라면
				int[] arr = new int[input]; // input 길이의 배열에
				for(int i=0; i<input; i++) { // input까지 
					if(i<input/2) { // 앞쪽이면
						arr[i] = num; // 1부터 1씩 증가
						num++;
						System.out.print(arr[i] + " ");
					}else { // 뒤쪽이면
						arr[i] = num; // input/2부터 1씩 감소
						num--;
						System.out.print(arr[i] + " ");
					}
				}
				System.out.println();
			}else {
				System.out.println("다시 입력하세요.");
			}
		} while(input != 0);
	}
	
	
	
	public void practice9() {
		/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		1~10 사이의 난수를 발생시켜 배열에 초기화한 후 출력하세요.
		
		[실행 화면]
		발생한 난수 : 9 7 6 2 5 10 7 2 9 6
		*/
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public void practice10() {
		/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고,
		1~10 사이의 난수를 발생시켜 배열에 초기화 후
		배열 전체 값과 그 값 중에서 최대값과 최소값을 출력하세요.
		
		[실행 화면]
		발생한 난수 : 5 3 2 7 4 8 6 10 9 10
		최대값 : 10
		최소값 : 2
		 * */
		int[] arr = new int[10];
		
		System.out.print("발생한 난수 : ");
		
		for(int i=0; i<arr.length; i++) {
			int random = (int)(Math.random() * 10 + 1);
			arr[i] = random;
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=0; i<arr.length; i++) {
			
			if(max<arr[i]) {
				max=arr[i];
			}
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.print("최대값 : " + max);
		System.out.println();
		System.out.print("최소값 : " + min);
	}
	
	
	
	public void practice11() {
		/*
		10개의 값을 저장할 수 있는 정수형 배열을 선언 및 할당하고
		1~10 사이의 난수를 발생시켜 중복된 값이 없게 배열에 초기화한 후 출력하세요.
		
		[실행 화면]
		4 1 3 6 9 5 8 10 7 2
		 * */
		int arr[] = new int[10];
		
		for(int i=0; i<arr.length; i++) { 
			
			arr[i] = (int)(Math.random() * 10 + 1);  
			
			for(int j=0; j<i; j++) {
					if(arr[i]==arr[j]) {
						i--;
					}
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	
	
	
	public void practice12() {
		/*
		로또 번호 자동 생성기 프로그램을 만들기
		(중복 값 없이 오름차순으로 정렬하여 출력하세요.)
		
		[실행 화면]
		3 4 15 17 28 40
		 * */
		
		int[] lotto = new int[6];
		
		for(int i=0; i<lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45);
			
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					if(lotto[i]>lotto[i+1]) {
						continue;
					}
				}
			}
		}
		for(int i=0; i<lotto.length; i++) {
			System.out.print(lotto[i] + " ");
		}
	}
	
	
	
	public void practice13() {
		/*
		문자열을 입력 받아 문자열에 어떤 문자가 들어갔는지 배열에 저장하고
		문자의 개수와 함께 출력하세요. (중복 제거)
		
		[실행 화면]
		문자열 : application
		문자열에 있는 문자 : a, p, l, i, c, t, o, n
		문자 개수 : 8
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 : ");
		String word = sc.next();
		System.out.print("문자열에 있는 문자 : ");
		
		int count = 0;
		char[] arr = new char[word.length()];
		
		for(int i=0; i<word.length(); i++) {
			arr[i] = word.charAt(i);
			for(int j=0; j<i; j++) {
				if(arr[i]==arr[j]) {
					i++;
					continue;
				}
			}
			count++;
			System.out.print(arr[i] + " ");
		}
		
		System.out.printf("\n문자 개수 : %d", count);
	}
	
	
	
	public void practice14() {
		/*
		 * */
		
		Scanner sc = new Scanner(System.in);
		
//		스캐너 사용법
//
//		1) next() : 한 단어 (띄어쓰기, 엔터를 만나면 입력 종료)  —> hello
//		   nextLine() : 한 문장 (엔터를 만나면 입력 종료) —> hello world
//
//		2) 스캐너 입력 버퍼와 nextXXX의 의미
//		   입력 -> 입력 버퍼에 저장 -> nextXXX() 통해 버퍼 내용을 읽어옴
		
		//				입력 버퍼			 nextXXX()			  후처리
		// nextLine() : hello world(엔터) -> hello world(엔터) -> 엔터 제거
		// (다음 엔터)
		
		// nextInt() :     100(엔터) 	  -> 	    100		 
		// (다음 정수)
		// ** next(), nextDouble(), nextInt() 등
		// 	  모두 입력 버퍼에서 (엔터)를 제외하고 내용만 읽어옴 **
		
		System.out.println("----------------------------------------");
		
		System.out.print("nextInt() : ");  // 입력버퍼 : [ 100 (엔터) ]
		int a = sc.nextInt();
		// 100			// 입력버퍼 : [  (엔터)  ]
		
		// !문제 해결!
		sc.nextLine(); // 입력버퍼 : [    ]
		
		
		System.out.println("nextLine() : ");  // 입력버퍼 : [ a b c (엔터) ]
		String s = sc.nextLine();
		// a b c		// 입력버퍼 : [    ]
		
		System.out.println("종료");
		
		// [문제점]
		// nextInt() 이후 입력버퍼에 남아있는 (엔터(개행문자)) 때문에
		// 다음 nextLine() 수행 시 버퍼에 남아있는 (엔터)를 읽어버리기 때문에
		// 추가적인 입력을 시도하지 못 하고 다음 코드로 넘어가는 문제 발생.
		
		// [해결방법]
		// 입력을 위한 nextLine() 수행 전
		// 입력버퍼에서 (엔터)를 제거
		// -> 빈 공간에 sc.nextLine() 구문을 한번 작성하면 (엔터)가 제거됨.
		
		
		
		
		
		
		
		
		
//		String[] array=null;
//		String[] newArray=null;
//		int size;
//		char moreInput;
//		int moreInputCount=0;
//		
//		System.out.print("배열의 크기를 입력하세요 : ");
//		size = sc.nextInt();
//		sc.nextLine();
//		
//		array = new String[size];
//		
//		for(int i=0; i<array.length; i++) {
//			System.out.printf("%d번째 문자열 : ", i+1);
//			array[i] = sc.nextLine();
//		}
//		
//		while(true){
//			
//			System.out.print("더 값을 입력하시겠습니까? (Y/N) : ");
//			moreInput = sc.next().charAt(0);
//			
//			if(moreInput=='N' || moreInput=='n')
//				break;
//			
//			if(moreInput=='Y' || moreInput=='y') {
//				
//				System.out.print("더 입력하고 싶은 개수 : ");
//				moreInputCount = sc.nextInt();
//				sc.nextLine();
//				
//				newArray = new String[array.length + moreInputCount];
//				
//				
//				System.arraycopy(array, 0, newArray, 0, array.length);
//	
//				
//				for(int i=array.length; i<newArray.length; i++) {
//					System.out.printf("%d번째 문자열 : ", i+1);
//					newArray[i] = sc.nextLine();
//				}
//
//				array = newArray;
//			}
//			
//		}
//		
//		
//		if(newArray==null) 
//			System.out.println(Arrays.toString(array));
//		else
//			System.out.println(Arrays.toString(newArray));
	}
	
	
	
	public void practice15() {
		/*
		3행 3열짜리 문자열 배열을 선언 및 할당하고
		인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 “(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
		[실행 화면]
		(0, 0)(0, 1)(0, 2)
		(1, 0)(1, 1)(1, 2)
		(2, 0)(2, 1)(2, 2)
		 * */
		
		int[][] arr = new int[3][3];
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[0].length; col++) {
				System.out.printf("(%d, %d)", row, col);
			}
			System.out.println();
		}
	}
	
	
	
	public void practice16() {
		/*
		4행 4열짜리 정수형 배열을 선언 및 할당하고
		1) 1 ~ 16까지 값을 차례대로 저장하세요.
		2) 저장된 값들을 차례대로 출력하세요.
		
		[실행 화면]
		1 2 3 4
		5 6 7 8
		9 10 11 12
		13 14 15 16
		 * */
		
		int[][] arr = new int[4][4];
		
		int num = 1;
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[0].length; col++) {
				arr[row][col] = num++;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice17() {
		/*
		4행 4열짜리 정수형 배열을 선언 및 할당하고
		1) 16 ~ 1과 같이 값을 거꾸로 저장하세요.
		2) 저장된 값들을 차례대로 출력하세요.
		
		[실행 화면]
		16 15 14 13
		12 11 10 9
		8 7 6 5
		4 3 2 1
		 * */
		
		int[][] arr = new int[4][4];
		
		int num = 16;
		
		for(int row=0; row<arr.length; row++) {
			for(int col=0; col<arr[0].length; col++) {
				arr[row][col] = num--;
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	
	
	public void practice18() {
		/* 
		4행 4열 2차원 배열을 생성하여 0행 0열부터 2행 2열까지는 1~10까지의 임의의 정수 값 저장 후
		아래의 내용처럼 처리하세요.
		[실행 화면]
		9  3  7  	19 
		3  6  9  	18 
		6  10 10 	26 
		
		18 19 26 	63 
		
		 * */
		int[][] array = new int[4][4];
		int total = 0;

		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
				if(i<array.length-1 && j<array[i].length-1){
					array[i][j] = (int)(Math.random()*10)+1;
					
					total += array[i][j];
				}
			}
		}
		
		
		array[3][3] = total;
		
		
		for(int i=0; i<array.length-1; i++) {
			
			int sum=0;
			
			for(int j=0; j<array[i].length; j++) {
				
				sum += array[i][j];
				
				if(j==array[i].length-1) {
					array[i][j] = sum;
				}
			}
		}
		
		for(int i=0; i<array.length-1; i++) {
			
			int sum = 0;
			
			for(int j=0; j<array[i].length; j++) {
				
				sum += array[j][i];
				
				if(j==array[i].length-1) {
					array[j][i] = sum;
				}
			}
		}

		
		for(int[] i : array) {
			for(int j : i) {
				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		
		
		
		
//		int[][] arr = new int[4][4];
//		
//		int total = 0;		
//		
//		for(int row=0; row<arr.length-1; row++) {
//			for(int col=0; col<arr[row].length-1; col++) {
//				int random = (int)(Math.random()*10+1);
//				arr[row][col] = random;
//				System.out.print(arr[row][col] + " ");
//				
//				total += arr[row][col];
//			}
//			System.out.println();
//		}
//		arr[3][3] = total;
//		
//		for(int row=0; row<arr.length-1; row++) {
//			int sum = 0;
//			for(int col=0; col<arr[row].length-1; col++) {
//				sum += arr[row][col];
//				if(col==arr[row][col]-1) {
//					arr[row][col] = sum;
//				}
//				System.out.print(sum + " ");
//			}
//		}
//		for(int row=0; row<arr.length-1; row++) {
//			int sum = 0;
//			for(int col=0; col<arr[row].length-1; col++) {
//				sum += arr[row][col];
//				if(row==arr[row][col]-1) {
//					arr[row][col] = sum;
//				}
//				System.out.print(sum + " ");
//			}
//		}
	}
	
	
	
	public void practice19() {
		/*
		2차원 배열의 행과 열의 크기를 사용자에게 직접 입력받되, 1~10사이 숫자가 아니면
		“반드시 1~10 사이의 정수를 입력해야 합니다.” 출력 후 다시 정수를 받게 하세요.
		크기가 정해진 이차원 배열 안에는 영어 대문자가 랜덤으로 들어가게 한 뒤 출력하세요.
		(char형은 숫자를 더해서 문자를 표현할 수 있고 65는 A를 나타냄, 알파벳은 총 26글자)
		
		[실행 화면]
		행 크기 : 5
		열 크기 : 4
		T P M B
		U I H S
		Q M B H
		H B I X
		G F X I
		 * */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("행 크기 : ");
		int row = sc.nextInt();
		System.out.print("열 크기 : ");
		int col = sc.nextInt();
		
		char[][] arr = new char[row][col];
		
		for(int i=0; i<row; i++) {  // 왜 row 자리에 arr.length 안 되고
			for(int j=0; j<col; j++) {  // 왜 col 자리에 arr[row].length 안 되지
				arr[i][j] = (char)(Math.random()*('Z'-'A'+1)+'A');
				
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}			
	}
	
	
	
	public void practice20() {
		/*
		사용자에게 행의 크기를 입력 받고 그 수만큼의 반복을 통해 열의 크기도 받아
		문자형 가변 배열을 선언 및 할당하세요.
		그리고 각 인덱스에 ‘a’부터 총 인덱스의 개수만큼 하나씩 늘려 저장하고 출력하세요.
		
		[실행 화면]
		행의 크기 : 4
		0열의 크기 : 2
		1열의 크기 : 6
		2열의 크기 : 3
		3열의 크기 : 5
		a b
		c d e f g h
		i j k
		l m n o p
		 * */
		Scanner sc = new Scanner(System.in);
		
		int rowSize;
		int colSize;
		char[][] array;
		char index = 'a';
		
		System.out.print("행의 크기 : ");
		rowSize = sc.nextInt();
	
		array = new char[rowSize][];
		
		for(int i=0; i<array.length; i++) {
			System.out.printf("%d열의 크기 : ", i);
			colSize = sc.nextInt();
			array[i] = new char[colSize];
		}
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				array[i][j] = index++;
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("행의 크기 : ");
//		int input = sc.nextInt(); // 행의 크기 입력
//		
//		char ch = 'a'; // 문자형 초기화
//		char[][] arr = new char[input][]; // 가변배열 생성
//		
//		for(int i=0; i<input; i++) { // i가 input까지 커질 때
//			System.out.printf("%d열의 크기 : ", i); 
//			int scale = sc.nextInt(); // 열의 크기 입력받음
//			
//			arr[i] = new char[scale]; // 열의 크기는 입력받은 숫자만큼
//			
//			for(int row=0; row<input; row++) {
//				for(int col=0; col<scale; col++) {
//					arr[row][col] = ch;
//					ch++;
//					
//					System.out.print(arr[row][col] + " ");
//				}
//				System.out.println();
//			}
////			--> 0열의 크기와 0열 값만 출력하고 끝남.
//		}
		
		
		
		
//		for(int row=0; row<input; row++) { // 배열 행 숫자 범위
//			for(int col=0; col<scale; col++) { // 배열 열 숫자 범위
//				arr[row][col] = ch;
//				ch++;
//				
//				System.out.print(arr[row][col] + " ");
//			}
//			System.out.println();
//		}
	}
	
	
	
	public void practice21() {
		/*
		1차원 문자열 배열에 학생 이름 초기화되어 있다.
		3행 2열 짜리 2차원 문자열 배열 2개를 새로 선언 및 할당하여
		학생 이름을 2차원 배열에 순서대로 저장하고 아래와 같이 출력하시오.
		(첫 번째 2차원 배열이 모두 저장된 경우 두 번째 2차원 배열에 저장 진행)
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
		"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		[실행 화면]
		== 1분단 ==
		강건강 남나나
		도대담 류라라
		문미미 박보배
		== 2분단 ==
		송성실 윤예의
		진재주 차천축
		피풍표 홍하하
		 * */
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
				
		int index = 0;
		
		System.out.println("== 1분단 ==");
		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr1[row].length; col++) {
				arr1[row][col] = students[index];
				System.out.print(arr1[row][col] + " ");
				index++;
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				arr2[row][col] = students[index];
				System.out.print(arr2[row][col] + " ");
				index++;
			}
			System.out.println();
		}
		
//		int row = 0;
//		int col = 0;
//		
//		System.out.println("== 1분단 ==");
//		for(int i=0; i<students.length; i++) {
//			if(0<=i && i<students.length/2) {
//				arr1[row][col] = students[i];
//			}
//			System.out.print(arr1[row][col] + " ");
//		}	
//		System.out.println();
//		
//		System.out.println("== 2분단 ==");
//		for(int i=0; i<students.length; i++) {
//			if(students.length<=i && i<students.length) {
//				arr2[row][col] = students[i];
//			}
//			System.out.print(arr2[row][col] + " ");
//		}
	}
	
	
	
	public void practice22() {
		/*
		위 문제에서 자리 배치한 것을 가지고 학생 이름을 검색하여
		해당 학생이 어느 자리에 앉았는지 출력하세요.
		
		[실행 화면]
		== 1분단 ==
		강건강 남나나
		도대담 류라라
		문미미 박보배
		== 2분단 ==
		송성실 윤예의
		진재주 차천축
		피풍표 홍하하
		============================
		검색할 학생 이름을 입력하세요 : 차천축
		검색하신 차천축 학생은 2분단 2번째 줄 오른쪽에 있습니다.
		 * */
		Scanner sc = new Scanner(System.in);
		
		String[] students = {"강건강", "남나나", "도대담", "류라라", "문미미", "박보배",
				"송성실", "윤예의", "진재주", "차천축", "피풍표", "홍하하"};
		
		int index = 0;
		
		String[][] arr1 = new String[3][2];
		String[][] arr2 = new String[3][2];
		
		System.out.println("== 1분단 ==");
		for(int row=0; row<arr1.length; row++) {
			for(int col=0; col<arr1[row].length; col++) {
				arr1[row][col] = students[index];
				System.out.print(arr1[row][col] + " ");
				index++;
			}
			System.out.println();
		}
		
		System.out.println("== 2분단 ==");
		for(int row=0; row<arr2.length; row++) {
			for(int col=0; col<arr2[row].length; col++) {
				arr2[row][col] = students[index];
				System.out.print(arr2[row][col] + " ");
				index++;
			}
			System.out.println();
		}
		System.out.println("============================");
		System.out.print("검색할 학생 이름을 입력하세요 : ");
		String name = sc.next();

		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				if(name.equals(arr1[i][j])) {
					String leftOrRight = j==0 ? "왼쪽" : "오른쪽";
					System.out.printf("검색하신 %s 학생은 1분단 %d번째 줄 %s에 있습니다.", name, j+1, leftOrRight);
				}
			}
		}
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				if(name.equals(arr2[i][j])) {
					String leftOrRight = j==0 ? "왼쪽" : "오른쪽";
					System.out.printf("검색하신 %s 학생은 2분단 %d번째 줄 %s에 있습니다.", name, j+1, leftOrRight);
				}
			}
		}
		
	}
	
	
	
	public void practice23() {
		/*
		String 2차원 배열 6행 6열을 만들고 행의 맨 위와 제일 앞 열은 각 인덱스를 저장하세요.
		그리고 사용자에게 행과 열을 입력 받아 해당 좌표의 값을 “X”로 변환해 2차원 배열을 출력하세요.
		
		[실행 화면]
		행 인덱스 입력 : 4
		열 인덱스 입력 : 2
		  0 1 2 3 4
		0
		1
		2
		3
		4     X
		 * */
		Scanner sc = new Scanner(System.in);
//		System.out.print("행 인덱스 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("열 인덱스 입력 : ");
//		int num2 = sc.nextInt();
//		
//		String[][] arr = new String[6][6];
//		int index1 = 0;
//		int index2 = 0;
//		
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<arr[i].length; j++) {
//				if(i==0 && j>0) {
//					arr[i][j] = Integer.toString(index1);
//					System.out.print(index1 + " ");
//					index1++;
//				}else if(j==0 && i>0) {
//					arr[i][j] = Integer.toString(index2);
//					System.out.println(index2 + " ");
//					index2++;
//				}else {
//					arr[i][j] = " ";
//				}
//			}
//		}
//		arr[num1][num2] = "X";
//		System.out.print(arr[num1][num2]);
		String[][] array = new String[6][6];
		int index1=0;
		int index2=0;
		int rowIndex;
		int colIndex;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				
				if(i==0 && j>0) {
					array[i][j] = Integer.toString(index1++);
				}else if(j==0 && i>0) {
					array[i][j] = Integer.toString(index2++);
				}else {
					array[i][j] = " ";
				}
			}
		}
		
		System.out.print("행 인덱스 입력 : ");
		rowIndex = sc.nextInt();
		
		System.out.print("열 인덱스 입력 : ");
		colIndex = sc.nextInt();
		
		array[rowIndex+1][colIndex+1] = "X";
		
		for(String[] i : array) {
			for(String j : i) {
				System.out.printf(" %s ", j);
			}
			System.out.println();
		}
		
	}
	
	
	
	public void practice24() {
		/*
		실습문제9와 내용은 같으나 행 입력 시 99가 입력되지 않으면 무한 반복이 되도록 구현하세요.

		[실행 화면]
		행 인덱스 입력 : 2 			행 인덱스 입력 : 3
		열 인덱스 입력 : 2 			열 인덱스 입력 : 1
		  0 1 2 3 4 				  0 1 2 3 4
		0 							0
		1 							1
		2     X 					2       X
		3 							3     X
		4 							4
		
									행 인덱스 입력 >> 99
									프로그램 종료
		 * */
//		Scanner sc = new Scanner(System.in);
//		
//		String[][] array = new String[6][6];
//		int index1=0;
//		int index2=0;
//		int rowIndex;
//		int colIndex;
//		
//		for(int i=0; i<array.length; i++) {
//			for(int j=0; j<array[i].length; j++) {
//				
//				if(i==0 && j>0) {
//					array[i][j] = Integer.toString(index1++);
//				}else if(j==0 && i>0) {
//					array[i][j] = Integer.toString(index2++);
//				}else {
//					array[i][j] = " ";
//				}
//			}
//		}
//		
//		while(true) {
//			
//			System.out.print("행 인덱스 입력 : ");
//			rowIndex = sc.nextInt();
//			
//			if(rowIndex==99) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			
//			System.out.print("열 인덱스 입력 : ");
//			colIndex = sc.nextInt();
//			
//			array[rowIndex+1][colIndex+1] = "X";
//			
//			for(String[] i : array) {
//				for(String j : i) {
//					System.out.printf(" %s ", j);
//				}
//				System.out.println();
//			}
//		}
	}
	

	
}
