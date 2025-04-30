package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* loaded from: classes.dex */
public class vj {

    /* renamed from: a, reason: collision with root package name */
    private final wj f11751a;
    private final String b;

    /* renamed from: c, reason: collision with root package name */
    private final String f11752c;

    /* renamed from: d, reason: collision with root package name */
    private final String f11753d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f11754e;

    /* renamed from: f, reason: collision with root package name */
    private final long f11755f;

    /* renamed from: g, reason: collision with root package name */
    private final long f11756g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f11757h;

    /* loaded from: classes.dex */
    public interface a {
        void a(vj vjVar);
    }

    private vj(wj wjVar, com.applovin.impl.mediation.g gVar, String str, MaxError maxError, long j7, long j9) {
        this(wjVar, str, maxError, j7, j9, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, MaxError maxError, long j7, long j9) {
        if (wjVar != null) {
            return new vj(wjVar, gVar, null, maxError, j7, j9);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public long b() {
        return this.f11756g;
    }

    public MaxError c() {
        return this.f11754e;
    }

    public String d() {
        return this.b;
    }

    public String e() {
        return this.f11753d;
    }

    public wj f() {
        return this.f11751a;
    }

    public boolean g() {
        return this.f11757h;
    }

    public String toString() {
        int i9;
        String str;
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f11751a);
        sb.append(", mSdkVersion='");
        sb.append(this.b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f11752c);
        sb.append("', mSignalDataLength='");
        String str2 = this.f11753d;
        if (str2 != null) {
            i9 = str2.length();
        } else {
            i9 = 0;
        }
        sb.append(i9);
        sb.append("', mErrorMessage=");
        MaxError maxError = this.f11754e;
        if (maxError != null) {
            str = maxError.getMessage();
        } else {
            str = "";
        }
        return L.k(sb, str, '}');
    }

    public static vj a(wj wjVar, MaxError maxError) {
        return a(wjVar, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    private vj(wj wjVar, String str, MaxError maxError, long j7, long j9, String str2, String str3, boolean z8) {
        this.f11751a = wjVar;
        this.f11753d = str;
        this.f11754e = maxError;
        this.f11755f = j7;
        this.f11756g = j9;
        this.b = str2;
        this.f11752c = str3;
        this.f11757h = z8;
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, String str, long j7, long j9) {
        if (wjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new vj(wjVar, gVar, str, null, j7, j9);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public String a() {
        return this.f11752c;
    }

    public static vj a(vj vjVar) {
        return new vj(vjVar.f(), vjVar.e(), vjVar.c(), vjVar.f11755f, vjVar.f11756g, vjVar.d(), vjVar.a(), true);
    }
}
