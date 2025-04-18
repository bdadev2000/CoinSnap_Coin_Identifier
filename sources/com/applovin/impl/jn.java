package com.applovin.impl;

/* loaded from: classes.dex */
public class jn extends yl {

    /* renamed from: h, reason: collision with root package name */
    private final Runnable f24715h;

    public jn(com.applovin.impl.sdk.j jVar, boolean z2, String str, Runnable runnable) {
        super(androidx.compose.ui.platform.j.b("TaskRunnable:", str), jVar, z2);
        this.f24715h = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f24715h.run();
    }

    public jn(com.applovin.impl.sdk.j jVar, String str, Runnable runnable) {
        this(jVar, false, str, runnable);
    }
}
