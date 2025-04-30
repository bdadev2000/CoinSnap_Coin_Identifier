package com.google.ar.core;

import androidx.annotation.NonNull;
import com.google.ar.core.exceptions.FatalException;

/* loaded from: classes2.dex */
public enum Coordinates2d {
    TEXTURE_TEXELS(0),
    TEXTURE_NORMALIZED(1),
    IMAGE_PIXELS(2),
    IMAGE_NORMALIZED(3),
    OPENGL_NORMALIZED_DEVICE_COORDINATES(6),
    VIEW(7),
    VIEW_NORMALIZED(8);

    final int nativeCode;

    Coordinates2d(int i9) {
        this.nativeCode = i9;
    }

    @NonNull
    public static Coordinates2d forNumber(int i9) {
        for (Coordinates2d coordinates2d : values()) {
            if (coordinates2d.nativeCode == i9) {
                return coordinates2d;
            }
        }
        throw new FatalException(A.a("Unexpected value for native Coordinates2d, value=", (byte) 49, i9));
    }
}
