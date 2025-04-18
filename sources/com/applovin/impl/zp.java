package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;

/* loaded from: classes4.dex */
final class zp {
    private static final long[] d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f28383a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f28384b;

    /* renamed from: c, reason: collision with root package name */
    private int f28385c;

    public int a() {
        return this.f28385c;
    }

    public void b() {
        this.f28384b = 0;
        this.f28385c = 0;
    }

    public static long a(byte[] bArr, int i2, boolean z2) {
        long j2 = bArr[0] & 255;
        if (z2) {
            j2 &= ~d[i2 - 1];
        }
        for (int i3 = 1; i3 < i2; i3++) {
            j2 = (j2 << 8) | (bArr[i3] & 255);
        }
        return j2;
    }

    public static int a(int i2) {
        long j2;
        int i3 = 0;
        do {
            long[] jArr = d;
            if (i3 >= jArr.length) {
                return -1;
            }
            j2 = jArr[i3] & i2;
            i3++;
        } while (j2 == 0);
        return i3;
    }

    public long a(l8 l8Var, boolean z2, boolean z3, int i2) {
        if (this.f28384b == 0) {
            if (!l8Var.a(this.f28383a, 0, 1, z2)) {
                return -1L;
            }
            int a2 = a(this.f28383a[0] & UnsignedBytes.MAX_VALUE);
            this.f28385c = a2;
            if (a2 == -1) {
                throw new IllegalStateException("No valid varint length mask found");
            }
            this.f28384b = 1;
        }
        int i3 = this.f28385c;
        if (i3 > i2) {
            this.f28384b = 0;
            return -2L;
        }
        if (i3 != 1) {
            l8Var.d(this.f28383a, 1, i3 - 1);
        }
        this.f28384b = 0;
        return a(this.f28383a, this.f28385c, z3);
    }
}
