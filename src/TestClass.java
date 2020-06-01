import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestClass {

	
	public static List<Integer> meanderingArray(List<Integer> unsorted) {
	    // Write your code here
	        List <Integer> copiedArray = new ArrayList <Integer> ();
	        List <Integer> outputArray = new ArrayList <Integer> ();

	        for (Integer copy : unsorted) {
	            copiedArray.add(copy);
	        }
	        boolean findLargest = true;
	        
	        for(int i=0;i<unsorted.size();i++){
	            Integer finalNumber =copiedArray.get(0);
	            int index=0;
	            if(findLargest){
	                for (int k=0;k<copiedArray.size();k++) {
	                    if(copiedArray.get(k)>finalNumber){
	                      finalNumber=copiedArray.get(k);  
	                      index=k;
	                    }
	                }
	            }else{
	                for (int k=0;k<copiedArray.size();k++) {
	                    if(copiedArray.get(k)<finalNumber){
	                      finalNumber=copiedArray.get(k); 
	                      index=k; 
	                    }
	                }
	            }
	            outputArray.add(finalNumber);
	            copiedArray.remove(index);
	            finalNumber=0;
	            index=0;
	            findLargest=!findLargest;
	            System.out.println(copiedArray);
	        }
	        System.out.println(outputArray);
	        return outputArray;
	    }

	}
