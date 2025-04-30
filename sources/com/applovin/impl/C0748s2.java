package com.applovin.impl;

/* renamed from: com.applovin.impl.s2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0748s2 {

    /* renamed from: a, reason: collision with root package name */
    private long f10560a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f10561c;

    /* renamed from: d, reason: collision with root package name */
    private long f10562d;

    /* renamed from: e, reason: collision with root package name */
    private long f10563e;

    /* renamed from: f, reason: collision with root package name */
    private int f10564f;

    /* renamed from: g, reason: collision with root package name */
    private Throwable f10565g;

    public void a() {
        this.f10563e++;
    }

    public void b() {
        this.f10562d++;
    }

    public void c() {
        this.f10561c = true;
    }

    public String toString() {
        return "CacheStatsTracker{totalDownloadedBytes=" + this.f10560a + ", totalCachedBytes=" + this.b + ", isHTMLCachingCancelled=" + this.f10561c + ", htmlResourceCacheSuccessCount=" + this.f10562d + ", htmlResourceCacheFailureCount=" + this.f10563e + '}';
    }

    public void a(Throwable th) {
        this.f10565g = th;
    }

    public void a(int i9) {
        this.f10564f = i9;
    }

    public void a(long j7) {
        this.b += j7;
    }
}
