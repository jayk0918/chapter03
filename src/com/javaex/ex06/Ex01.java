package com.javaex.ex06;

public class Ex01 {

	public static void main(String[] args) {
		
		String s01 = new String("안녕하세요");
		String s02 = new String("안녕하세요");
		
		System.out.println(s01 == s02);	// false
		
		System.out.println("===================");
		
		String s03 = "hi";
		String s04 = "hi";
		
		System.out.println(s03 == s04); // true..? 왜 true?
		// s01&s02 와 s03&s04의 상황차이
		
		// s01&s02 : new로 각각 신규 생성(강제)하였음, 각각 다른 주소값
		
		// s03&s04 :
		// 1) s03을 만들기 전에 "hi"가 있는지를 찾음
		// 2) 없으면 s03을 새로 만들고 s04 검증으로 넘어감
		// 3) s04에서 "hi"와 같은 s03을 발견하고 같은 값으로 처리함 (메모리 절약 차원)
		// new로 신규 생성을 강제하지 않았기 때문에 자기들이 알아서 같은것으로 처리함
		
		s03 = "하이하이";	// s03을 변경하였을 경우
		System.out.println(s03 == s04);	// false
		System.out.println(s03.toString());
		System.out.println(s04.toString());
		
		// false가 되는 이유
		// "hi"에서 "하이하이"로 변경되면서, 같은곳을 지칭하고 있는 s03과 변경할 의사가 없는 s04또한 변경될 위험성이 있음
		// 그렇게 때문에 아예 "하이하이"라는 새로운 주소값을 창조해버림
		// -> 이로 인해 s04의 hi와 주소값이 달라지게 됨
		
	}

}
