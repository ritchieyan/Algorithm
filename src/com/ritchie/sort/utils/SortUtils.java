package com.ritchie.sort.utils;

public class SortUtils {

	/**
	 * 元素对调 --- 接口默认方法
	 * @param datas
	 * @param s 源数据索引值
	 * @param t 目标数据索引值
	 */
	public static void swap(Integer[] datas, Integer s, Integer t) {
		Integer temp = datas[s];
		datas[s] = datas[t];
		datas[t] = temp;
	}

}
