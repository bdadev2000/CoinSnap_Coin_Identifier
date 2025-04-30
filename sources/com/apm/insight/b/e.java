package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a, reason: collision with root package name */
    public static long f5669a;
    public static long b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f5670c = false;

    @CallSuper
    public void a(String str) {
        this.f5670c = true;
    }

    @CallSuper
    public void b(String str) {
        this.f5670c = false;
    }

    public boolean a() {
        return false;
    }
}
