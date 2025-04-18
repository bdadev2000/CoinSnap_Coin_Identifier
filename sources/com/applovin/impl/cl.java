package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes.dex */
public final class cl implements g5 {
    private final g5 a;

    /* renamed from: b, reason: collision with root package name */
    private long f4104b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f4105c = Uri.EMPTY;

    /* renamed from: d, reason: collision with root package name */
    private Map f4106d = Collections.emptyMap();

    public cl(g5 g5Var) {
        this.a = (g5) a1.a(g5Var);
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        a1.a(yoVar);
        this.a.a(yoVar);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.a.c();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        this.a.close();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.a.e();
    }

    public long g() {
        return this.f4104b;
    }

    public Uri h() {
        return this.f4105c;
    }

    public Map i() {
        return this.f4106d;
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        this.f4105c = j5Var.a;
        this.f4106d = Collections.emptyMap();
        long a = this.a.a(j5Var);
        this.f4105c = (Uri) a1.a(c());
        this.f4106d = e();
        return a;
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        int a = this.a.a(bArr, i10, i11);
        if (a != -1) {
            this.f4104b += a;
        }
        return a;
    }
}
