package edu.kh.stock_market.data;

import java.util.Arrays;

public class Information {

	// private ArrayList<String> infoDescription;	// 정보 설명
	
	private String eventName; // 정보 발생 문자열
	// 바이오, 여행, 자율주행, 자동차, 엔터, 반도체, IT, 금융, 건설, 보험, 화학, 식품, 뷰티, 종목없음
	private String[] increase; // 상승 종목 배열
	private String[] decrease; // 하락 종목 배열
	
	public Information() {
		
	}
	
	public Information(String eventName, String[] increase, String[] decrease) {
		this.eventName = eventName;
		this.increase = increase;
		this.decrease = decrease;
	}

	@Override
	public String toString() {
		return eventName + "이/가 발생하였습니다.";
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return eventName;
//	}
//
	
	
	

}