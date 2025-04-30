package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public class h5 extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final int f8062a;

    public h5(int i9) {
        this.f8062a = i9;
    }

    /* JADX WARN: Code restructure failed: missing block: B:0:?, code lost:
    
        r2 = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean a(java.io.IOException r2) {
        /*
        L0:
            if (r2 == 0) goto L16
            boolean r0 = r2 instanceof com.applovin.impl.h5
            if (r0 == 0) goto L11
            r0 = r2
            com.applovin.impl.h5 r0 = (com.applovin.impl.h5) r0
            int r0 = r0.f8062a
            r1 = 2008(0x7d8, float:2.814E-42)
            if (r0 != r1) goto L11
            r2 = 1
            return r2
        L11:
            java.lang.Throwable r2 = r2.getCause()
            goto L0
        L16:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.h5.a(java.io.IOException):boolean");
    }

    public h5(String str, int i9) {
        super(str);
        this.f8062a = i9;
    }

    public h5(String str, Throwable th, int i9) {
        super(str, th);
        this.f8062a = i9;
    }

    public h5(Throwable th, int i9) {
        super(th);
        this.f8062a = i9;
    }
}
