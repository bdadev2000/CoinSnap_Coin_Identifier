package com.meta.analytics.dsp.uinode;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9c, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C10079c extends Exception {
    public final int A00;
    public final int A01;

    public C10079c(int i9, String str, Throwable th, int i10) {
        super(str, th);
        this.A01 = i9;
        this.A00 = i10;
    }

    public static C10079c A00(IOException iOException) {
        return new C10079c(0, null, iOException, -1);
    }

    public static C10079c A01(Exception exc, int i9) {
        return new C10079c(1, null, exc, i9);
    }

    public static C10079c A02(RuntimeException runtimeException) {
        return new C10079c(2, null, runtimeException, -1);
    }
}
