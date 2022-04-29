package com.javaex.ex02;

public class PointApp {

	public static void main(String[] args) {
		
		Point p00 = new Point(3, 5);
		Point p01 = new Point(3, 5);
		Point p02 = new Point(14, 15);
		Point p03 = p02;	// p03의 주소값을 p02로 설정
		
		
		// 지금까지의 상식으로는 메소드를 호출할 수 없어야 하지만
		// object는 모든 클래스의 부모이기 때문에 기본적으로 받고 상속시작하여 가능함
		System.out.println(p01.getX());
		System.out.println(p01.getClass());	// 클래스 정보보기
		System.out.println(p01.equals(p01));
		
		System.out.println(p01.toString());	// 인스턴스 정보 보기 -> Point의 toString() 재정의 전/후 비교 필요
		// Point에 toString이 설정되어 있지 않을 경우의 출력 -> com.javaex.ex02.Point@15db9742
		// 사용자가 Point 클래스에서 toString을 '재정의' 할 경우 원하는 형태로 출력 가능 (위의 형태로 안쓰겠다는 뜻)
		// cf)override가 아님
		
		// 메모리 주소값에 대응되는 중복되지 않은 숫자
		System.out.println(p01.hashCode());
		System.out.println(p02.hashCode());
		
		System.out.println(p01.equals(p02));
		System.out.println(p02.equals(p01)); // 보이기엔 같은 equals이지만 p01과 p02가 다른 방향으로 적용된 것임
		
		System.out.println(p02.equals(p03));
		System.out.println(p03.equals(p02));
		
		System.out.println(p00.equals(p01)); // 분명 p00과 p01의 point x & y의 값은 동일함
		System.out.println(p01.equals(p00)); // 그러나 p00과 p01의 메모리 주소값은 다르기 때문에 이를 판정하여 false로 출력하는 결과를 낳게 됨
		// p00과 p01을 같다고 판정을 유도하기 위해서는 equals를 판정하는 기준을 재정의할 필요가 있음
		
		
		// 중요 : equals와 == 의 차이점
		// == : 실제 변수의 값을 ㄹㅇ 비교하는 인자
		// 기본자료형 -> 실제 값이 같은지를 물어봄
		// 그 외 나머지 자료형의 경우는 주소값이 같은지를 물어봄
		// 단, equals는 코드로 작동하는 비교군이기 때문에 메소드 주작을 통해 조건설정이 가능하지만 == 은 얄짤없는 단순무식 ㄹㅇ 비교임
		
		System.out.println(p00 == p01);
		
		
		
		
		
		
		
		
	}

}
