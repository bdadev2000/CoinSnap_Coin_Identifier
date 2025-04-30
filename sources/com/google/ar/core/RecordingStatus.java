package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum RecordingStatus {
    NONE(0),
    OK(1),
    IO_ERROR(2);

    final int nativeCode;

    RecordingStatus(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static RecordingStatus forNumber(int i9) {
        for (RecordingStatus recordingStatus : values()) {
            if (recordingStatus.nativeCode == i9) {
                return recordingStatus;
            }
        }
        throw new FatalException(A.a("Unexpected value for native RecordingStatus, value=", (byte) 51, i9));
    }
}
