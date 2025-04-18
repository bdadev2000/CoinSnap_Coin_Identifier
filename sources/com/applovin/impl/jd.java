package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class jd extends o5 {

    /* renamed from: a, reason: collision with root package name */
    public final kd f24666a;

    /* renamed from: b, reason: collision with root package name */
    public final String f24667b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public jd(java.lang.Throwable r4, com.applovin.impl.kd r5) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Decoder failed: "
            r0.<init>(r1)
            r1 = 0
            if (r5 != 0) goto Lc
            r2 = r1
            goto Le
        Lc:
            java.lang.String r2 = r5.f24873a
        Le:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.f24666a = r5
            int r5 = com.applovin.impl.xp.f27962a
            r0 = 21
            if (r5 < r0) goto L24
            java.lang.String r1 = a(r4)
        L24:
            r3.f24667b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.jd.<init>(java.lang.Throwable, com.applovin.impl.kd):void");
    }

    private static String a(Throwable th) {
        if (th instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th).getDiagnosticInfo();
        }
        return null;
    }
}
