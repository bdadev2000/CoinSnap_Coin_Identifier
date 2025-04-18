package com.applovin.impl;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class s2 {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private long f7435b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f7436c;

    /* renamed from: d, reason: collision with root package name */
    private long f7437d;

    /* renamed from: e, reason: collision with root package name */
    private long f7438e;

    /* renamed from: f, reason: collision with root package name */
    private int f7439f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f7440g;

    public void a() {
        this.f7438e++;
    }

    public void b() {
        this.f7437d++;
    }

    public void c() {
        this.f7436c = true;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.a + ", totalCachedBytes=" + this.f7435b + ", isHTMLCachingCancelled=" + this.f7436c + ", htmlResourceCacheSuccessCount=" + this.f7437d + ", htmlResourceCacheFailureCount=" + this.f7438e + AbstractJsonLexerKt.END_OBJ;
    }

    public void a(Throwable th2) {
        this.f7440g = th2;
    }

    public void a(int i10) {
        this.f7439f = i10;
    }

    public void a(long j3) {
        this.f7435b += j3;
    }
}
