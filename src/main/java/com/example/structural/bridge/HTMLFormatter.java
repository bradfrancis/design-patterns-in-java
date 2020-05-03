package com.example.structural.bridge;

import java.util.List;

public class HTMLFormatter implements Formatter {

    @Override
    public String format(String header, List<Detail> details) {
        StringBuilder builder = new StringBuilder();
        builder.append("<table>");
        builder.append("<thead><tr><th>");
        builder.append(header);
        builder.append("</th></tr></thead>");

        builder.append("<tbody>");
        for (Detail detail : details) {
            builder.append("<tr><td>");
            builder.append(detail.getLabel());
            builder.append("</td><td>");
            builder.append(detail.getValue());
            builder.append("</td></tr>");
        }
        builder.append("</tbody>");
        builder.append("</table>");

        return builder.toString();
    }
}
