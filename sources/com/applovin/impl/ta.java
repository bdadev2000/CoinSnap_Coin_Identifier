package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* loaded from: classes.dex */
final class ta implements i5 {

    /* renamed from: a, reason: collision with root package name */
    private final i5 f27036a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27037b;

    /* renamed from: c, reason: collision with root package name */
    private final a f27038c;
    private final byte[] d;
    private int e;

    /* loaded from: classes.dex */
    public interface a {
        void a(bh bhVar);
    }

    public ta(i5 i5Var, int i2, a aVar) {
        b1.a(i2 > 0);
        this.f27036a = i5Var;
        this.f27037b = i2;
        this.f27038c = aVar;
        this.d = new byte[1];
        this.e = i2;
    }

    private boolean g() {
        if (this.f27036a.a(this.d, 0, 1) == -1) {
            return false;
        }
        int i2 = (this.d[0] & 255) << 4;
        if (i2 == 0) {
            return true;
        }
        byte[] bArr = new byte[i2];
        int i3 = i2;
        int i4 = 0;
        while (i3 > 0) {
            int a2 = this.f27036a.a(bArr, i4, i3);
            if (a2 == -1) {
                return false;
            }
            i4 += a2;
            i3 -= a2;
        }
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        if (i2 > 0) {
            this.f27038c.a(new bh(bArr, i2));
        }
        return true;
    }

    @Override // com.applovin.impl.i5
    public void a(xo xoVar) {
        b1.a(xoVar);
        this.f27036a.a(xoVar);
    }

    @Override // com.applovin.impl.i5
    public Uri c() {
        return this.f27036a.c();
    }

    @Override // com.applovin.impl.i5
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.i5
    public Map e() {
        return this.f27036a.e();
    }

    @Override // com.applovin.impl.g5
    public int a(byte[] bArr, int i2, int i3) {
        if (this.e == 0) {
            if (!g()) {
                return -1;
            }
            this.e = this.f27037b;
        }
        int a2 = this.f27036a.a(bArr, i2, Math.min(this.e, i3));
        if (a2 != -1) {
            this.e -= a2;
        }
        return a2;
    }

    @Override // com.applovin.impl.i5
    public long a(l5 l5Var) {
        throw new UnsupportedOperationException();
    }
}
