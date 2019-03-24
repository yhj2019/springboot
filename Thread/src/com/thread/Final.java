package com.thread;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashSet;

class A{
    public void add(int a,int b){
        System.out.print(a+b);
    }

    public void toUpper(String a){
        System.out.print(a.toUpperCase());
    }
}

public class Final {
	public static void main(String[] args) {
		char a = 20013;
		System.out.println(a);
	}
}