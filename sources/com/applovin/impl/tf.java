package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
final class tf {

    /* renamed from: a, reason: collision with root package name */
    private final int f11482a;
    private boolean b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f11483c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f11484d;

    /* renamed from: e, reason: collision with root package name */
    public int f11485e;

    public tf(int i9, int i10) {
        this.f11482a = i9;
        byte[] bArr = new byte[i10 + 3];
        this.f11484d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i9, int i10) {
        if (this.b) {
            int i11 = i10 - i9;
            byte[] bArr2 = this.f11484d;
            int length = bArr2.length;
            int i12 = this.f11485e + i11;
            if (length < i12) {
                this.f11484d = Arrays.copyOf(bArr2, i12 * 2);
            }
            System.arraycopy(bArr, i9, this.f11484d, this.f11485e, i11);
            this.f11485e += i11;
        }
    }

    public void b() {
        this.b = false;
        this.f11483c = false;
    }

    public void b(int i9) {
        AbstractC0669a1.b(!this.b);
        boolean z8 = i9 == this.f11482a;
        this.b = z8;
        if (z8) {
            this.f11485e = 3;
            this.f11483c = false;
        }
    }

    public boolean a(int i9) {
        if (!this.b) {
            return false;
        }
        this.f11485e -= i9;
        this.b = false;
        this.f11483c = true;
        return true;
    }

    public boolean a() {
        return this.f11483c;
    }
}
