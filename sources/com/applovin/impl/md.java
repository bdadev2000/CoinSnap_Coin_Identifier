package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes.dex */
public final class md extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final j5 f8906a;
    public final Uri b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f8907c;

    /* renamed from: d, reason: collision with root package name */
    public final long f8908d;

    public md(j5 j5Var, Uri uri, Map map, long j7, Throwable th) {
        super(th);
        this.f8906a = j5Var;
        this.b = uri;
        this.f8907c = map;
        this.f8908d = j7;
    }
}
