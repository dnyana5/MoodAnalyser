package com.assignment;
import org.junit.Assert;
import org.junit.Test;

public class TestAnalyser {
    @Test
    public void given_SadMood_ShouldReturnSad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
        try {
            Assert.assertEquals("SAD",moodAnalyzer.analyseMood());
        } catch (MoodAnalyserException e) {
        }
    }

    @Test
    public void given_HappyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
        try {
            Assert.assertEquals("HAPPY",moodAnalyzer.analyseMood());
        } catch (MoodAnalyserException e) {
        }
    }

    @Test
    public void given_Null_ShouldReturnHappy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_NULL, e.getType());
        }
    }

    @Test
    public void given_Empty_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(" ");
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assert.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.getType());
        }
    }
}

