package poo2024;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=0;
		Scanner input=new Scanner(System.in);
		n=input.nextInt();
		tabuada(n);
	}

	public static void tabuada(int n) {
		for (int i=1;i<=10;i++) {
			System.out.println(n+"x"+i+"="+n*i);
		}
		
	}
}
