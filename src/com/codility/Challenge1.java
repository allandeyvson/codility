package com.codility;


/**
 * Task 1
 * @author allan
 *
 */
public class Challenge1 {
	
	
	public int solution(String S, String T) {
		
		String startString = S.replace(":", "");
		String endString = T.replace(":", "");		
		
		int count = 0;
		
		if (countcharacters(startString) < 3)
			count++;
		
		
		while (!startString.equals(endString)) {
			startString  = increment(startString);
			
			if (countcharacters(startString) < 3)
				count++;
		}
		
		return count;
    }
	
	
	
	protected String increment(String s) {		
		char[] characters = s.toCharArray();
		
		if (characters[2] == '5' && characters[3] == '9' && characters[4] == '5' && characters[5] == '9') {
			characters[2] = '0';
			characters[3] = '0';
			characters[4] = '0';
			characters[5] = '0';
			
			String h = Integer.toString((Integer.valueOf((characters[0] + "" + characters[1])) + 1));
			
			characters[0] =  h.charAt(0);
			characters[1] = h.charAt(1);
			
		} else if (characters[4] == '5' && characters[5] == '9') {
			characters[4] = '0';
			characters[5] = '0';
			
			String h = Integer.toString((Integer.valueOf((characters[2] + "" + characters[3])) + 1));
			
			characters[2] =  h.charAt(0);
			characters[3] = h.charAt(1);
		} else {
			String h = Integer.toString((Integer.valueOf((characters[4] + "" + characters[5])) + 1));
			
			if(h.length() < 2) {
				characters[4] = '0';
			}  else {
				characters[4] = h.charAt(0);
				characters[5] = h.charAt(1);
			}		
		}
			
			
		return String.valueOf(characters);
	}
	
	
	protected int countcharacters(String s) {
		String count = "";
		for (int i = 0; i < s.length(); i++) {
	         if(count.indexOf(s.charAt(i)) == -1 ){
	             count = count + s.charAt(i);
	         }
	      }
		
		return count.length();
	}
	
}
