package com.teamtreehouse.pomodoro.model;

public enum AttemptKind {
    FOCUS(25 * 60, "Focus Time"),
    BREAK(5 * 60, "Break Time");

    private int mTotalSeconds;
    private String mDisplayName;

    AttemptKind(int totalSeconds, String displayName) {
        mTotalSeconds = totalSeconds;
        mDisplayName = displayName;
    }

    public int getTotalSeconds() {
        return mTotalSeconds;
    }

    public String getDisplayName() {
        return mDisplayName;
    }
}
