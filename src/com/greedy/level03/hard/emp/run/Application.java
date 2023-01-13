
package com.greedy.level03.hard.emp.run;

import java.util.Scanner;

import com.greedy.level03.hard.emp.model.dto.EmployeeDTO;

public class Application {

	public static void main(String[] args) {
		
		Scanner emInfo = new Scanner(System.in);
		
		EmployeeDTO emp = new EmployeeDTO();
		
		System.out.print("직원번호를 입력하세요 : ");
		int number = emInfo.nextInt();
		emp.setNumber(number);
		
		System.out.println("직원이름을 입력하세요 : ");
		String name = emInfo.next();
		emp.setName(name);
		
		System.out.println("직원부서를 입력하세요 : ");
		String dept = emInfo.next();
		emp.setDept(dept);
		
		System.out.println("직원업무를 입력하세요 : ");
		String job = emInfo.next();
		emp.setJob(job);
		
		System.out.println("직원나이를 입력하세요 : ");
		int age = emInfo.nextInt();
		emp.setAge(age);
		
		System.out.println("직원성별을 입력하세요 : ");
		char gender = emInfo.next().charAt(0);
		emp.setGender(gender);
		
		System.out.println("직원급여를 입력하세요 : ");
		int salary = emInfo.nextInt();
		emp.setSalary(salary);
		
		System.out.println("직원보너스를 입력하세요 : ");
		double bonusPoint = emInfo.nextDouble();
		emp.setBonusPoint(bonusPoint);
		
		System.out.println("직원연락처를 입력하세요 : ");
		String phone = emInfo.next();
		emp.setPhone(phone);
		
		System.out.println("직원주소를 입력하세요 : ");
		String address = emInfo.next();
		emp.setAddres(address);
		
		System.out.println();

		System.out.println(" 직원번호 = " + emp.getNumber()); 
		System.out.println(" 직원이름 = " + emp.getName()); 
		System.out.println(" 직원부서 = " + emp.getDept());
		System.out.println(" 직원업무 = " + emp.getJob());
		System.out.println(" 직원나이 = " + emp.getAge());
		System.out.println(" 직원성별 = " + emp.getGender());
		System.err.println(" 직원급여 = " + emp.getSalary());
		System.out.println(" 직원보너스 = " + emp.getBonusPoint());
		System.out.println(" 직원연락처 = " + emp.getPhone());
		System.out.println(" 직원주소 = " + emp.getAddress());
	}
}
