package com.assignment;
public class MoodAnalyserException extends Exception{

    public enum ExceptionType {
        ENTERED_NULL,ENTERED_EMPTY
    }
    private ExceptionType type;
    public ExceptionType getType() {
        return this.type;
    }
    public MoodAnalyserException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
    }

