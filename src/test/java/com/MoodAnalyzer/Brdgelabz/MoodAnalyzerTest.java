package com.MoodAnalyzer.Brdgelabz;

import com.MoodAnalyzer.Bridgelabz.MoodAnalyzer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyzerTest
{
    @Test
    protected void testMoodAnalysis()
    {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer();
        String actualResult = moodAnalyzer.analyzeMood("I am in a Any Mood");
        Assertions.assertEquals("SAD", actualResult);
    }
}
