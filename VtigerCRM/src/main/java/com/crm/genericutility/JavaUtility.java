package com.crm.genericutility;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
		
		/**
		 *This method is used to capture current system data and time
		 *@return String
		 */
		
		public String getSystemTime() {
			
			return LocalDateTime.now().toString().replace(":", "-");
					
		}
		/**
		 * This method is used to generate random number within 1000
		 * @return int
		 */
		public  int getRandomNumber() {
			
			Random ran=new Random();
			return ran.nextInt(1000);
			
			
			
		}
}
