package kr.or.ddit.study02.sec03;

public class TypeChange2 {
	public static void main(String[] args) {
		String s1 = "10";
		int i = Integer.valueOf(s1);

		/*
		 * byte -> Byte 
		 * short -> Short 
		 * int -> Integer ** 
		 * long -> Long
		 * 
		 * float -> Float 
		 * double -> Double
		 * 
		 * boolean -> Boolean
		 * 
		 */

		int i1 = Integer.valueOf(s1);
		int i2 = Integer.parseInt(s1);
		System.out.println(i1 + ", " + i2);

		// String -> byte
		String s2 = "10";
		byte b2 = Byte.parseByte(s2);
		System.out.println("String -> byte: " + s2 + ", " + b2);
		// String -> short
		String s3 = "10";
		short sh3 = Short.parseShort(s3);
		System.out.println("String -> short: " + s3 + ", " + sh3);
		// String -> long
		String s4 = "10";
		long l4 = Long.parseLong(s4);
		System.out.println("String -> long: " + s4 + ", " + l4);
		// String -> float
		String s5 = "10.5";
		float f5 = Float.parseFloat(s5);
		System.out.println("String -> float: " + s5 + ", " + f5);
		// String -> double
		String s6 = "10";
		double d6 = Double.parseDouble(s6);
		System.out.println("String -> double: " + s6 + ", " + d6);

		
	}
}
