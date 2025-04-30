package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum TrackingState {
    TRACKING(0),
    PAUSED(1),
    STOPPED(2);

    final int nativeCode;

    TrackingState(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static TrackingState forNumber(int i9) {
        for (TrackingState trackingState : values()) {
            if (trackingState.nativeCode == i9) {
                return trackingState;
            }
        }
        throw new FatalException(A.a("Unexpected value for native TrackingState, value=", (byte) 49, i9));
    }
}
