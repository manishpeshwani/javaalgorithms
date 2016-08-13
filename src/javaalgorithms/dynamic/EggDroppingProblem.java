package javaalgorithms.dynamic;

public class EggDroppingProblem {

	public static void main(String[] args) {
		int eggs = 2;
		int floors = 100;
		
		int solution[][] = new int[eggs][floors];

		int result = minimumAttempts(eggs, floors, solution);
		System.out.println(result);
		
		for(int i=0; i<eggs; i++){
			for(int j=0; j<floors; j++){
				System.out.print(solution[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
	
	public static int minimumAttempts(int eggs, int floors, int[][] solution){
		
		
		
		if(floors == 0){
            return 1;
        }
		
		if(eggs == 1){
			solution[eggs-1][floors-1] = floors;
            return floors;
        }
		

		if(solution[eggs-1][floors-1] > 0){
			return solution[eggs-1][floors-1];
		}
        
        int min = 1000;
        for(int i=1; i <= floors; i++){
            int val = 1 + Math.max(minimumAttempts(eggs-1, i-1,solution),minimumAttempts(eggs, floors-i,solution));
            if(val < min){
                min = val;
            }
        }
        
		
		solution[eggs-1][floors-1] = min;
		return min;
	}

}
