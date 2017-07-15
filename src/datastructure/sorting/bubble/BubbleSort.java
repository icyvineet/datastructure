package datastructure.sorting.bubble;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		Integer[] inputArray = {1,2,3,4,4,532,23,4,13,5};
		
		System.out.println(Arrays.asList(inputArray));
		
		for(int i = 0; i< inputArray.length-1;i++){
			for(int j = 0; j< inputArray.length -1;j++){
				if(inputArray[j] <= inputArray[j+1]){
					continue;
				}else{
					int tmp = inputArray[j];
					inputArray[j] = inputArray[j+1];
					inputArray[j+1] = tmp;
				}
			}
		}
		System.out.println(Arrays.asList(inputArray));
		
	}

}
