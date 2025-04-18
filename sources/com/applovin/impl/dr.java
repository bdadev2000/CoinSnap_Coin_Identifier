package com.applovin.impl;

import kotlin.UByte;

/* loaded from: classes.dex */
public final class dr {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final int f4374b;

    /* renamed from: c, reason: collision with root package name */
    private int f4375c;

    /* renamed from: d, reason: collision with root package name */
    private int f4376d;

    public dr(byte[] bArr) {
        this.a = bArr;
        this.f4374b = bArr.length;
    }

    private void a() {
        int i10;
        int i11 = this.f4375c;
        a1.b(i11 >= 0 && (i11 < (i10 = this.f4374b) || (i11 == i10 && this.f4376d == 0)));
    }

    public int b() {
        return (this.f4375c * 8) + this.f4376d;
    }

    public boolean c() {
        boolean z10;
        if ((((this.a[this.f4375c] & UByte.MAX_VALUE) >> this.f4376d) & 1) == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        b(1);
        return z10;
    }

    public int a(int i10) {
        int i11 = this.f4375c;
        int min = Math.min(i10, 8 - this.f4376d);
        int i12 = i11 + 1;
        int i13 = ((this.a[i11] & UByte.MAX_VALUE) >> this.f4376d) & (255 >> (8 - min));
        while (min < i10) {
            i13 |= (this.a[i12] & UByte.MAX_VALUE) << min;
            min += 8;
            i12++;
        }
        int i14 = i13 & ((-1) >>> (32 - i10));
        b(i10);
        return i14;
    }

    public void b(int i10) {
        int i11 = i10 / 8;
        int i12 = this.f4375c + i11;
        this.f4375c = i12;
        int i13 = (i10 - (i11 * 8)) + this.f4376d;
        this.f4376d = i13;
        if (i13 > 7) {
            this.f4375c = i12 + 1;
            this.f4376d = i13 - 8;
        }
        a();
    }
}
