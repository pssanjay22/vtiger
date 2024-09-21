package com.crm.vtiger.genriclibrary;

import java.io.FileInputStream;
import java.util.Properties;

public class FileLib implements IConstantLib {

	public String getProperyValue(String key) throws Throwable {
		
		FileInputStream fis = new FileInputStream(PROPERTYFILE);
		Properties p = new Properties();
		p.load(fis);
		String value = p.getProperty(key);
		return value;
	}
}
