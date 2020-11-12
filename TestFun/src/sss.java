import java.util.Arrays;
import java.util.Comparator;
import java.util.function.IntBinaryOperator;

public class sss {

	public static void main(String[] args) {
		String[] arr1 = new String[]{"aa", "aaa", "aa", "a", "aaaaa"};
		// 使用Lambda表达式
		Arrays.parallelSort(arr1,(o1,o2) -> o1.length() - o2.length());
//		// 使用匿名内部类
//		Arrays.parallelSort(arr1, new Comparator<String>() {
//		    @Override
//		    public int compare(String o1, String o2) {
//		        return o1.length() - o2.length();
//		    }
//		});
		System.out.println(Arrays.toString(arr1));
		
		int[] arr2 = new int[]{3, -4, 25, 16, 30, 18};
		int[] arr12 = Arrays.copyOf(arr2, arr2.length);
		
		// left代表数组中前一个索引处的元素，计算第一个元素时，left为1
		Arrays.parallelPrefix(arr2, (left, right)-> left*right);
		System.out.println(Arrays.toString(arr2));
		
		
		// 使用匿名内部类
		Arrays.parallelPrefix(arr12, new IntBinaryOperator() {
		    @Override
		    public int applyAsInt(int left, int right) {
		    	System.out.println("left :" + left);
		    	System.out.println("right :" + right);
		        return  left*right;
		    }
		});
		
		System.out.println(Arrays.toString(arr12));

		
		long[] arr3 = new long[5];
		// operand代表正在计算的元素索引
		Arrays.parallelSetAll(arr3, operand -> operand * 5);
		// 使用匿名内部类
//		Arrays.parallelSetAll(arr3, new IntToLongFunction() {
//		    @Override
//		    public long applyAsLong(int value) {
//		        return value * 5;
//		    }
//		});
		System.out.println(Arrays.toString(arr3));
		
		
	}

}
