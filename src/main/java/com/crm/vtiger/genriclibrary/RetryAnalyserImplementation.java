package com.crm.vtiger.genriclibrary;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyserImplementation implements IRetryAnalyzer{

	int count = 0;
	int retry = 3;
	@Override
	public boolean retry(ITestResult result) {
		
		while(count<retry)
		{
			count++;
			return true;
		}
		return false;
	}


}
