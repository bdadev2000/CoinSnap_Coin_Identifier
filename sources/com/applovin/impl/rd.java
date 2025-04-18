package com.applovin.impl;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* loaded from: classes2.dex */
public final class rd extends IOException {

    /* renamed from: a, reason: collision with root package name */
    public final l5 f26286a;

    /* renamed from: b, reason: collision with root package name */
    public final Uri f26287b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f26288c;
    public final long d;

    public rd(l5 l5Var, Uri uri, Map map, long j2, Throwable th) {
        super(th);
        this.f26286a = l5Var;
        this.f26287b = uri;
        this.f26288c = map;
        this.d = j2;
    }
}
