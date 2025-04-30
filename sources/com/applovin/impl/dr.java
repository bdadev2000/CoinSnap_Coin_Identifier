package com.applovin.impl;

/* loaded from: classes.dex */
public final class dr {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f7362a;
    private final int b;

    /* renamed from: c, reason: collision with root package name */
    private int f7363c;

    /* renamed from: d, reason: collision with root package name */
    private int f7364d;

    public dr(byte[] bArr) {
        this.f7362a = bArr;
        this.b = bArr.length;
    }

    private void a() {
        int i9;
        int i10 = this.f7363c;
        AbstractC0669a1.b(i10 >= 0 && (i10 < (i9 = this.b) || (i10 == i9 && this.f7364d == 0)));
    }

    public int b() {
        return (this.f7363c * 8) + this.f7364d;
    }

    public boolean c() {
        boolean z8;
        if ((((this.f7362a[this.f7363c] & 255) >> this.f7364d) & 1) == 1) {
            z8 = true;
        } else {
            z8 = false;
        }
        b(1);
        return z8;
    }

    public int a(int i9) {
        int i10 = this.f7363c;
        int min = Math.min(i9, 8 - this.f7364d);
        int i11 = i10 + 1;
        int i12 = ((this.f7362a[i10] & 255) >> this.f7364d) & (255 >> (8 - min));
        while (min < i9) {
            i12 |= (this.f7362a[i11] & 255) << min;
            min += 8;
            i11++;
        }
        int i13 = i12 & ((-1) >>> (32 - i9));
        b(i9);
        return i13;
    }

    public void b(int i9) {
        int i10 = i9 / 8;
        int i11 = this.f7363c + i10;
        this.f7363c = i11;
        int i12 = (i9 - (i10 * 8)) + this.f7364d;
        this.f7364d = i12;
        if (i12 > 7) {
            this.f7363c = i11 + 1;
            this.f7364d = i12 - 8;
        }
        a();
    }
}
