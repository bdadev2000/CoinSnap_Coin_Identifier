package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum Coordinates3d {
    EIS_TEXTURE_NORMALIZED(0),
    EIS_NORMALIZED_DEVICE_COORDINATES(1);

    final int nativeCode;

    Coordinates3d(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static Coordinates3d forNumber(int i9) {
        for (Coordinates3d coordinates3d : values()) {
            if (coordinates3d.nativeCode == i9) {
                return coordinates3d;
            }
        }
        throw new FatalException(A.a("Unexpected value for native Coordinates3d, value = ", (byte) 51, i9));
    }
}
