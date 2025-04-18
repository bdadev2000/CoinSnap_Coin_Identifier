package com.applovin.impl;

/* loaded from: classes.dex */
public class kn extends xl {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f5753h;

    public kn(com.applovin.impl.sdk.k kVar, boolean z10, String str, Runnable runnable) {
        super(vd.e.e("TaskRunnable:", str), kVar, z10);
        this.f5753h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f5753h.run();
    }

    public kn(com.applovin.impl.sdk.k kVar, String str, Runnable runnable) {
        this(kVar, false, str, runnable);
    }
}
