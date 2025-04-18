package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes3.dex */
public final class cr {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f23371a;

    /* renamed from: b, reason: collision with root package name */
    private final int f23372b;

    /* renamed from: c, reason: collision with root package name */
    private int f23373c;
    private int d;

    public cr(byte[] bArr) {
        this.f23371a = bArr;
        this.f23372b = bArr.length;
    }

    private void a() {
        int i2;
        int i3 = this.f23373c;
        b1.b(i3 >= 0 && (i3 < (i2 = this.f23372b) || (i3 == i2 && this.d == 0)));
    }

    public int b() {
        return (this.f23373c * 8) + this.d;
    }

    public boolean c() {
        boolean z2 = (((this.f23371a[this.f23373c] & UnsignedBytes.MAX_VALUE) >> this.d) & 1) == 1;
        b(1);
        return z2;
    }

    public int a(int i2) {
        int i3 = this.f23373c;
        int min = Math.min(i2, 8 - this.d);
        int i4 = i3 + 1;
        int i5 = ((this.f23371a[i3] & UnsignedBytes.MAX_VALUE) >> this.d) & (255 >> (8 - min));
        while (min < i2) {
            i5 |= (this.f23371a[i4] & UnsignedBytes.MAX_VALUE) << min;
            min += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        b(i2);
        return i6;
    }

    public void b(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f23373c + i3;
        this.f23373c = i4;
        int i5 = (i2 - (i3 * 8)) + this.d;
        this.d = i5;
        if (i5 > 7) {
            this.f23373c = i4 + 1;
            this.d = i5 - 8;
        }
        a();
    }
}
