package com.applovin.impl;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes3.dex */
public final class fl implements i5 {

    /* renamed from: a, reason: collision with root package name */
    private final i5 f23927a;

    /* renamed from: b, reason: collision with root package name */
    private long f23928b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f23929c = Uri.EMPTY;
    private Map d = Collections.emptyMap();

    public fl(i5 i5Var) {
        this.f23927a = (i5) b1.a(i5Var);
    }

    @Override // com.applovin.impl.i5
    public void a(xo xoVar) {
        b1.a(xoVar);
        this.f23927a.a(xoVar);
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f23927a.c();
    }

    @Override // com.applovin.impl.i5
    public void close() {
        this.f23927a.close();
    }

    @Override // com.applovin.impl.i5
    public Map e() {
        return this.f23927a.e();
    }

    public long g() {
        return this.f23928b;
    }

    public Uri h() {
        return this.f23929c;
    }

    public Map i() {
        return this.d;
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        this.f23929c = l5Var.f24983a;
        this.d = Collections.emptyMap();
        long a2 = this.f23927a.a(l5Var);
        this.f23929c = (Uri) b1.a(c());
        this.d = e();
        return a2;
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        int a2 = this.f23927a.a(bArr, i2, i3);
        if (a2 != -1) {
            this.f23928b += a2;
        }
        return a2;
    }
}
