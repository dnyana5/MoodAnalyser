package com.assignment;

import org.junit.Assert;
import org.junit.Test;

public class TestAnalyser {
    @Test
    public void given_InSadMood_thenShouldReturnSadMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in Sad Mood");
        Assert.assertEquals("SAD",result);
    }
   @Test
    public void given_InAnyMood_thenShouldReturnHappyMood() {
        MoodAnalyser moodAnalyser=new MoodAnalyser();
        String result = moodAnalyser.analyseMood("I am in any Mood");
        Assert.assertEquals("HAPPY",result);
    }
}
