package com.ritchie.sort;

import com.ritchie.sort.function.Sort;
import com.ritchie.sort.utils.SortUtils;

/**
 * 冒泡排序
 * 
 * 	何为冒泡？
 *  	1. 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
 *		2. 对每一对相邻元素作同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
 *		3. 针对所有的元素重复以上的步骤，除了最后一个。
 *		4. 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
 *	
 * @author yanziqi
 *
 */
public class BubbleSort {

	/**
	 * 冒泡排序
	 */
	public static String sort(Integer[] datas) {
		Sort sort = (Integer[] ds) -> {
			int count = 0;
			for (int i = 0; i < ds.length; i++) {// 该循环表示排序过几次
				for (int j = ds.length - 1; j > i; j--) {
					if (ds[j] < ds[j - 1]) {
						SortUtils.swap(ds, j, j - 1);
					}
				}
				count = i;
			}

			String str = "共进行了" + count + "次排序； 排序结果：";
			for (Integer integer : ds) {
				str += String.valueOf(integer) + " ";
			}
			return str;
		};

		return sort.sort(datas);

	}
}
