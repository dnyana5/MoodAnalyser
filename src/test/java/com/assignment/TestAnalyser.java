package com.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TestAnalyser {
    @Test
    public void given_InSadMood_thenShouldReturnSadMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in Sad Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("SAD",result);
    }
   @Test
    public void given_InAnyMood_thenShouldReturnHappyMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser("I am in any Mood");
        String result = moodAnalyser.analyseMood();
        Assert.assertEquals("HAPPY",result);
    }
    @Test
    public void given_Null_AnalysisMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyzer =  new  MoodAnalyser ( null );
        String result = moodAnalyzer.analyseMood();
        Assert.assertEquals("HAPPY", result);
    }
}
