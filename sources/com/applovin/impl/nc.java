package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class nc {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f25691h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f25692a;

    /* renamed from: b, reason: collision with root package name */
    public final l5 f25693b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f25694c;
    public final Map d;
    public final long e;

    /* renamed from: f, reason: collision with root package name */
    public final long f25695f;

    /* renamed from: g, reason: collision with root package name */
    public final long f25696g;

    public nc(long j2, l5 l5Var, long j3) {
        this(j2, l5Var, l5Var.f24983a, Collections.emptyMap(), j3, 0L, 0L);
    }

    public static long a() {
        return f25691h.getAndIncrement();
    }

    public nc(long j2, l5 l5Var, Uri uri, Map map, long j3, long j4, long j5) {
        this.f25692a = j2;
        this.f25693b = l5Var;
        this.f25694c = uri;
        this.d = map;
        this.e = j3;
        this.f25695f = j4;
        this.f25696g = j5;
    }
}
