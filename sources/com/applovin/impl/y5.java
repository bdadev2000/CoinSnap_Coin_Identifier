package com.applovin.impl;

import java.util.ArrayDeque;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y5 implements n7 {
    private final byte[] a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f9131b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final aq f9132c = new aq();

    /* renamed from: d, reason: collision with root package name */
    private m7 f9133d;

    /* renamed from: e, reason: collision with root package name */
    private int f9134e;

    /* renamed from: f, reason: collision with root package name */
    private int f9135f;

    /* renamed from: g, reason: collision with root package name */
    private long f9136g;

    /* loaded from: classes.dex */
    public static final class b {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final long f9137b;

        private b(int i10, long j3) {
            this.a = i10;
            this.f9137b = j3;
        }
    }

    private long b(j8 j8Var) {
        j8Var.b();
        while (true) {
            j8Var.c(this.a, 0, 4);
            int a10 = aq.a(this.a[0]);
            if (a10 != -1 && a10 <= 4) {
                int a11 = (int) aq.a(this.a, a10, false);
                if (this.f9133d.c(a11)) {
                    j8Var.a(a10);
                    return a11;
                }
            }
            j8Var.a(1);
        }
    }

    private static String c(j8 j8Var, int i10) {
        if (i10 == 0) {
            return "";
        }
        byte[] bArr = new byte[i10];
        j8Var.d(bArr, 0, i10);
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        return new String(bArr, 0, i10);
    }

    @Override // com.applovin.impl.n7
    public void a(m7 m7Var) {
        this.f9133d = m7Var;
    }

    @Override // com.applovin.impl.n7
    public void reset() {
        this.f9134e = 0;
        this.f9131b.clear();
        this.f9132c.b();
    }

    @Override // com.applovin.impl.n7
    public boolean a(j8 j8Var) {
        a1.b(this.f9133d);
        while (true) {
            b bVar = (b) this.f9131b.peek();
            if (bVar != null && j8Var.f() >= bVar.f9137b) {
                this.f9133d.a(((b) this.f9131b.pop()).a);
                return true;
            }
            if (this.f9134e == 0) {
                long a10 = this.f9132c.a(j8Var, true, false, 4);
                if (a10 == -2) {
                    a10 = b(j8Var);
                }
                if (a10 == -1) {
                    return false;
                }
                this.f9135f = (int) a10;
                this.f9134e = 1;
            }
            if (this.f9134e == 1) {
                this.f9136g = this.f9132c.a(j8Var, false, true, 8);
                this.f9134e = 2;
            }
            int b3 = this.f9133d.b(this.f9135f);
            if (b3 != 0) {
                if (b3 == 1) {
                    long f10 = j8Var.f();
                    this.f9131b.push(new b(this.f9135f, this.f9136g + f10));
                    this.f9133d.a(this.f9135f, f10, this.f9136g);
                    this.f9134e = 0;
                    return true;
                }
                if (b3 == 2) {
                    long j3 = this.f9136g;
                    if (j3 <= 8) {
                        this.f9133d.a(this.f9135f, b(j8Var, (int) j3));
                        this.f9134e = 0;
                        return true;
                    }
                    throw ah.a("Invalid integer size: " + this.f9136g, null);
                }
                if (b3 == 3) {
                    long j10 = this.f9136g;
                    if (j10 <= 2147483647L) {
                        this.f9133d.a(this.f9135f, c(j8Var, (int) j10));
                        this.f9134e = 0;
                        return true;
                    }
                    throw ah.a("String element size: " + this.f9136g, null);
                }
                if (b3 == 4) {
                    this.f9133d.a(this.f9135f, (int) this.f9136g, j8Var);
                    this.f9134e = 0;
                    return true;
                }
                if (b3 == 5) {
                    long j11 = this.f9136g;
                    if (j11 != 4 && j11 != 8) {
                        throw ah.a("Invalid float size: " + this.f9136g, null);
                    }
                    this.f9133d.a(this.f9135f, a(j8Var, (int) j11));
                    this.f9134e = 0;
                    return true;
                }
                throw ah.a("Invalid element type " + b3, null);
            }
            j8Var.a((int) this.f9136g);
            this.f9134e = 0;
        }
    }

    private long b(j8 j8Var, int i10) {
        j8Var.d(this.a, 0, i10);
        long j3 = 0;
        for (int i11 = 0; i11 < i10; i11++) {
            j3 = (j3 << 8) | (this.a[i11] & UByte.MAX_VALUE);
        }
        return j3;
    }

    private double a(j8 j8Var, int i10) {
        long b3 = b(j8Var, i10);
        if (i10 == 4) {
            return Float.intBitsToFloat((int) b3);
        }
        return Double.longBitsToDouble(b3);
    }
}
