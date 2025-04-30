package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ic {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f8278h = new AtomicLong();

    /* renamed from: a, reason: collision with root package name */
    public final long f8279a;
    public final j5 b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f8280c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f8281d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8282e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8283f;

    /* renamed from: g, reason: collision with root package name */
    public final long f8284g;

    public ic(long j7, j5 j5Var, long j9) {
        this(j7, j5Var, j5Var.f8395a, Collections.emptyMap(), j9, 0L, 0L);
    }

    public static long a() {
        return f8278h.getAndIncrement();
    }

    public ic(long j7, j5 j5Var, Uri uri, Map map, long j9, long j10, long j11) {
        this.f8279a = j7;
        this.b = j5Var;
        this.f8280c = uri;
        this.f8281d = map;
        this.f8282e = j9;
        this.f8283f = j10;
        this.f8284g = j11;
    }
}
