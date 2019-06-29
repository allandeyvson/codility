package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class Challenge2Test {

	
	@Test
	public void searchSaddlePointTest() {
		Challenge2 c2 = new Challenge2();
		
		int [][] A = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] AA = {{9,1,2},  {8,5,7},  {3,4,6}};
		int [][] AAA = {{8,1,9},  {7,2,6}, {3,4,5}};
		
		//int [][] AAAA = {{0,1,9,3},  {7,5,8,3}, {9,2,9,4}, {4,6,7,1}};
		
		Assert.assertEquals(1, c2.searchSaddlePoint(A));
		Assert.assertEquals(1, c2.searchSaddlePoint(AA));
		Assert.assertEquals(0, c2.searchSaddlePoint(AAA));
		//Assert.assertEquals(2, c2.searchSaddlePoint(AAAA));
	}
}
