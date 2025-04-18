package com.applovin.impl;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rc {

    /* renamed from: a, reason: collision with root package name */
    private int f26284a;

    /* renamed from: b, reason: collision with root package name */
    private long[] f26285b;

    public rc() {
        this(32);
    }

    public int a() {
        return this.f26284a;
    }

    public long[] b() {
        return Arrays.copyOf(this.f26285b, this.f26284a);
    }

    public rc(int i2) {
        this.f26285b = new long[i2];
    }

    public void a(long j2) {
        int i2 = this.f26284a;
        long[] jArr = this.f26285b;
        if (i2 == jArr.length) {
            this.f26285b = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f26285b;
        int i3 = this.f26284a;
        this.f26284a = i3 + 1;
        jArr2[i3] = j2;
    }

    public long a(int i2) {
        if (i2 >= 0 && i2 < this.f26284a) {
            return this.f26285b[i2];
        }
        StringBuilder t2 = android.support.v4.media.d.t("Invalid index ", i2, ", size is ");
        t2.append(this.f26284a);
        throw new IndexOutOfBoundsException(t2.toString());
    }
}
