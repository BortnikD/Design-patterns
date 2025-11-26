package com.bortnik.patterns.behavioral.template;

public abstract class ReportGenerator {

    /**
     * Template method defining the steps to generate a report.
     */
    public final void generateReport() {
        collectData();
        generateReportBody();
    }

    // Steps
    private void collectData() {
        System.out.println("Collecting data for the report...");
    }

    protected abstract void generateReportBody();
}
