package javaalgorithms;

import java.util.Scanner;
import java.util.Stack;

public class LargestRectangle {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int noOfBuildings = scanner.nextInt();
		
		int[] buildingHeights = new int[noOfBuildings];

		for(int i=0; i<noOfBuildings; i++){
			buildingHeights[i] = scanner.nextInt();
		}
		
		//Now we have the heights of the building at this stage
		
		int largestRectangle = calculateLargestRectangle(buildingHeights);
		System.out.println(largestRectangle);
		
	}

	private static int calculateLargestRectangle(int[] buildingHeights) {
		
		int largestRectangle = 0;
		
		Stack<Integer> buildingIndexStack = new Stack<Integer>();
		
		int i;
		
		for(i=0;i<buildingHeights.length;){
			//If the stack is empty, then push the index of the building onto the stack
			if(buildingIndexStack.isEmpty()){
				buildingIndexStack.push(i);
				i++;
			}else{
				//If the current building's height is greater than previous building then push its inde on the stack
				if(buildingHeights[i] >= buildingHeights[buildingIndexStack.peek()]){
					buildingIndexStack.push(i);
					i++;
				}
				//If not then pop the index one by one till the height is equal to or greater than current building
				//and calculate the largest rectangle
				else{
					//If the current height is greater than the height of the top building, then leave the top building index on the stack
					while(!buildingIndexStack.isEmpty() && (buildingHeights[buildingIndexStack.peek()] > buildingHeights[i])){
						//If the top building in the stack is greater than current height, then pop it out and calculate the area 
						int top = buildingIndexStack.pop();
						int area = 0;
						if(!buildingIndexStack.isEmpty()){
							area = (i-buildingIndexStack.peek() -1)* buildingHeights[top];
						}else{
							area = i*buildingHeights[top]; 
						}
						//If the area is greater than the largest then set the area as the largest
						if(area > largestRectangle){
							largestRectangle = area;
						}
						
					}
					
				}
			}
		}
		
		//If we have reached the end, check if there are building indexes in the stack
		while(!buildingIndexStack.isEmpty()){
			int top = buildingIndexStack.pop();
			int area = 0;
			if(!buildingIndexStack.isEmpty()){
				area = (i-buildingIndexStack.peek() -1)* buildingHeights[top];
			}else{
				area = i*buildingHeights[top]; 
			}
			
			if(area > largestRectangle){
				largestRectangle = area;
			}
		}
		
		return largestRectangle;
	}

}
