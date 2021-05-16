package Arrays;

import java.util.Arrays;

public class ArrayDemo {
	public static void main(String[] args) {
		String[] stArray = new String[5];

		// [Ljava.lang.String;@36aa7bc2
		System.out.println(stArray);

		// [Ljava.lang.String;@36aa7bc2
		System.out.println(stArray.toString());

		// [null, null, null, null, null]
		System.out.println(Arrays.deepToString(stArray));

		stArray[0] = "random0";
		stArray[1] = "random1";
		stArray[2] = "random2";
		stArray[3] = "random3";
		stArray[4] = "random4";

		// [random0, random1, random2, random3, random4]
		System.out.println(Arrays.deepToString(stArray));

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 10
		// out of bounds for length 5
		// at Arrays.ArrayDemo.main(ArrayDemo.java:27)
		// stArray[10] = "random10";

		int[] intArray = { 1, 2, 3 };
		// [1, 2, 3]
		System.out.println(Arrays.toString(intArray));

		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 4
		// out of bounds for length 3
		// at Arrays.ArrayDemo.main(ArrayDemo.java:36)
		// intArray[4] = 11;

		// Not possible since arrays are immutable
		// intArray.add(22);
	}
}
