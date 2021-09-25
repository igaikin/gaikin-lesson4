package com.belhard.strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task6 {

	public static void main(String[] args) {

		String str = args[0];
		int count = 0;

		Pattern pattern = Pattern.compile("(\\s)\\1+");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			String max = matcher.group();

			if (max.length() > count) {
				count = max.length();

			}

		}
		System.out.println("Max count spaces everyone in text = " + count);
	}

}
