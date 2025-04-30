package com.applovin.impl;

/* loaded from: classes.dex */
final class aq {

    /* renamed from: d, reason: collision with root package name */
    private static final long[] f6778d = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f6779a = new byte[8];
    private int b;

    /* renamed from: c, reason: collision with root package name */
    private int f6780c;

    public static long a(byte[] bArr, int i9, boolean z8) {
        long j7 = bArr[0] & 255;
        if (z8) {
            j7 &= ~f6778d[i9 - 1];
        }
        for (int i10 = 1; i10 < i9; i10++) {
            j7 = (j7 << 8) | (bArr[i10] & 255);
        }
        return j7;
    }

    public void b() {
        this.b = 0;
        this.f6780c = 0;
    }

    public int a() {
        return this.f6780c;
    }

    public static int a(int i9) {
        long j7;
        int i10 = 0;
        do {
            long[] jArr = f6778d;
            if (i10 >= jArr.length) {
                return -1;
            }
            j7 = jArr[i10] & i9;
            i10++;
        } while (j7 == 0);
        return i10;
    }

    public long a(j8 j8Var, boolean z8, boolean z9, int i9) {
        if (this.b == 0) {
            if (!j8Var.a(this.f6779a, 0, 1, z8)) {
                return -1L;
            }
            int a6 = a(this.f6779a[0] & 255);
            this.f6780c = a6;
            if (a6 != -1) {
                this.b = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i10 = this.f6780c;
        if (i10 > i9) {
            this.b = 0;
            return -2L;
        }
        if (i10 != 1) {
            j8Var.d(this.f6779a, 1, i10 - 1);
        }
        this.b = 0;
        return a(this.f6779a, this.f6780c, z9);
    }
}
