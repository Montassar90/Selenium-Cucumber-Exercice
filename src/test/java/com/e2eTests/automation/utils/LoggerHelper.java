package com.e2eTests.automation.utils;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class LoggerHelper {
	 public static Logger getLogger(Class<?> className) {
	        return LogManager.getLogger(className);
	    }
}