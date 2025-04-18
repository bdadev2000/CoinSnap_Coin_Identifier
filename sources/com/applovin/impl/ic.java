package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class ic {

    /* renamed from: h, reason: collision with root package name */
    private static final AtomicLong f5314h = new AtomicLong();
    public final long a;

    /* renamed from: b, reason: collision with root package name */
    public final j5 f5315b;

    /* renamed from: c, reason: collision with root package name */
    public final Uri f5316c;

    /* renamed from: d, reason: collision with root package name */
    public final Map f5317d;

    /* renamed from: e, reason: collision with root package name */
    public final long f5318e;

    /* renamed from: f, reason: collision with root package name */
    public final long f5319f;

    /* renamed from: g, reason: collision with root package name */
    public final long f5320g;

    public ic(long j3, j5 j5Var, long j10) {
        this(j3, j5Var, j5Var.a, Collections.emptyMap(), j10, 0L, 0L);
    }

    public static long a() {
        return f5314h.getAndIncrement();
    }

    public ic(long j3, j5 j5Var, Uri uri, Map map, long j10, long j11, long j12) {
        this.a = j3;
        this.f5315b = j5Var;
        this.f5316c = uri;
        this.f5317d = map;
        this.f5318e = j10;
        this.f5319f = j11;
        this.f5320g = j12;
    }
}
