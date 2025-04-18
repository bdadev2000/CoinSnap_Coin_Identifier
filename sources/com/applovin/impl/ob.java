package com.applovin.impl;

import java.util.NoSuchElementException;

/* loaded from: classes.dex */
final class ob {

    /* renamed from: a, reason: collision with root package name */
    private int f25821a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f25822b = -1;

    /* renamed from: c, reason: collision with root package name */
    private int f25823c = 0;
    private int[] d = new int[16];
    private int e = 15;

    private void b() {
        int[] iArr = this.d;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i2 = this.f25821a;
        int i3 = length2 - i2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.d, 0, iArr2, i3, i2);
        this.f25821a = 0;
        this.f25822b = this.f25823c - 1;
        this.d = iArr2;
        this.e = length - 1;
    }

    public void a() {
        this.f25821a = 0;
        this.f25822b = -1;
        this.f25823c = 0;
    }

    public boolean c() {
        return this.f25823c == 0;
    }

    public int d() {
        int i2 = this.f25823c;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.d;
        int i3 = this.f25821a;
        int i4 = iArr[i3];
        this.f25821a = (i3 + 1) & this.e;
        this.f25823c = i2 - 1;
        return i4;
    }

    public void a(int i2) {
        if (this.f25823c == this.d.length) {
            b();
        }
        int i3 = (this.f25822b + 1) & this.e;
        this.f25822b = i3;
        this.d[i3] = i2;
        this.f25823c++;
    }
}
