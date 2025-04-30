package com.applovin.impl;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class kb {

    /* renamed from: a, reason: collision with root package name */
    private int f8615a = 0;
    private int b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f8616c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f8617d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f8618e = 15;

    private void b() {
        int[] iArr = this.f8617d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i9 = this.f8615a;
            int i10 = length2 - i9;
            System.arraycopy(iArr, i9, iArr2, 0, i10);
            System.arraycopy(this.f8617d, 0, iArr2, i10, i9);
            this.f8615a = 0;
            this.b = this.f8616c - 1;
            this.f8617d = iArr2;
            this.f8618e = length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i9) {
        if (this.f8616c == this.f8617d.length) {
            b();
        }
        int i10 = (this.b + 1) & this.f8618e;
        this.b = i10;
        this.f8617d[i10] = i9;
        this.f8616c++;
    }

    public boolean c() {
        if (this.f8616c == 0) {
            return true;
        }
        return false;
    }

    public int d() {
        int i9 = this.f8616c;
        if (i9 != 0) {
            int[] iArr = this.f8617d;
            int i10 = this.f8615a;
            int i11 = iArr[i10];
            this.f8615a = (i10 + 1) & this.f8618e;
            this.f8616c = i9 - 1;
            return i11;
        }
        throw new NoSuchElementException();
    }

    public void a() {
        this.f8615a = 0;
        this.b = -1;
        this.f8616c = 0;
    }
}
