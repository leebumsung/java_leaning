package com.greedy.level01.basic.member.mode.dto;

public class Applicaton {

	public static void main(String[] args) {
		
		MemberDTO member0 = new MemberDTO();
		member0.setId(null);
		member0.setPwd(null);
		member0.setName(null);
		member0.setAge(0);
//		member0.setGender(0);
		member0.setPhone(null);
		member0.setEmail(null);;

		System.out.println("회원번호 : " + member0.getId());
		System.out.println("비밀번호 : " + member0.getPwd());
		System.out.println("회원명 : "+ member0.getName());
		System.out.println("나이 : " + member0.getAge());
		System.out.println("성별 : " + member0.getGender());
		System.out.println("전화번호 : " + member0.getPhone());
		System.out.println("이메일 : " + member0.getEmail());
		System.out.println("==============================");
		
		MemberDTO member1 = new MemberDTO();
		member1.setId("001");
		member1.setPwd("pass001");
		member1.setName("홍길동");
		member1.setAge(20);
		member1.setGender('남');
		member1.setPhone("01022223333");
		member1.setEmail("lee@naver.com");
		
		System.out.println("변경후 회원번호 : " + member1.getId());
		System.out.println("변경후 비밀번호 : " + member1.getPwd());
		System.out.println("변경후 회원명 : "+ member1.getName());
		System.out.println("변경후 나이 : " + member1.getAge());
		System.out.println("변경후 성별 : " + member1.getGender());
		System.out.println("변경후 전화번호 : " + member1.getPhone());
		System.out.println("변경후 이메일 : " + member1.getEmail());
	}
}
