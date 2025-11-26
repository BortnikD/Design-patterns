package com.bortnik.patterns.behavioral.template;

/**
 * Demonstrates the Template Method design pattern.
 */
public class TemplateMethodDemo {
    public static void demonstrate() {
        System.out.println("=== Template Method Demo ===");

        ReportGenerator pdfReport = new PdfReportGenerator();
        pdfReport.generateReport();

        ReportGenerator htmlReport = new HtmlReportGenerator();
        htmlReport.generateReport();
    }
}
