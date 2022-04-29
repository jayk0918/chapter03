package com.javaex.ex06;

public class Ex02 {

	public static void main(String[] args) {
		// String의 일반 메소드들
		/*
		
		concat()	-> (String) + (String), 원본을 바꾸지 않음
		
		trim()		-> String 내부에 맨 앞 & 맨 뒤에 존재하는 공백을 모두 제거함, 원본을 바꾸지 않음
						단, 중간에 있는 공백은 데이터라고 판단하여 삭제하지 않음
						
		replace()	-> 교체, 파라미터를 2개 받음 / replace(<찾을 문자열>, <변경하려는 문자열>) / 자리수는 상관없음
		
		split()		-> 분리 / split("문자열")을 기준으로 분리 / 문자열이 여러개 있을 경우 여러개로 나눔(일괄적용) / 배열로 return 됨
						원본을 바꾸지 않음, 배열로 나누어서 구현할 뿐임
						
		substring()	-> 문자 배열의 시작점 설정 및 분리(일부 발췌)
						substring(배열 방번호, 배열 방번호) -> 설정한 첫 번호부터 설정한 마지막번호 -1까지 설정 / 원본을 바꾸지 않음
						기본적으로 int값을 2개 받도록 설계되어 있으나 시작값 1개만 설정할 경우 설정한 번호부터 끝까지 설정함 (method overloading)
						
		charAt()	-> (지정방번호)의 문자열을 char형태로 지정함 / 이때 char형태로 출력하기때문에 String이 아닌 char로 선언해주어야 함		
						
						
		*/
		String a = new String(" abcd");
		String b = new String(",efg ");
		
		
		System.out.println(a.concat(b));
		System.out.println(a+b);	// 둘이 같음
		
		a = a.concat(b);
		System.out.println(a);
		
		a = a.trim();
		System.out.println(a.trim());
		
		a = a.replace("ab", "12");
		System.out.println(a);
		System.out.println("=================");
		
		String[] sArray = a.split(",");
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i]);
		}
		System.out.println(a);
		System.out.println("=================");
		
		String str = "Hello java!";
		String result01 = str.substring(3);
		System.out.println(result01);
		
		String result02 = str.substring(1,4);
		System.out.println(result02);
		
		char result03 = str.charAt(7);
		System.out.println(result03);
		
		
	}

}
