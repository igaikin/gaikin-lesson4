//package com.belhard.strings;
//
//public class Task14 {
//
//	public static void main(String[] args) {
//		String str = args[0];
//		str = str.replaceAll("\\W", "");
//
//		StringBuilder sb = new StringBuilder(str);
//		for (int i = 0; i < str.length(); i++) {
//			for (int j = i + 1; j < str.length(); j++) {
//				if (str.charAt[i] != (str.charAt[j])) {
//					sb.deleteCharAt(j);
//
//				}
//			}
//		}
//		System.out.println(sb);
//
//	}
//}