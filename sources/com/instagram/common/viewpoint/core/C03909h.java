package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.9h, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C03909h extends Exception {
    public final int A00;
    public final int A01;

    public C03909h(int i2, String str, Throwable th, int i3) {
        super(str, th);
        this.A01 = i2;
        this.A00 = i3;
    }

    public static C03909h A00(IOException iOException) {
        return new C03909h(0, null, iOException, -1);
    }

    public static C03909h A01(Exception exc, int i2) {
        return new C03909h(1, null, exc, i2);
    }

    public static C03909h A02(RuntimeException runtimeException) {
        return new C03909h(2, null, runtimeException, -1);
    }
}
