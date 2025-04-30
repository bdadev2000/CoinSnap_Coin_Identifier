package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum FutureState {
    PENDING(0),
    CANCELLED(1),
    DONE(2);

    final int nativeCode;

    FutureState(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static FutureState forNumber(int i9) {
        for (FutureState futureState : values()) {
            if (futureState.nativeCode == i9) {
                return futureState;
            }
        }
        throw new FatalException(A.a("Unexpected value for native FutureState, value=", (byte) 47, i9));
    }
}
