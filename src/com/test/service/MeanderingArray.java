package com.test.service;

import java.util.ArrayList;
import java.util.List;

public class MeanderingArray {

	public static List<Integer> meanderingArray(List<Integer> unsorted) {
			List <Integer> outputArray = new ArrayList <Integer> ();
	        boolean findLargest = true;
	        
	        for(int i=0;i<unsorted.size();i++){
	            Integer finalNumber =unsorted.get(0);
	            int index=0;
	            if(findLargest){
	                for (int k=0;k<unsorted.size();k++) {
	                    if(unsorted.get(k)>finalNumber){
	                      finalNumber=unsorted.get(k);  
	                      index=k;
	                    }
	                }
	            }else{
	                for (int k=0;k<unsorted.size();k++) {
	                    if(unsorted.get(k)<finalNumber){
	                      finalNumber=unsorted.get(k); 
	                      index=k; 
	                    }
	                }
	            }
	            outputArray.add(finalNumber);
	            unsorted.remove(index);
	            finalNumber=0;
	            index=0;
	            findLargest=!findLargest;
	        }
	        System.out.println(outputArray);
	        return outputArray;
	    }
}
