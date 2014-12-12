package com.salesforce.jbactivity.test;

import com.salesforce.jbactivity.domain.JBActivityConstants;
import com.salesforce.jbactivity.service.JBLogFileWriterServiceImpl;
import java.io.File;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sprathivadi
 */
public class JBLogTest {
    
    private File file;
    
    @Test
    public void testLogFile() {
        JBLogFileWriterServiceImpl logService = new JBLogFileWriterServiceImpl();
        logService.writeToLog("test");        
        assertTrue(file.exists());
    }
    
    @Before
    public void setUp() {
        file = new File(JBActivityConstants.JBLogFileName);
    }
    
    @After
    public void tearDown() {
        file.delete();
    }
    
}
