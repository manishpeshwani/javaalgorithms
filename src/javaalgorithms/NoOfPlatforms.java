package javaalgorithms;

/**
 * Find the no of platforms required given the arrival time and departure times of trains.
 * 
 * Approach is to sort the arrival times and departure times and then iterating over the arrivals and departures
 * If the arrival time is before the departure time of previous train then increment the no of platforms
 * Else decrement the no of Platforms
 * 
 * @author manishpeshwani
 *
 */
public class NoOfPlatforms {

	public static void main(String[] args) {
		int[] arrivals = {900,905,911,1000,1005,1008,1009};
		int[] departures = {910,912,915,1010,1015,1016,1020};
		
		int noOfPlatforms = 1;
		int result = 1;
		int a = 1;
		int d = 0;
		int n = arrivals.length;
		while(a < n && d < n){
			if(arrivals[a] < departures[d]){
				noOfPlatforms++;
				if(noOfPlatforms > result){
					result = noOfPlatforms;
				}
				a++;
			}else{
				noOfPlatforms--;
				d++;
			}
		}

		System.out.println("No of platforms required :" + result);
	}

}
