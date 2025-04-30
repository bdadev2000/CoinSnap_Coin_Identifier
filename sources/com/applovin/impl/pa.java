package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class pa implements g5 {

    /* renamed from: a, reason: collision with root package name */
    private final g5 f9997a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private final a f9998c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f9999d;

    /* renamed from: e, reason: collision with root package name */
    private int f10000e;

    /* loaded from: classes.dex */
    public interface a {
        void a(yg ygVar);
    }

    public pa(g5 g5Var, int i9, a aVar) {
        boolean z8;
        if (i9 > 0) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.a(z8);
        this.f9997a = g5Var;
        this.b = i9;
        this.f9998c = aVar;
        this.f9999d = new byte[1];
        this.f10000e = i9;
    }

    private boolean g() {
        if (this.f9997a.a(this.f9999d, 0, 1) == -1) {
            return false;
        }
        int i9 = (this.f9999d[0] & 255) << 4;
        if (i9 == 0) {
            return true;
        }
        byte[] bArr = new byte[i9];
        int i10 = i9;
        int i11 = 0;
        while (i10 > 0) {
            int a6 = this.f9997a.a(bArr, i11, i10);
            if (a6 == -1) {
                return false;
            }
            i11 += a6;
            i10 -= a6;
        }
        while (i9 > 0 && bArr[i9 - 1] == 0) {
            i9--;
        }
        if (i9 > 0) {
            this.f9998c.a(new yg(bArr, i9));
        }
        return true;
    }

    @Override // com.applovin.impl.g5
    public void a(yo yoVar) {
        AbstractC0669a1.a(yoVar);
        this.f9997a.a(yoVar);
    }

    @Override // com.applovin.impl.g5
    public Uri c() {
        return this.f9997a.c();
    }

    @Override // com.applovin.impl.g5
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.f9997a.e();
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i9, int i10) {
        if (this.f10000e == 0) {
            if (!g()) {
                return -1;
            }
            this.f10000e = this.b;
        }
        int a6 = this.f9997a.a(bArr, i9, Math.min(this.f10000e, i10));
        if (a6 != -1) {
            this.f10000e -= a6;
        }
        return a6;
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
