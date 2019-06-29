package com.codility;

import org.junit.Assert;
import org.junit.Test;

public class Challenge1Test {

	
	@Test
	public void countcharactersTest() {
		Challenge1 c1 = new Challenge1();
		
		Assert.assertEquals(2, c1.countcharacters("222221"));
	}
	
	@Test
	public void incrementTest() {
		Challenge1 c1 = new Challenge1();
		
		Assert.assertEquals("222222", c1.increment("222221"));
	}
	
	@Test
	public void solutionTest() {
		Challenge1  c1 =  new Challenge1();
		
		Assert.assertEquals(1, c1.solution("15:15:00", "15:15:12"));		
		Assert.assertEquals(9, c1.solution("22:22:21", "22:22:29"));
	}
}
