package com.salesforce.jbactivity.service;

/**
 *
 * @author sprathivadi
 */
public interface JBLogFileWriterService {
    
    void writeToLog(String message);
    
    String retrieveLog();

}
