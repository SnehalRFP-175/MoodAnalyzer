package com.MoodAnalyzer.Brdgelabz;

import com.MoodAnalyzer.Bridgelabz.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest
{
    @Test
    protected void testMoodAnalysis()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("I am in a Sad Mood");
        String actualResult = moodAnalyzer.analyzeMood();
        Assertions.assertEquals("SAD", actualResult);
    }
}
