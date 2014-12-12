package com.salesforce.jbactivity.domain;

import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 *
 * @author sprathivadi
 */
public class JBActivityConstants {
    public static final String JBLogFileName = "JBLog";
    public static DateTimeFormatter dateTimeFormatter = DateTimeFormat.forPattern("MM/dd/yyyy hh:mm:ss a");
}
