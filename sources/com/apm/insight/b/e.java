package com.apm.insight.b;

import androidx.annotation.CallSuper;

/* loaded from: classes.dex */
public abstract class e {
    public static long a;

    /* renamed from: b, reason: collision with root package name */
    public static long f2991b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f2992c = false;

    @CallSuper
    public void a(String str) {
        this.f2992c = true;
    }

    @CallSuper
    public void b(String str) {
        this.f2992c = false;
    }

    public boolean a() {
        return false;
    }
}
