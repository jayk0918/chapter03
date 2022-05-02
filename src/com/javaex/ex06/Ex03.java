package com.javaex.ex06;

public class Ex03 {

	public static void main(String[] args) {
		// Wrapper Class = 기본 데이터형 8개를 객체형식으로 다루기 위한 클래스들의 통칭
		Integer i01 = new Integer(10);
		Integer i02 = new Integer(20);
		Integer iResult = new Integer(3) + new Integer(6);
		System.out.println(i01 + i02);
		System.out.println(iResult);
		
		int no01 = 10;
		int no02 = 20;
		int noResult = no01 + no02;
		System.out.println(noResult);
		
		Short s = new Short((short) 3); // 기본이 int로 인식하기 떄문에 (short)라고 강제형변환 필요
		Byte b = new Byte((byte) 3);
		
		// 반드시 Wrapper Class를 사용해야만 하는 경우도 존재함
		Integer no1 = 3;	// boxing -> 클래스의 형태로 변환시켜주는 작업(new Integer(3)을 생략)
		int r01 = Integer.parseInt("1234"); // no1.parseInt("1234");
		// 문자열 -> 정수로 변환함 (but 어색함/ no1 = 3인데 parseInt에는 1234?)
		// 이에 따라 Integer.parseInt()이 static에 올라가있음 --> 따라서 no1.parseInt로 사용한 것은 잘못 사용하는 것
		
		System.out.println(r01 + 1);
		
		int no2 = no1; // unboxing -> 클래스형태에서 다시 롤백
		
		// 정수 -> 문자열 변환
		String str = "안녕하세요";
		String str01 = String.valueOf(555);
		// str.valueOf(555) 이것 또한 상기된 no1.parseInt와 같은 상황
		// String.valueOf()도 static에 있음
		System.out.println(str01 + 1);
		
		String str02 = "~~~" + 555; // 사용빈도는 이런 표기법이 많음 (문자열 + 정수)
		
		
	}

}
