package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요");
		String friendsinfo = sc.nextLine();
		//데이터 받고 줄바꿈 단위로 한번자르기
		String fdiv[] = friendsinfo.split("\n");
		
		Friend fri = new Friend();
		
		for(int i=0; i<3; i++) {
			//줄바꿈 단위로 자른 문단내에서 공백단위로 자르기
			String finfo[] = fdiv[i].split(" ");
		
			fri.setName(finfo[0]);
			fri.setPh(finfo[1]);
			fri.setSchool(finfo[2]);
		
			fri.showinfo();	
		}

		sc.close();

	}

}
