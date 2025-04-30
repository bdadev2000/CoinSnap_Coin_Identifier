package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum TrackingFailureReason {
    NONE(0),
    BAD_STATE(1),
    INSUFFICIENT_LIGHT(2),
    EXCESSIVE_MOTION(3),
    INSUFFICIENT_FEATURES(4),
    CAMERA_UNAVAILABLE(5);

    final int nativeCode;

    TrackingFailureReason(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static TrackingFailureReason forNumber(int i9) {
        for (TrackingFailureReason trackingFailureReason : values()) {
            if (trackingFailureReason.nativeCode == i9) {
                return trackingFailureReason;
            }
        }
        throw new FatalException(A.a("Unexpected value for native TrackingFailureReason, value=", (byte) 57, i9));
    }
}
