package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {

	public static void main(String[] args) {
		String str = args[0];
		Pattern pattern = Pattern.compile("[A-Z]");
		Matcher matcher = pattern.matcher(str);

		int count = 0;
		while (matcher.find()) {
			count++;
		}
		System.out.println("Number of lowercase letters:: " + count);

		Pattern pattern1 = Pattern.compile("[a-z]");
		Matcher matcher1 = pattern1.matcher(str);
		int sum = 0;
		while (matcher1.find()) {
			sum++;
		}
		System.out.println("Number of lowercase letters:: " + sum);
	}
}