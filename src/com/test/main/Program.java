package com.test.main;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class Program {

	public static void main(String[] args) {
			/*List <Integer> testArray = new ArrayList<Integer>();
			testArray.add(7);
			testArray.add(5);
			testArray.add(2);
			testArray.add(7);
			testArray.add(8);
			testArray.add(-2);
			testArray.add(25);
			testArray.add(25);
			
			meanderingArray(testArray);
				
			List <Employee> testEmpArray = new ArrayList<Employee>();
			testEmpArray.add(new Employee(1, "ABS", 70));
			testEmpArray.add(new Employee(2, "ABS", 65));
			testEmpArray.add(new Employee(3, "ABS", 45))
			testEmpArray.add(new Employee(1, "ABS", 55));
			Collections.sort(testEmpArray);
			System.out.println(testEmpArray);
			if(testEmpArray.contains(new Employee(1, "fs", 65))) {
				System.out.println("hi");
			}
			else{
				System.out.println("hello");
			}

		}*/
		MyCallable task2 = new MyCallable(500000000L);
		ExecutorService executorService = Executors.newSingleThreadExecutor();
		Future<Long> future2 = executorService.submit(task2);
		System.out.println("Submitted");
		while(!future2.isDone()){
			
		}
		try {
			System.out.println(future2.get());
		} catch (InterruptedException | ExecutionException e) {
			e.printStackTrace();
		} 
		System.out.println("Done");
	}

}
 class MyCallable implements Callable<Long> {

	private Long number;
	
	public MyCallable(Long number) {
		this.number= number;
	}
	
	@Override
	public Long call() throws Exception {
		Long sum = (long) 0;
		for (int i = 1; i <=number; i++) {
			sum = sum+i;
		}
		return sum;
	}


}
