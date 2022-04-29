package com.javaex.ex03;

public class PointApp {

	public static void main(String[] args) {
		
		Point p01 = new Point(3,5);
		Point p02 = new Point(3,5);
		Point p03 = new Point(2,2);
		Point p04 = p01;
		
		
		System.out.println(p01 == p02);
		System.out.println(p01.equals(p02));
		System.out.println(p01.equals(p03));
		
		System.out.println(p01 == p04);	// 이 경우에는 p01과 p04가 주소값을 일치시켰기 때문에 ==도 true로 나옴
		System.out.println(p01.equals(p04)); // equals를 해도 본인이 본인 비교하는 꼴
		System.out.println(p04.equals(p01));
		
	}

}
