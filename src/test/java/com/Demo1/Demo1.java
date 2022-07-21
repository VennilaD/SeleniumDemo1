package com.Demo1;

import com.JavaBasic.FirstProgram;

public class Demo1 {
	
	int a=5;
	float x=40.50f;
	float y=66.55f;
	double b=55;
	double c=88;
	
	public static int add(int e,int f) {
		return e+f;
	}
		
		public int sub(int g,int h) {
			return g-h;
		}

	public static void main(String[] args) {
		System.out.println("This is my first Program");
		Demo1 obj=new Demo1();
		System.out.println("value of b is " +obj.b);
		System.out.println("added value is " +add(5,8));
		System.out.println("subtracted value is " +obj.sub(8, 2));
		
	}

	}

