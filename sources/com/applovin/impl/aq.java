package com.applovin.impl;

import kotlin.UByte;

/* loaded from: classes.dex */
final class aq {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f3787d = {128, 64, 32, 16, 8, 4, 2, 1};
    private final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private int f3788b;

    /* renamed from: c, reason: collision with root package name */
    private int f3789c;

    public static long a(byte[] bArr, int i10, boolean z10) {
        long j3 = bArr[0] & 255;
        if (z10) {
            j3 &= ~f3787d[i10 - 1];
        }
        for (int i11 = 1; i11 < i10; i11++) {
            j3 = (j3 << 8) | (bArr[i11] & 255);
        }
        return j3;
    }

    public void b() {
        this.f3788b = 0;
        this.f3789c = 0;
    }

    public int a() {
        return this.f3789c;
    }

    public static int a(int i10) {
        long j3;
        int i11 = 0;
        do {
            long[] jArr = f3787d;
            if (i11 >= jArr.length) {
                return -1;
            }
            j3 = jArr[i11] & i10;
            i11++;
        } while (j3 == 0);
        return i11;
    }

    public long a(j8 j8Var, boolean z10, boolean z11, int i10) {
        if (this.f3788b == 0) {
            if (!j8Var.a(this.a, 0, 1, z10)) {
                return -1L;
            }
            int a = a(this.a[0] & UByte.MAX_VALUE);
            this.f3789c = a;
            if (a != -1) {
                this.f3788b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i11 = this.f3789c;
        if (i11 > i10) {
            this.f3788b = 0;
            return -2L;
        }
        if (i11 != 1) {
            j8Var.d(this.a, 1, i11 - 1);
        }
        this.f3788b = 0;
        return a(this.a, this.f3789c, z11);
    }
}
