package array;
import java.util.*;

class RemoveDuplicate {


	public static void main(String[] args) {
		int[] array = {1,2,3,4,1,2,4};

		int[] result = removeDuplicates(array);

		System.out.println(Arrays.toString(result));
	}

	public static int[] removeDuplicates(int[] array) {
		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}

		int[] result = new int[set.size()];

		int index = 0;
		for (Integer num : set) {
			result[index++] = num;
		}

		return result;
	}
}


