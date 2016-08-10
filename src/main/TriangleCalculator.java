package main;

public class TriangleCalculator {
	
	public int findMaxTotal(int[][] triangle) {
		if(!valid(triangle)) {
			throw new IllegalArgumentException("Not a triangle!");
		}
		
		for(int row = triangle.length-2; row >= 0; row--) {
			for(int col = 0; col <= row; col++) {
				int left = triangle[row][col] + triangle[row+1][col];
				int right = triangle[row][col] + triangle[row+1][col+1];
				triangle[row][col] = Math.max(left, right);
			}
		}
		
		return triangle[0][0];
	}

	private boolean valid(int[][] triangle) {
		boolean valid = true;
		for(int row = 0; row < triangle.length; row++) {
			if(triangle[row].length != row + 1)
				valid = false;
		}
		return valid;
	}
}
