package com.applovin.impl;

import android.view.Surface;

/* loaded from: classes.dex */
public class jd extends ed {

    /* renamed from: c, reason: collision with root package name */
    public final int f8443c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f8444d;

    public jd(Throwable th, fd fdVar, Surface surface) {
        super(th, fdVar);
        boolean z8;
        this.f8443c = System.identityHashCode(surface);
        if (surface != null && !surface.isValid()) {
            z8 = false;
        } else {
            z8 = true;
        }
        this.f8444d = z8;
    }
}
