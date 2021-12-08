package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//==는 단순 주소값 비교.
		//p4와 p1의 주소값은 같음.
		//Object의 equals사용.
		//equals 조건이 없으므로 x,y값이 같아도 같다고 보지 않음.
				
	}

}


