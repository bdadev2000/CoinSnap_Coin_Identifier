package com.applovin.impl;

import android.media.MediaCodec;

/* loaded from: classes.dex */
public class ed extends m5 {
    public final fd a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4441b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ed(java.lang.Throwable r4, com.applovin.impl.fd r5) {
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
            java.lang.String r2 = r5.a
        Le:
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0, r4)
            r3.a = r5
            int r5 = com.applovin.impl.yp.a
            r0 = 21
            if (r5 < r0) goto L24
            java.lang.String r1 = a(r4)
        L24:
            r3.f4441b = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.ed.<init>(java.lang.Throwable, com.applovin.impl.fd):void");
    }

    private static String a(Throwable th2) {
        if (th2 instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) th2).getDiagnosticInfo();
        }
        return null;
    }
}
