package com.applovin.impl;

/* loaded from: classes2.dex */
public final class u2 {

    /* renamed from: a, reason: collision with root package name */
    private long f27266a;

    /* renamed from: b, reason: collision with root package name */
    private long f27267b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f27268c;
    private long d;
    private long e;

    /* renamed from: f, reason: collision with root package name */
    private int f27269f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f27270g;

    public Throwable a() {
        return this.f27270g;
    }

    public int b() {
        return this.f27269f;
    }

    public void c() {
        this.e++;
    }

    public void d() {
        this.d++;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f27266a + ", totalCachedBytes=" + this.f27267b + ", isHTMLCachingCancelled=" + this.f27268c + ", htmlResourceCacheSuccessCount=" + this.d + ", htmlResourceCacheFailureCount=" + this.e + '}';
    }

    public void a(int i2) {
        this.f27269f = i2;
    }

    public void a(long j2) {
        this.f27267b += j2;
    }

    public void a(Throwable th) {
        this.f27270g = th;
    }
}
