package com.applovin.impl;

import x0.AbstractC2914a;

/* loaded from: classes.dex */
public class kn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f8732h;

    public kn(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f8732h.run();
    }

    public kn(com.applovin.impl.sdk.k kVar, boolean z8, String str, Runnable runnable) {
        super(AbstractC2914a.d("TaskRunnable:", str), kVar, z8);
        this.f8732h = runnable;
    }
}
