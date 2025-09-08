package com.example;

public class CoreCalculator {
    public static int getCoreCount() {
        return Runtime.getRuntime().availableProcessors();
    }
}
