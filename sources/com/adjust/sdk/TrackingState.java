package com.adjust.sdk;

/* loaded from: classes.dex */
public enum TrackingState {
    OPTED_OUT(1);

    private int value;

    TrackingState(int i9) {
        this.value = i9;
    }

    public int getValue() {
        return this.value;
    }
}
