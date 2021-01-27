package edu.handong.csee.sight.java.lab2;

public class Container {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = {1,8,6,2,5,4,8,3,7};
		int result;
		Container container = new Container();
		result = container.maxArea(height);
		System.out.println(result);
	}
	
	
	public int maxArea(int[] height) {
		int row1 =0;
		int position1;
		int end = height.length;
		int area =0;
		int max =0;
		position1 = findMaxHeight(height);
		//System.out.println(height[position1]);
		for(int i=end-1;i>=0;i--) {
			
			area = height[i] * (Math.abs(i-position1));
			//System.out.println(area);
			if(area>max)
				max = area;
		}
        return max;
    }
  
    public int findMaxHeight(int[] height){
    	int max = 0;
    	int position = 0;
        for(int i=0;i<height.length;i++){
        	if(height[i]!=max && height[i] >max) {
        		max = height[i];
        		position = i;
        	}
        }
        return position;
    }
}
