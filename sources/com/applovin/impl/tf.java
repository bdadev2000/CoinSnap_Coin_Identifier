package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
final class tf {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f8267b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f8268c;

    /* renamed from: d, reason: collision with root package name */
    public byte[] f8269d;

    /* renamed from: e, reason: collision with root package name */
    public int f8270e;

    public tf(int i10, int i11) {
        this.a = i10;
        byte[] bArr = new byte[i11 + 3];
        this.f8269d = bArr;
        bArr[2] = 1;
    }

    public void a(byte[] bArr, int i10, int i11) {
        if (this.f8267b) {
            int i12 = i11 - i10;
            byte[] bArr2 = this.f8269d;
            int length = bArr2.length;
            int i13 = this.f8270e + i12;
            if (length < i13) {
                this.f8269d = Arrays.copyOf(bArr2, i13 * 2);
            }
            System.arraycopy(bArr, i10, this.f8269d, this.f8270e, i12);
            this.f8270e += i12;
        }
    }

    public void b() {
        this.f8267b = false;
        this.f8268c = false;
    }

    public void b(int i10) {
        a1.b(!this.f8267b);
        boolean z10 = i10 == this.a;
        this.f8267b = z10;
        if (z10) {
            this.f8270e = 3;
            this.f8268c = false;
        }
    }

    public boolean a(int i10) {
        if (!this.f8267b) {
            return false;
        }
        this.f8270e -= i10;
        this.f8267b = false;
        this.f8268c = true;
        return true;
    }

    public boolean a() {
        return this.f8268c;
    }
}
