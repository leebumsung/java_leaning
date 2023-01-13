/*
* <pre>
* Class : Application
* Comment : normal DTO 에제
* History
* 2023/01/13 (이범성) 처음 작성
* 2023/01/13 ( ) 회원 가입 관련 분기 처리 추가
* </pre>
* @version 1(클래스의 버전)
* @author 이범성(최초 작성자 명)
* @see 참고할 class나 외부 url
*
*/

package com.greedy.level02.normal.run;

import com.greedy.level02.normal.book.model.dto.BookDTO;

public class Application {

	public static void main(String[] args) {
		
		BookDTO bookdto1 = new BookDTO();
		System.out.println(bookdto1.getInform());
		System.out.println();
		
		BookDTO bookdto2 = new BookDTO("자바배우기","더존", "홍길동");
		System.out.println(bookdto2.getInform());
		System.out.println();
		
		BookDTO bookdto3 = new BookDTO("자바배우기","더존", "홍길동", 5000, 5.5);
		System.out.println(bookdto3.getInform());
		
		BookDTO book0 = new BookDTO();
		book0.setTitle("최강자바");
		System.out.println("바꾼후 타이틀 : " + book0.getTitle());
		
	}
}
