package com.salesforce.jbactivity.service;

import com.salesforce.jbactivity.domain.JBActivityConstants;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import org.joda.time.DateTime;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sprathivadi
 */
@Repository("JBLogFileWriterService")
public class JBLogFileWriterServiceImpl implements JBLogFileWriterService {

    @Override
    public void writeToLog(String message) {
        try(PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(JBActivityConstants.JBLogFileName, true)))) {
            String currentDateTime = JBActivityConstants.dateTimeFormatter.print(new DateTime());
            out.println(new StringBuilder().append(currentDateTime).append(": ").append(message).toString());
        }catch (IOException e) {
            System.err.println(e);
        }
    }

    @Override
    public String retrieveLog() {
        boolean logRetrieved = false;
        String log = "no logs";
        try {
            log = new String(Files.readAllBytes(Paths.get(JBActivityConstants.JBLogFileName)));            
            logRetrieved = true;
        } 
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        } 
        finally {
            if(logRetrieved) { return log; } 
            else { return "no messages yet..";}
        }
    }

    @Override
    public void deleteLog() {
        File file = new File(JBActivityConstants.JBLogFileName);            
        file.delete();
    }
}
