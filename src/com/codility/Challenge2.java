package com.codility;

import java.util.ArrayList;
import java.util.List;

public class Challenge2 {

	public int solution(int[][] A) {
		// write your code in Java SE 8
		return searchSaddlePoint(A);
	}

	protected int searchSadlePointLocal(int[][] A) {
		
		return 0;
	}

	protected int searchSaddlePoint(int[][] A) {

		int length = A.length;
		int saddlePoint = -1;
		List<Integer> saddlePoints = new ArrayList<>();

		for (int i = 0; i < length; i++) {

			int rowMin = A[i][0];
			int indexCol = 0;
			saddlePoint = rowMin;

			for (int j = 0; j < length; j++) {
				if (rowMin > A[i][j]) {
					rowMin = A[i][j];
					indexCol = j;
					saddlePoint = rowMin;
				}
			}

			for (int k = 0; k < length; k++) {

				if (rowMin < A[k][indexCol]) {
					saddlePoint = -1;
					break;
				}
			}

			if (saddlePoint == rowMin)
				saddlePoints.add(saddlePoint);
		}

		return saddlePoints.size();
	}
}
