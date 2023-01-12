package com.greedy.level01.basic.member.mode.dto;

public class Applicaton {

	public static void main(String[] args) {
		
		MemberDTO member = new MemberDTO();
		System.out.println(member);
		
		member.setId("001");
		member.setPwd("pass001");
		member.setName("홍길동");
		member.setAge(20);
		member.setGender('남');
		member.setPhone("01022223333");
		member.setEmail("lee@naver.com");
		
		System.out.println("회원번호 : " + member.getId());
		System.out.println("비밀번호 : " + member.getPwd());
		System.out.println("회원명 : "+ member.getName());
		System.out.println("나이 : " + member.getAge());
		System.out.println("성별 : " + member.getGender());
		System.out.println("전화번호 : " + member.getPhone());
		System.out.println("이메일 : " + member.getEmail());
	}
}
