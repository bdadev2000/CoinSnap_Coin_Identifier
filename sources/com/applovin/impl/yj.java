package com.applovin.impl;

import com.applovin.mediation.MaxError;

/* loaded from: classes4.dex */
public class yj {

    /* renamed from: a, reason: collision with root package name */
    private final zj f28207a;

    /* renamed from: b, reason: collision with root package name */
    private final String f28208b;

    /* renamed from: c, reason: collision with root package name */
    private final String f28209c;
    private final String d;
    private final MaxError e;

    /* renamed from: f, reason: collision with root package name */
    private final long f28210f;

    /* renamed from: g, reason: collision with root package name */
    private final long f28211g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f28212h;

    /* loaded from: classes4.dex */
    public interface a {
        void a(yj yjVar);
    }

    private yj(zj zjVar, com.applovin.impl.mediation.g gVar, String str, MaxError maxError, long j2, long j3) {
        this(zjVar, str, maxError, j2, j3, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public String a() {
        return this.f28209c;
    }

    public long b() {
        return this.f28211g;
    }

    public MaxError c() {
        return this.e;
    }

    public String d() {
        return this.f28208b;
    }

    public String e() {
        return this.d;
    }

    public zj f() {
        return this.f28207a;
    }

    public boolean g() {
        return this.f28212h;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb.append(this.f28207a);
        sb.append(", mSdkVersion='");
        sb.append(this.f28208b);
        sb.append("', mAdapterVersion='");
        sb.append(this.f28209c);
        sb.append("', mSignalDataLength='");
        String str = this.d;
        sb.append(str != null ? str.length() : 0);
        sb.append("', mErrorMessage=");
        MaxError maxError = this.e;
        return android.support.v4.media.d.q(sb, maxError != null ? maxError.getMessage() : "", '}');
    }

    public static yj a(zj zjVar, com.applovin.impl.mediation.g gVar, MaxError maxError, long j2, long j3) {
        if (zjVar != null) {
            return new yj(zjVar, gVar, null, maxError, j2, j3);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    private yj(zj zjVar, String str, MaxError maxError, long j2, long j3, String str2, String str3, boolean z2) {
        this.f28207a = zjVar;
        this.d = str;
        this.e = maxError;
        this.f28210f = j2;
        this.f28211g = j3;
        this.f28208b = str2;
        this.f28209c = str3;
        this.f28212h = z2;
    }

    public static yj a(zj zjVar, MaxError maxError) {
        return a(zjVar, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    public static yj a(zj zjVar, com.applovin.impl.mediation.g gVar, String str, long j2, long j3) {
        if (zjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new yj(zjVar, gVar, str, null, j2, j3);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public static yj a(yj yjVar) {
        return new yj(yjVar.f(), yjVar.e(), yjVar.c(), yjVar.f28210f, yjVar.f28211g, yjVar.d(), yjVar.a(), true);
    }
}
