package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes4.dex */
final class yf {

    /* renamed from: a, reason: collision with root package name */
    private final int f28197a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f28198b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f28199c;
    public byte[] d;
    public int e;

    public yf(int i2, int i3) {
        this.f28197a = i2;
        byte[] bArr = new byte[i3 + 3];
        this.d = bArr;
        bArr[2] = 1;
    }

    public boolean a() {
        return this.f28199c;
    }

    public void b() {
        this.f28198b = false;
        this.f28199c = false;
    }

    public boolean a(int i2) {
        if (!this.f28198b) {
            return false;
        }
        this.e -= i2;
        this.f28198b = false;
        this.f28199c = true;
        return true;
    }

    public void b(int i2) {
        b1.b(!this.f28198b);
        boolean z2 = i2 == this.f28197a;
        this.f28198b = z2;
        if (z2) {
            this.e = 3;
            this.f28199c = false;
        }
    }

    public void a(byte[] bArr, int i2, int i3) {
        if (this.f28198b) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.d;
            int length = bArr2.length;
            int i5 = this.e + i4;
            if (length < i5) {
                this.d = Arrays.copyOf(bArr2, i5 * 2);
            }
            System.arraycopy(bArr, i2, this.d, this.e, i4);
            this.e += i4;
        }
    }
}
