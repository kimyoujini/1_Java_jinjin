package edu.kh.control.loop.practice;

import java.util.Scanner;

public class LoopPractice {


	public void practice1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		if( i <=1 ) { 
			System.out.println(" 1 이상의 숫자를 입력해주세요.");
		}else {
			for(int x = 1 ; x = i; x++) {
				System.out.print(x + " ");
			}
			
			System.out.println();
		}
	}
	
	public void practice2() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1이상의 숫자를 입력하세요 : ");
		int input = sc.nextInt();
		
		
		
		
		
		
		
	}
	
	
	
	
	
	public void practice3() {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 하나 입력하세요. : ");
		int num1 = sc.nextInt();
		
		int sum = 0;
		
		for(int i = num1; i <= 1; i++) {
			sum += i; 
		}

		System.out.printf("%d부터 %d까지의 합 : %d \n", num1, sum);

	}
	
	public void practice4() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자 : ");
		 int inum1 = sc.nextInt();
		 
		System.out.print("두 번째 숫자 : ");
		 int inum2 = sc.nextInt();
		 
		 
		
		
	}
	
	public void practice5() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=======" + dan + "단 " + "======");
		
		for(int i = 1 ; i <=9 ; i++) {
			System.out.printf("%d X %d = %d \n" , dan,i, dan * i);
		}

	}
	
	public void practice6() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int dan = sc.nextInt();
		
		System.out.println("=======" + dan + "단 " + "======");
		
	
		
	}
	
	public void practice7() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x = input ; x >= 1 ; x--) {
			
			for(int i = x  ; i >= 1 ; i--) {
				System.out.print(i);
			}
		       System.out.println();	
		}	
	}
	
	public void practice8() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int x= input ; x >=1 ; x --) {
	         
        	for(int i = x; i >=1; i--) {
        		System.out.print(i);		
        }

		       System.out.println();	
		}	
		
	}
	
	public void practice9() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=4; row--) {
			
			for(int col=4; col<=row; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	public void practice10() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
		for(int row=1; row<=3; row++) {
			
			for(int col=4; col<=row; col++) {
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	
	
	
	
	
	
	public void practice11() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
	}
	
	

	public void practice12() {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int input = sc.nextInt();
		
	}
	
	
	
	public void practice13() {

		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("자연수 하나를 입력하세요" : ");
		int input = sc.nextInt();
		
		
		if(i % 3 == 0 i % 2 == 0) {
			System.out.print(i + " ");
			count++;
			
		}
	}	
}
