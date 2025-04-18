package com.applovin.impl;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class kb {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f5643b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f5644c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int[] f5645d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    private int f5646e = 15;

    private void b() {
        int[] iArr = this.f5645d;
        int length = iArr.length << 1;
        if (length >= 0) {
            int[] iArr2 = new int[length];
            int length2 = iArr.length;
            int i10 = this.a;
            int i11 = length2 - i10;
            System.arraycopy(iArr, i10, iArr2, 0, i11);
            System.arraycopy(this.f5645d, 0, iArr2, i11, i10);
            this.a = 0;
            this.f5643b = this.f5644c - 1;
            this.f5645d = iArr2;
            this.f5646e = length - 1;
            return;
        }
        throw new IllegalStateException();
    }

    public void a(int i10) {
        if (this.f5644c == this.f5645d.length) {
            b();
        }
        int i11 = (this.f5643b + 1) & this.f5646e;
        this.f5643b = i11;
        this.f5645d[i11] = i10;
        this.f5644c++;
    }

    public boolean c() {
        return this.f5644c == 0;
    }

    public int d() {
        int i10 = this.f5644c;
        if (i10 != 0) {
            int[] iArr = this.f5645d;
            int i11 = this.a;
            int i12 = iArr[i11];
            this.a = (i11 + 1) & this.f5646e;
            this.f5644c = i10 - 1;
            return i12;
        }
        throw new NoSuchElementException();
    }

    public void a() {
        this.a = 0;
        this.f5643b = -1;
        this.f5644c = 0;
    }
}
