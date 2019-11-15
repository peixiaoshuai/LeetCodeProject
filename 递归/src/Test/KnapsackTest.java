package Test;

import 背包问题.Knapsack;

public class KnapsackTest {
	public static void main(String[] args) {
		int[] array = {11,9,7,6,5};
		int total = 20;
		Knapsack knapsack = new Knapsack(array);
		
		knapsack.knapsack(total, 0);
		
	}
}
