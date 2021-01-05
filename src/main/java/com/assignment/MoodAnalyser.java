package com.assignment;

public class MoodAnalyser {
    public MoodAnalyser() {
        // TODO Auto-generated constructor stub
    }

    public String analyseMood(String message) {
        if (message.contains("I am in Sad Mood"))
            return "SAD";
        else
            return "HAPPY";
    }
}
