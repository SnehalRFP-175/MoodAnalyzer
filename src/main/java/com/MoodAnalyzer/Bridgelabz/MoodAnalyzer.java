package com.MoodAnalyzer.Bridgelabz;

public class MoodAnalyzer
{

    public String analyseMood(String message) {
        if (message == "Sad") {
            return "SAD";
        } else if (message == "Happy") {
            return "HAPPY";
        }
        return "";
    }

    public static void main(String a[])
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();

        moodAnalyzer.analyseMood("Sad");

    }

}
