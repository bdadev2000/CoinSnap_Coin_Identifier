package com.google.android.gms.internal.ads;

import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* loaded from: classes3.dex */
public enum zzees {
    HTML_DISPLAY("htmlDisplay"),
    NATIVE_DISPLAY("nativeDisplay"),
    VIDEO(MimeTypes.BASE_TYPE_VIDEO);

    private final String zze;

    zzees(String str) {
        this.zze = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.zze;
    }
}
