package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cl implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f7089a;
    private long b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f7090c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f7091d = Collections.emptyMap();

    public cl(g5 g5Var) {
        this.f7089a = (g5) AbstractC0669a1.a(g5Var);
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        AbstractC0669a1.a(yoVar);
        this.f7089a.a(yoVar);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f7089a.c();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.f7089a.close();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.f7089a.e();
    }

    public long g() {
        return this.b;
    }

    public Uri h() {
        return this.f7090c;
    }

    public Map i() {
        return this.f7091d;
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        this.f7090c = j5Var.f8395a;
        this.f7091d = Collections.emptyMap();
        long a6 = this.f7089a.a(j5Var);
        this.f7090c = (Uri) AbstractC0669a1.a(c());
        this.f7091d = e();
        return a6;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        int a6 = this.f7089a.a(bArr, i9, i10);
        if (a6 != -1) {
            this.b += a6;
        }
        return a6;
    }
}
