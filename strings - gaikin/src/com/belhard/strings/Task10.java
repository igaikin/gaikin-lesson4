package com.belhard.strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task10 {

	public static void main(String[] args) {
		String str = args[0];

		str = str.replaceAll(("\\W"), " ").toLowerCase().replaceAll(("\\s+"), " ");

		String[] arList = str.split(" ");
		List<String> allWords = new ArrayList<>();
		int a = 0;
		for (int i = 1; i < arList.length; i++) {
			if (arList[i].length() > a) {
				a = arList[i].length();
			}

		}
		System.out.println("Max lenght of word: " + a);
		for (int i = 0; i < arList.length; i++) {
			if (arList[i].length() == a) {
				allWords.add(arList[i]);
			}
		}
		Collections.sort(allWords);
		System.out.println(allWords.get(0));
	}
}