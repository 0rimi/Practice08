package com.javaex.ex04;

import java.util.Scanner;

public class SumApp {

	public static void main(String[] args) {
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 공백으로 구분해서 입력하세요");
		String numLine = sc.nextLine();
		
		//코드를 작성하세요
		//공백으르 기준으로 자르기
		String num[] = numLine.split(" ");
		
		for(int i=0; i<num.length; i++) {
			sum = sum + Integer.parseInt(num[i]);
		}		
		
		System.out.println("합:" + sum);
		
		sc.close();
	}

}
