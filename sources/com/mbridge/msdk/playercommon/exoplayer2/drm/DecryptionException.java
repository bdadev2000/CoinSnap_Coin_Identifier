package com.mbridge.msdk.playercommon.exoplayer2.drm;

/* loaded from: classes3.dex */
public class DecryptionException extends Exception {
    public final int errorCode;

    public DecryptionException(int i9, String str) {
        super(str);
        this.errorCode = i9;
    }
}
