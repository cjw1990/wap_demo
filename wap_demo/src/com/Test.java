package com;

import java.math.BigDecimal;
import java.text.NumberFormat;

public class Test {
	public static void main(String[] args) {
		String ttt = "80.888";
		double   f   =   111231.5; 
		BigDecimal   b   =   new   BigDecimal(f); 
		//保留2位小数
		
		double tt = b.doubleValue() / 100 * 100;
		System.out.println(tt);

	}
}
