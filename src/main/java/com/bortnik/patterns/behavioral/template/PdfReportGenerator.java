package com.bortnik.patterns.behavioral.template;

public class PdfReportGenerator extends ReportGenerator {
    @Override
    protected void generateReportBody() {
        System.out.println("Generating PDF report body...");
    }
}
