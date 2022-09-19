package com.MoodAnalyzer.Bridgelabz;

public class MoodAnalyzer
{
    private String message;

    public String analyzeMood(String message)
    {
        if (message.contains("SAD"))
            return "SAD";
        else
            return "HAPPY";
    }
}
