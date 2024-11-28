package com.crm.genericutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Fileutility {
	/**
	 * This method is uuse top read data from properties file
	 * this method takes key
	 * @param key
	 * @return
	 * @throws IOException
	 */
	
	
	
	public String getDataFromProperties(String key) throws IOException {
		FileInputStream fis=new FileInputStream("./src/test/resources/TestData/commandata.properties");
		Properties prop=new Properties();
		prop.load(fis);
		return prop.getProperty(key);
	}
}
