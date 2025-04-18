package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class hi {

    /* renamed from: c, reason: collision with root package name */
    private boolean f24319c;
    private boolean d;
    private boolean e;

    /* renamed from: a, reason: collision with root package name */
    private final ho f24317a = new ho(0);

    /* renamed from: f, reason: collision with root package name */
    private long f24320f = -9223372036854775807L;

    /* renamed from: g, reason: collision with root package name */
    private long f24321g = -9223372036854775807L;

    /* renamed from: h, reason: collision with root package name */
    private long f24322h = -9223372036854775807L;

    /* renamed from: b, reason: collision with root package name */
    private final bh f24318b = new bh();

    public long a() {
        return this.f24322h;
    }

    public ho b() {
        return this.f24317a;
    }

    public boolean c() {
        return this.f24319c;
    }

    private static boolean a(byte[] bArr) {
        return (bArr[0] & 196) == 68 && (bArr[2] & 4) == 4 && (bArr[4] & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3;
    }

    private int b(l8 l8Var, th thVar) {
        int min = (int) Math.min(20000L, l8Var.a());
        long j2 = 0;
        if (l8Var.f() != j2) {
            thVar.f27165a = j2;
            return 1;
        }
        this.f24318b.d(min);
        l8Var.b();
        l8Var.c(this.f24318b.c(), 0, min);
        this.f24320f = a(this.f24318b);
        this.d = true;
        return 0;
    }

    private int c(l8 l8Var, th thVar) {
        long a2 = l8Var.a();
        int min = (int) Math.min(20000L, a2);
        long j2 = a2 - min;
        if (l8Var.f() != j2) {
            thVar.f27165a = j2;
            return 1;
        }
        this.f24318b.d(min);
        l8Var.b();
        l8Var.c(this.f24318b.c(), 0, min);
        this.f24321g = b(this.f24318b);
        this.e = true;
        return 0;
    }

    private int a(l8 l8Var) {
        this.f24318b.a(xp.f27965f);
        this.f24319c = true;
        l8Var.b();
        return 0;
    }

    private int a(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }

    private long b(bh bhVar) {
        int d = bhVar.d();
        for (int e = bhVar.e() - 4; e >= d; e--) {
            if (a(bhVar.c(), e) == 442) {
                bhVar.f(e + 4);
                long c2 = c(bhVar);
                if (c2 != -9223372036854775807L) {
                    return c2;
                }
            }
        }
        return -9223372036854775807L;
    }

    public static long c(bh bhVar) {
        int d = bhVar.d();
        if (bhVar.a() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        bhVar.a(bArr, 0, 9);
        bhVar.f(d);
        if (a(bArr)) {
            return b(bArr);
        }
        return -9223372036854775807L;
    }

    public int a(l8 l8Var, th thVar) {
        if (!this.e) {
            return c(l8Var, thVar);
        }
        if (this.f24321g == -9223372036854775807L) {
            return a(l8Var);
        }
        if (!this.d) {
            return b(l8Var, thVar);
        }
        long j2 = this.f24320f;
        if (j2 == -9223372036854775807L) {
            return a(l8Var);
        }
        long b2 = this.f24317a.b(this.f24321g) - this.f24317a.b(j2);
        this.f24322h = b2;
        if (b2 < 0) {
            pc.d("PsDurationReader", "Invalid duration: " + this.f24322h + ". Using TIME_UNSET instead.");
            this.f24322h = -9223372036854775807L;
        }
        return a(l8Var);
    }

    private static long b(byte[] bArr) {
        long j2 = bArr[0];
        long j3 = ((j2 & 3) << 28) | (((56 & j2) >> 3) << 30) | ((bArr[1] & 255) << 20);
        long j4 = bArr[2];
        return j3 | (((j4 & 248) >> 3) << 15) | ((j4 & 3) << 13) | ((bArr[3] & 255) << 5) | ((bArr[4] & 248) >> 3);
    }

    private long a(bh bhVar) {
        int e = bhVar.e();
        for (int d = bhVar.d(); d < e - 3; d++) {
            if (a(bhVar.c(), d) == 442) {
                bhVar.f(d + 4);
                long c2 = c(bhVar);
                if (c2 != -9223372036854775807L) {
                    return c2;
                }
            }
        }
        return -9223372036854775807L;
    }
}
