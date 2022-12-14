package com.ibn;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctElements {

	public static <T> Object[] mergeArray(T[] arr1, T[] arr2, T[] arr3) {
		return Stream.of(arr1, arr2, arr3).flatMap(Stream::of).toArray();
	}

	public static void main(String[] args) {

		Integer[] firstArray = new Integer[] { 13, 13, 12, 11, 6, 9, 3 };
		Integer[] secondArray = new Integer[] { 78, 34, 56, 67, 2, 11, 7 };
		Integer[] thirdArray = new Integer[] { 78, 34, 56, 67, 2, 11, 100 };
		
		Object[] mergedArray = mergeArray(firstArray, secondArray, thirdArray);

		//ArrayList<Integer> integerArray = new ArrayList<Integer>();
		
		SortedSet<Integer> sortedUniqueElements = new TreeSet<Integer>();

		for (int i = 0; i < mergedArray.length; i++) {
			//integerArray.add((Integer) mergedArray[i]);
			sortedUniqueElements.add((Integer) mergedArray[i]);
		}
		//Collections.sort(integerArray);
		//List<Integer> listWithoutDuplicates = integerArray.stream().distinct().collect(Collectors.toList());
		//System.out.println(listWithoutDuplicates);
		
		System.out.println(sortedUniqueElements);

	}

}