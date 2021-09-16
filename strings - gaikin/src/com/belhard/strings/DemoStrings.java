package com.belhard.strings;

public class DemoStrings {
	public static void main(String[] args) {
		String strings[] = { "myTimeIsANow", "It don't matter if you're black or white. Black hole in the universe",
				"slgeoi7ow3y498uqc dpoDof35eowfw",
				"Henessy - 350, Martel - 320, Heart of Aragvi - 240, Bacardi - 180, Martini - 150",
				"For       example, Felix     the Cat was created           by Otto    Messmer in 1919,    and he’s      still  with us, more than a hundred years later",
				"Learning English is used nowadays by some TV and radio stations aimed at foreign audience",
				"backColor", "pinkFlamingo", "ironMan" };
		Task1.main(new String[] { strings[0] });
		Task1.main(new String[] { strings[6] });
		Task1.main(new String[] { strings[7] });
		Task1.main(new String[] { strings[8] });
		Task2.main(new String[] { strings[1] });
		Task3.main(new String[] { strings[2] });
		Task4.main(new String[] { strings[3] });
		Task5.main(new String[] { strings[4] });
//		Task6.main(new String[] { strings[4] });
		Task7.main(new String[] { strings[5] });
		Task9.main(new String[] { strings[2] });
	}
}