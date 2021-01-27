package edu.handong.csee.sight.java.lab2;
import java.util.Arrays;

public class FindMedian {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindMedian findmedian = new FindMedian();
		findmedian.run();
	}
	
	public void run() {
		int[] merge = new int[10];
		//findMedianSortedArrays(nums1, nums2);
		
	}
	
	/*public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] mergearr = new int[nums1.length + nums2.length];
        float median =0;
        //System.arraycopy(nums1, 0, mergearr, 0, nums1);  
       // System.arraycopy(nums2, 0, mergearr, nums1, nums2);
        
        int num = mergearr.length;
        if(num%2==0){ // 짝수
            median = (mergearr[num/2] + mergearr[num/2+1])/2;
        }
        else{
            median = mergearr[num/2];
        }
    }*/
}
