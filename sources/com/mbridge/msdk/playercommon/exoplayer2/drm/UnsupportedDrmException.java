package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* loaded from: classes4.dex */
public final class UnsupportedDrmException extends Exception {
    public static final int REASON_INSTANTIATION_ERROR = 2;
    public static final int REASON_UNSUPPORTED_SCHEME = 1;
    public final int reason;

    /* loaded from: classes4.dex */
    public @interface Reason {
    }

    public UnsupportedDrmException(int i10) {
        this.reason = i10;
    }

    public UnsupportedDrmException(int i10, Exception exc) {
        super(exc);
        this.reason = i10;
    }
}
