package com.belhard.strings;

public class Task1 {

	public static void main(String[] args) {
		String str = args[0];

		str = str.replaceAll("([A-Z])", "_$1").toLowerCase();
		System.out.println(str);
	}
}