package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요");
		String friendsinfo = sc.nextLine();
	
		Friend[] fArray = new Friend[3];

		String finfo[] = friendsinfo.split(" ");
		for(int i=0; i<3; i++) {
			fArray[i] = new Friend();
			
			for(int j=0; j<9; j++) {
				if(j==0||j%3==0) {
					fArray[i].setName(finfo[j]);
				}
				else if(j==1||j%3==1) {
					fArray[i].setPh(finfo[j]);
				}
				else if(j==2||j%3==2){
					fArray[i].setSchool(finfo[j]);
				}
			}
			
		}
		
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showinfo();
		}
		
		
//		하나만 출력해보는 경우 		
//		String finfo[] = friendsinfo.split(" ");
//
//		for(int i=0; i<9; i++) {
//			System.out.println(finfo[i]); 
//		}
//		
//		
//		fArray[0] = new Friend(finfo[0],finfo[1],finfo[2]);
//		fArray[0].showinfo();
		


		sc.close();

	}

}
