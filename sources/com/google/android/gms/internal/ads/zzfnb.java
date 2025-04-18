package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public enum zzfnb {
    DEFINED_BY_JAVASCRIPT("definedByJavaScript"),
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO),
    AUDIO(MimeTypes.BASE_TYPE_AUDIO);

    private final String zzg;

    zzfnb(String str) {
        this.zzg = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zzg;
    }
}
