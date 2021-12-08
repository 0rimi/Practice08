package com.javaex.ex08;

import java.util.Scanner;

public class FriendApp {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("친구를 3명 등록해주세요");
		
		//받고, 공백나누고, 셋값넣고, 배열에 넣어주기. X3
		
		Friend[] fArray = new Friend[3];
		
		
		//1
		String friendsinfo1 = sc.nextLine();
		String finfo[] = friendsinfo1.split(" ");
		fArray[0] = new Friend(finfo[0],finfo[1],finfo[2]);
			
		//2
		String friendsinfo2 = sc.nextLine();
		String finfo2[] = friendsinfo2.split(" ");
		fArray[1] = new Friend(finfo2[0],finfo2[1],finfo2[2]);
			
		//3
			String friendsinfo3 = sc.nextLine();
			String finfo3[] = friendsinfo3.split(" ");
				fArray[2] = new Friend();
				fArray[2].setName(finfo3[0]);
				fArray[2].setPh(finfo3[1]);
				fArray[2].setSchool(finfo3[2]);
		

		//출력
		for(int i=0; i<fArray.length; i++) {
			fArray[i].showinfo();
		}
		
		//한번에 쓰고싶었는데 안되네용 '3'
		/*
		for(int i=0; i<fArray.length; i++) {		
			for(int j=0; j<3; j++) {
				fArray[0] = new Friend();
				if(j==0) {
					fArray[i].setName(finfo[j]);
				}
				else if(j==1) {
					fArray[i].setPh(finfo[j]);
				}
				else if(j==2) {
					fArray[i].setSchool(finfo[j]);
				}
			}
		}
		*/


		sc.close();

	}

}
