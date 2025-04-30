package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum PlaybackStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2),
    FINISHED(3);

    final int nativeCode;

    PlaybackStatus(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static PlaybackStatus forNumber(int i9) {
        for (PlaybackStatus playbackStatus : values()) {
            if (playbackStatus.nativeCode == i9) {
                return playbackStatus;
            }
        }
        throw new FatalException(A.a("Unexpected value for native PlaybackStatus, value=", (byte) 50, i9));
    }
}
