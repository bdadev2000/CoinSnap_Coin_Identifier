package com.applovin.impl;

import com.applovin.mediation.MaxError;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public class vj {
    private final wj a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8529b;

    /* renamed from: c, reason: collision with root package name */
    private final String f8530c;

    /* renamed from: d, reason: collision with root package name */
    private final String f8531d;

    /* renamed from: e, reason: collision with root package name */
    private final MaxError f8532e;

    /* renamed from: f, reason: collision with root package name */
    private final long f8533f;

    /* renamed from: g, reason: collision with root package name */
    private final long f8534g;

    /* renamed from: h, reason: collision with root package name */
    private final boolean f8535h;

    /* loaded from: classes.dex */
    public interface a {
        void a(vj vjVar);
    }

    private vj(wj wjVar, com.applovin.impl.mediation.g gVar, String str, MaxError maxError, long j3, long j10) {
        this(wjVar, str, maxError, j3, j10, gVar != null ? gVar.i() : null, gVar != null ? gVar.b() : null, false);
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, MaxError maxError, long j3, long j10) {
        if (wjVar != null) {
            return new vj(wjVar, gVar, null, maxError, j3, j10);
        }
        throw new IllegalArgumentException("No spec specified");
    }

    public long b() {
        return this.f8534g;
    }

    public MaxError c() {
        return this.f8532e;
    }

    public String d() {
        return this.f8529b;
    }

    public String e() {
        return this.f8531d;
    }

    public wj f() {
        return this.a;
    }

    public boolean g() {
        return this.f8535h;
    }

    public String toString() {
        int i10;
        String str;
        StringBuilder sb2 = new StringBuilder("SignalCollectionResult{mSignalProviderSpec=");
        sb2.append(this.a);
        sb2.append(", mSdkVersion='");
        sb2.append(this.f8529b);
        sb2.append("', mAdapterVersion='");
        sb2.append(this.f8530c);
        sb2.append("', mSignalDataLength='");
        String str2 = this.f8531d;
        if (str2 != null) {
            i10 = str2.length();
        } else {
            i10 = 0;
        }
        sb2.append(i10);
        sb2.append("', mErrorMessage=");
        MaxError maxError = this.f8532e;
        if (maxError != null) {
            str = maxError.getMessage();
        } else {
            str = "";
        }
        return com.applovin.impl.mediation.ads.e.g(sb2, str, AbstractJsonLexerKt.END_OBJ);
    }

    public static vj a(wj wjVar, MaxError maxError) {
        return a(wjVar, (com.applovin.impl.mediation.g) null, maxError, -1L, -1L);
    }

    private vj(wj wjVar, String str, MaxError maxError, long j3, long j10, String str2, String str3, boolean z10) {
        this.a = wjVar;
        this.f8531d = str;
        this.f8532e = maxError;
        this.f8533f = j3;
        this.f8534g = j10;
        this.f8529b = str2;
        this.f8530c = str3;
        this.f8535h = z10;
    }

    public static vj a(wj wjVar, com.applovin.impl.mediation.g gVar, String str, long j3, long j10) {
        if (wjVar == null) {
            throw new IllegalArgumentException("No spec specified");
        }
        if (gVar != null) {
            return new vj(wjVar, gVar, str, null, j3, j10);
        }
        throw new IllegalArgumentException("No adapterWrapper specified");
    }

    public String a() {
        return this.f8530c;
    }

    public static vj a(vj vjVar) {
        return new vj(vjVar.f(), vjVar.e(), vjVar.c(), vjVar.f8533f, vjVar.f8534g, vjVar.d(), vjVar.a(), true);
    }
}
