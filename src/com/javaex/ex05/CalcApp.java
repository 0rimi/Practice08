package com.javaex.ex05;

import java.util.Scanner;

public class CalcApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
    	while(true) {
    		System.out.print(">> ");
    		String calc = sc.nextLine();
    		
    		if(calc.equals("/q")) {
    			System.out.println("종료합니다");
    			break;
    		}
    		
    		String data[] = calc.split(" ");
    		int a = Integer.parseInt(data[0]);
    		int b = Integer.parseInt(data[2]);
    		String sign = data[1];
    		
    		if(sign.equals("+")) {
    			Add add = new Add();
    			add.setValue(a, b);
    			int result = add.calculate();
    			System.out.println(">> " + result);
    		}
    		else if(sign.equals("-")) {
    			Sub sub = new Sub();
    			sub.setValue(a, b);
    			int result = sub.calculate();
    			System.out.println(">> " + result);
    		}
    		else if(sign.equals("*")) {
    			Mul mul = new Mul();
    			mul.setValue(a, b);
    			int result = mul.calculate();
    			System.out.println(">> " + result);
    		}
    		else if(sign.equals("/")) {
    			Div div = new Div();
    			div.setValue(a, b);
    			int result = div.calculate();
    			System.out.println(">> " + result);
    		}
    		else {
    			System.out.println("알수없는 연산입니다.");
    		}


    		
    		
    	}
    	
    	
    	
    	
    	sc.close();

    }
}
