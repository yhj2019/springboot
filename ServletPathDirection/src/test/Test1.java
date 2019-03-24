package test;

import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		int[] number = new int[10];
		for(int i=0;i<10;i++) {
			int d = (int)(Math.random()*100);
			number[i] = d;
		}
		paixu(number);
		System.out.println(Arrays.toString(number));
	}
	public static void paixu(int [] number) {
		for(int i = 0;i<number.length-1 ;i++) {
			int m = i;
			for(int j =i+1;j<number.length;j++) {
				if(number[j]<number[m]) {
					m = j;
				}
			}
			if(m!=i) {
				int  t = number[m];
				number[m] = number[i];
				number[i] = t;
			}
		}
		System.out.println(Arrays.toString(number));
	}

}
