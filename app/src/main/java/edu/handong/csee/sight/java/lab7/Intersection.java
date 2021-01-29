package edu.handong.csee.sight.java.lab7;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Intersection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Intersection intersection = new Intersection();
		intersection.run();
	}
	
	public void run() {
		int[] nums1 = {1, 2, 2, 1};
		int[] nums2 = {2, 2};
		int[] result;
		
		result = intersect(nums1, nums2);
		for(int i=0;i<result.length;i++)
			 System.out.println(result[i]);
	}
	
	public int[] intersect(int[] nums1, int[] nums2) {
		//arraylist로 바꾸기 	
		ArrayList<Integer> n1 = new ArrayList<Integer>(nums1.length);
		ArrayList<Integer> n2 = new ArrayList<Integer>(nums2.length);
		ArrayList<Integer> common = new ArrayList<Integer>();
		int[] result;
		for (int i=0; i<nums1.length; i++)
		    n1.add(nums1[i]);
		for(int i=0;i<nums2.length;i++)
			n2.add(nums2[i]);
		
		for (Integer t : n1) {
	        if (n2.contains(t)) {
	            common.add(t);
	        }
	    }
		 result = Util.convertIntegers(common);
		 //for(int i=0;i<result.length;i++)
			 //System.out.println(result[i]);
		return result;
		
		/*List<int[]> list1 = Arrays.asList(nums1);
		List<int[]> list2 = Arrays.asList(nums2);
        Set<int[]> set1 = new HashSet<int[]>(list1);
        Set<int[]> set2 = new HashSet<int[]>(list2);
        set1.retainAll(set2);
        for(int[] i : set1)
        	System.out.println(i);
        //System.out.println();
        Object result1 = set1.toArray();
        //set1.toArray().length;
        /*int[] integerArray = new int[set1.toArray().length];
        for (int i = 0; i < integerArray.length; i++)
            integerArray[i] = (Integer)result1[i];*/
    }
}
