import java.util.Random;

import org.apache.commons.lang3.RandomStringUtils;

public class P12_GenerateRandomNumberAndString {
	
	public static void main(String[] args) {
		
		//Approach 1 - By Using Random class
/*		Random rand = new Random();
		int rand_int=rand.nextInt(100);
		System.out.println(rand_int);
		
		double rand_double=rand.nextDouble();
		System.out.println(rand_double);   
		
		//Approach 2- By using Math Class
		System.out.println(Math.random()); */
		
		//Approach 3- Apache commons lang API
		String randNum=RandomStringUtils.randomNumeric(5);
		System.out.println(randNum);
		
		String randStr=RandomStringUtils.randomAlphabetic(5);
		System.out.println(randStr);
		
	}

}
