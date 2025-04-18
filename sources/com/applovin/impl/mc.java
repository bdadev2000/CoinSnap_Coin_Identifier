package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes.dex */
public final class mc {
    private int a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f5955b;

    public mc() {
        this(32);
    }

    public void a(long j3) {
        int i10 = this.a;
        long[] jArr = this.f5955b;
        if (i10 == jArr.length) {
            this.f5955b = Arrays.copyOf(jArr, i10 * 2);
        }
        long[] jArr2 = this.f5955b;
        int i11 = this.a;
        this.a = i11 + 1;
        jArr2[i11] = j3;
    }

    public long[] b() {
        return Arrays.copyOf(this.f5955b, this.a);
    }

    public mc(int i10) {
        this.f5955b = new long[i10];
    }

    public long a(int i10) {
        if (i10 >= 0 && i10 < this.a) {
            return this.f5955b[i10];
        }
        StringBuilder m10 = a4.j.m("Invalid index ", i10, ", size is ");
        m10.append(this.a);
        throw new IndexOutOfBoundsException(m10.toString());
    }

    public int a() {
        return this.a;
    }
}
