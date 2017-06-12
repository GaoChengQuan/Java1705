package com.situ.day23;

import java.util.Arrays;

public class Homework1 {
	public static void main(String[] args) {
		int result = show(2, 4);
		System.out.println(result);

		int[] src = { 1, 2, 3, 4, 5, 6, 7 };
		int[] dest = new int[5];
		System.out.println(Arrays.toString(dest));
		arrayCopy(src, 2, dest, 2, 13);
		System.out.println(Arrays.toString(dest));
	}

	/**
	 * 5，在System类中有静态方法public static void arraycopy( Object src, int srcPos,
	 * Object dest, int destPos, int length):
	 * 可以用于数组src从第srcPos项元素开始的length个元素拷贝到目标数组dest
	 * 从destPos开始的length个元素。请自己实现这个方法。（5分）
	 */
	private static void arrayCopy(int[] src, int srcPos, int[] dest,
			int destPos, int length) {
		if (src == null || dest == null) {
			System.out.println("数组不能为空");
			return;
		}

		if (srcPos < 0 || destPos < 0 || length < 0) {
			System.out.println("角标越界，不能小于0");
			return;
		}

		if (src.length < srcPos + length || dest.length < destPos + length) {
			System.out.println("角标越界，太大了");
			return;
		}

		for (int i = srcPos, j = destPos; i < srcPos + length
				&& j < destPos + length; i++, j++) {
			dest[j] = src[i];
			// System.out.println(src[i]);
		}
	}

	/**
	 * 2，编写一个方法求s=a+aa+aaa+a...a，其中a是一个数，比如a=2； 那么求s=2+22+222+2222...的值。
	 * 该方法需要两个参数，第一个参数控制a，第二个参数控制有多少个数。（5分）
	 */
	private static int show(int num, int count) {
		int sum = 0;
		String temp = "";
		String exp = "";
		for (int i = 1; i <= count; i++) {
			temp += num;
			// System.out.println(temp);
			sum += Integer.parseInt(temp);
			exp += temp;

			if (i == count) {
				exp += " = ";
			} else {
				exp += " + ";
			}
		}
		System.out.println(exp + sum);
		return sum;
	}

	/**
	 * 6，各种类型的几何图形都有自己的面积计算公式，但在一个CAD（计算机辅助设计）软件中， 图形的种类非常多，如果程序需要计算出任何一种图形的面积，
	 * 最简单 的想法是使用条件判断语句根据图形类型来选择相应的计算公式。 然而，这种方法不太好，可能会导致嵌套层次很深的条件判断语句。
	 * 另外，如果软件要扩充功能以 支持新的图形种类，则又不得不修改调用不同公式计算图形面积的代码。
	 * 在学习了面向对象技术之后，你能对上述问题给出一个较好解决方案来吗？ 请以计算圆形、矩形和三角形三种几何图形的面积为例，列出关键代码。（7分）
	 */

}
