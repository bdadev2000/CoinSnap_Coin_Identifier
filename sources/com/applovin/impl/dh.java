package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes3.dex */
public class dh extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f23485a;

    /* renamed from: b, reason: collision with root package name */
    public final int f23486b;

    public dh(String str, Throwable th, boolean z2, int i2) {
        super(str, th);
        this.f23485a = z2;
        this.f23486b = i2;
    }

    public static dh a(String str, Throwable th) {
        return new dh(str, th, true, 1);
    }

    public static dh b(String str, Throwable th) {
        return new dh(str, th, true, 0);
    }

    public static dh a(String str) {
        return new dh(str, null, false, 1);
    }
}
