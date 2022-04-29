package com.javaex.ex03;

public class Point {
	
	// 필드
	private int x;
	private int y;
	
	
	// 생성자
	public Point() {
		super();
	}
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	// 메소드 gs
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	// 메소드 일반
	@Override
	public String toString() {
	return "Point [x=" + x + ", y=" + y + "]";
	}
	
	// PointApp에서 Point p01과 p02를 x, y값이 같으면 true가 나오도록 equals를 조정하는 메소드 세팅 과정
	
	public boolean equals(Object obj) {
		// 모든 클래스 부모인 object로 1차적으로 정의한 후 캐스팅으로 Point를 보도록 강제
		// 다만, 이렇게 설정할 경우 뒤이어 나오는 equals에 대한 통제 불가능
		Point p = ((Point)obj);
		if(this.x == p.x && this.y == p.y) {
			// this.x & y = 기준 x,y값 
			// p.x & y = 비교대상의 x, y값
			return true;
		}else {
			return false;
		}
		
		
	}
	
	
	
}
