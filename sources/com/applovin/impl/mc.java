package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mc {

    /* renamed from: a, reason: collision with root package name */
    private int f8905a;
    private long[] b;

    public mc() {
        this(32);
    }

    public void a(long j7) {
        int i9 = this.f8905a;
        long[] jArr = this.b;
        if (i9 == jArr.length) {
            this.b = Arrays.copyOf(jArr, i9 * 2);
        }
        long[] jArr2 = this.b;
        int i10 = this.f8905a;
        this.f8905a = i10 + 1;
        jArr2[i10] = j7;
    }

    public long[] b() {
        return Arrays.copyOf(this.b, this.f8905a);
    }

    public mc(int i9) {
        this.b = new long[i9];
    }

    public long a(int i9) {
        if (i9 >= 0 && i9 < this.f8905a) {
            return this.b[i9];
        }
        StringBuilder p2 = Q7.n0.p(i9, "Invalid index ", ", size is ");
        p2.append(this.f8905a);
        throw new IndexOutOfBoundsException(p2.toString());
    }

    public int a() {
        return this.f8905a;
    }
}
