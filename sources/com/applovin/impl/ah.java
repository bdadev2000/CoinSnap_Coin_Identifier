package com.applovin.impl;

import java.io.IOException;

/* loaded from: classes.dex */
public class ah extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6751a;
    public final int b;

    public ah(String str, Throwable th, boolean z8, int i9) {
        super(str, th);
        this.f6751a = z8;
        this.b = i9;
    }

    public static ah a(String str, Throwable th) {
        return new ah(str, th, true, 1);
    }

    public static ah b(String str, Throwable th) {
        return new ah(str, th, true, 0);
    }

    public static ah a(String str) {
        return new ah(str, null, false, 1);
    }
}
