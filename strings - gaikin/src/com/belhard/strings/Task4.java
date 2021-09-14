package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

	public static void main(String[] args) {
		String str = args[0];
		Pattern pattern = Pattern.compile("(\\d+)");
		Matcher matcher = pattern.matcher(str);
		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println("Number of numbers in this string: " + count);
	}
}
