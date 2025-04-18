package com.swordfish.libretrodroid;

import android.support.v4.media.d;

/* loaded from: classes.dex */
public final class RetroException extends RuntimeException {
    private final int errorCode;

    public RetroException(int i2) {
        super(d.i("Retro exception. Error code ", i2));
        this.errorCode = i2;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
