package com.belhard.strings;

public class Task5 {

	public static void main(String[] args) {

		String str = args[0];
		System.out.println(str.replaceAll("\\s+", " "));
	}
}
