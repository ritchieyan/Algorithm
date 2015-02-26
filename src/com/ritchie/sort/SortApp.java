package com.ritchie.sort;

public class SortApp {

	public static void main(String[] args) {
		// 1. 冒泡法排序
		Integer[] datas = new Integer[] { 12, 1, 45, 23, 34, 67, 2, 5, 4, 7 };
		System.out.println(BubbleSort.sort(datas));
	}
}
