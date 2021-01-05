package com.assignment;

public class MoodAnalyser {
    private String message;

    public MoodAnalyser() {
    }

    public MoodAnalyser(String message) {
        this .message = message;
    }

    public String analyseMood() throws MoodAnalyserException {
        try {
            if(message.length() == 0) {
                throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_EMPTY,"Please enter a proper message");
            }
            if (message.contains("I am in Sad Mood")) {
                return "SAD";
            }
            else {
                return "HAPPY";
            }
        }catch(NullPointerException e) {
            throw new MoodAnalyserException(MoodAnalyserException.ExceptionType.ENTERED_NULL,"Please enter a proper message");
        }
    }
}

