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
		
		
	}
}
