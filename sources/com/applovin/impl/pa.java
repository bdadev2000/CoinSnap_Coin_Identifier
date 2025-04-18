package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class pa implements g5 {
    private final g5 a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6927b;

    /* renamed from: c, reason: collision with root package name */
    private final a f6928c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f6929d;

    /* renamed from: e, reason: collision with root package name */
    private int f6930e;

    /* loaded from: classes.dex */
    public interface a {
        void a(yg ygVar);
    }

    public pa(g5 g5Var, int i10, a aVar) {
        boolean z10;
        if (i10 > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.a(z10);
        this.a = g5Var;
        this.f6927b = i10;
        this.f6928c = aVar;
        this.f6929d = new byte[1];
        this.f6930e = i10;
    }

    private boolean g() {
        if (this.a.a(this.f6929d, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f6929d[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int a10 = this.a.a(bArr, i12, i11);
            if (a10 == -1) {
                return false;
            }
            i12 += a10;
            i11 -= a10;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f6928c.a(new yg(bArr, i10));
        }
        return true;
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
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.g5
    public Map e() {
        return this.a.e();
    }

    @Override // com.applovin.impl.e5
    public int a(byte[] bArr, int i10, int i11) {
        if (this.f6930e == 0) {
            if (!g()) {
                return -1;
            }
            this.f6930e = this.f6927b;
        }
        int a10 = this.a.a(bArr, i10, Math.min(this.f6930e, i11));
        if (a10 != -1) {
            this.f6930e -= a10;
        }
        return a10;
    }

    @Override // com.applovin.impl.g5
    public long a(j5 j5Var) {
        throw new UnsupportedOperationException();
    }
}
