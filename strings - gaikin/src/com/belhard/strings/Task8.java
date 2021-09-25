package com.belhard.strings;

public class Task8 {

	public static void main(String args[]) {

		String str = args[0];
		str = str.replaceAll(("\\W"), "");
		String nstr = revStr(str);
		boolean pal = nstr.equalsIgnoreCase(str);
		if (str != null) {
			if (pal) {
				System.out.println("This tex is a pallindrome : " + nstr + " == " + str);
			} else {
				System.out.println("This is not a pallindrom! Try again :)");
			}
		}

	}

	public static String revStr(String revStr) {
		return new StringBuilder(revStr).reverse().toString();
	}
}
