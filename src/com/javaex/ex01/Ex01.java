package com.javaex.ex01;

public class Ex01 {

	public static void main(String[] args) {
		
		Object obj = new Object();	// object : extend 없이도 상속되는 모든 클래스의 최상위 조상 클래스
		Object obj2 = new Object();
		
		System.out.println(obj.getClass());	// getClass(); 현재 class 정보
		System.out.println(obj.hashCode()); // hashCode(); (일단 주소값으로 알고 있을 것)
		System.out.println(obj.toString()); // toStirng(); 객체의 값 정보
		System.out.println(obj.equals(obj));// equals() ; 같은값을 가졌는지의 여부 -> T/F boolean
		System.out.println("==============================");
		
		System.out.println("obj.getClass()");
		System.out.println(obj.getClass());
		
		System.out.println("==============================");
		System.out.println("obj.hashCode()");	// hashCode : 0x777과 같은 고유 메모리주소를 알려주는 것이 아닌 java 자체 기준에 따라 만들어진 대응 주소값
		System.out.println(obj.hashCode());		// 실제 주소는 아닌것이, hashCode는 사용자 측에서 변경이 가능함 (다른 목적을 가지고 사용할 수 있음)
		System.out.println(obj2.hashCode());
		System.out.println("==============================");
		
		System.out.println("obj.toString()");
		System.out.println(obj.toString());
		System.out.println("==============================");
		
		System.out.println("obj.equals()");		// 비교대상이 될 파라미터가 반드시 수반되어야 함
		System.out.println(obj.equals(obj));
		System.out.println(obj.equals(obj2));
		
		
		
		
		
	}

}
