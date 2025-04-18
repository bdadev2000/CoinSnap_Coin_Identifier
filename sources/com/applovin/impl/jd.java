package com.applovin.impl;

import android.view.Surface;

/* loaded from: classes.dex */
public class jd extends ed {

    /* renamed from: c, reason: collision with root package name */
    public final int f5485c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f5486d;

    public jd(Throwable th2, fd fdVar, Surface surface) {
        super(th2, fdVar);
        boolean z10;
        this.f5485c = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f5486d = z10;
    }
}
