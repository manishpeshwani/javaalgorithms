package javaalgorithms.misc;


/*
 * If there are 100 bulbs in a room and are all off to begin with.
 * If now 100 men enter the room one by one and each man has a no. from 1 to 100 on them
 * and if they are allowed to toggle the switch for switch no that is divisible by their number, then
 * how many bulbs will be on towards the end when all men have gone through the exericse once.
 */
public class BulbSwitchingProblem {

	public static void main(String[] args) {
		//Only the numbers which are squares of another number will be on at the end
		//This is because their factors are odd number i.e for 4, factors are 1, 2 and 4 
		//For all other numbers the factors are even eg. for 5 it is  1 and 5 so it will be switched on
		//by 1 person and switched off again by 5th person.
		
		int n = 100;
		int count =0;
		
		while(count*count <= n){
			count++;
		}
		

		System.out.println(count-1);
	}

}
