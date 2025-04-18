package com.applovin.impl;

import android.view.Surface;

/* loaded from: classes.dex */
public class od extends jd {

    /* renamed from: c, reason: collision with root package name */
    public final int f25841c;
    public final boolean d;

    public od(Throwable th, kd kdVar, Surface surface) {
        super(th, kdVar);
        this.f25841c = System.identityHashCode(surface);
        this.d = surface == null || surface.isValid();
    }
}
