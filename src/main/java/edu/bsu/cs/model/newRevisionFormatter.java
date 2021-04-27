package edu.bsu.cs.model;

import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class newRevisionFormatter implements IFormatter {
    @Override
    public String format(Revision revision) {
        String name = revision.name;
        String date = DateTimeFormatter
                .ofPattern("dd-MM-uuuu")
                .withLocale(Locale.getDefault())
                .withZone(ZoneId.systemDefault())
                .format(revision.timestamp);
        String time = DateTimeFormatter
                .ofPattern(" hh:mm:ss a")
                .withLocale(Locale.getDefault())
                .withZone(ZoneId.systemDefault())
                .format(revision.timestamp);
        //String newFormat = String.format()
        return String.format("%s made a change at %s on %s",name,time,date);
    }
}
