package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public class ah extends IOException {
    public final boolean a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3756b;

    public ah(String str, Throwable th2, boolean z10, int i10) {
        super(str, th2);
        this.a = z10;
        this.f3756b = i10;
    }

    public static ah a(String str, Throwable th2) {
        return new ah(str, th2, true, 1);
    }

    public static ah b(String str, Throwable th2) {
        return new ah(str, th2, true, 0);
    }

    public static ah a(String str) {
        return new ah(str, null, false, 1);
    }
}
