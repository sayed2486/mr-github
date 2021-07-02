package com.ibu.springboot.web.FirstSpringBootApplication.service;

public class JavaTutorial {
	public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];       
        for(int i=0; i<nums.length-1; i++){
        	System.out.println("Loop1 :" + i + " : " + "NA");
            for(int j=i+1; j<nums.length; j++){
            	System.out.println("Loop2 :" + i + " : " + j);
                if((nums[i]+nums[j]) == target){
                    output[0] = i;
                    output[1] = j;
                    System.out.println(output[0] +" : " +output[1]);
                    return output;
                }
            }
        }  
     return output;
    }
	
	public static void main(String args[]) {
		int[] input = {3,2,4};
		JavaTutorial javaTutorial = new JavaTutorial();
		javaTutorial.twoSum(input, 6);
	}

}
