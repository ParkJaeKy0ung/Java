package edu.kh.jdbc.run;

import java.util.List;
import java.util.Scanner;

import edu.kh.jdbc.dao.SelectNameDAO;
import edu.kh.jdbc.dto.Employee2;

public class JDBCExample4 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("직급명 입력 : ");
		String input = sc.nextLine();
		
		SelectNameDAO dao = new SelectNameDAO();
		
		List<Employee2> empList = dao.select(input); // DAO return empList; 반환 위치
		
		if(empList.isEmpty()) {
			System.out.println("일치하는 직급명과 일치하는 사원이 없습니다.");
			return;
		}
		
		for(Employee2 emp : empList) {
			System.out.println(emp);
		}
	}
}
