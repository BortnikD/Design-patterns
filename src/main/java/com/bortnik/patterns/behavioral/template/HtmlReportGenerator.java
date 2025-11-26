package com.bortnik.patterns.behavioral.template;

public class HtmlReportGenerator extends ReportGenerator {
    @Override
    protected void generateReportBody() {
        System.out.println("Generating HTML report body...");
    }
}
