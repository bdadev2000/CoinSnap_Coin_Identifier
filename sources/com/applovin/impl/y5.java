package com.applovin.impl;

import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y5 implements n7 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f12335a = new byte[8];
    private final ArrayDeque b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final aq f12336c = new aq();

    /* renamed from: d, reason: collision with root package name */
    private m7 f12337d;

    /* renamed from: e, reason: collision with root package name */
    private int f12338e;

    /* renamed from: f, reason: collision with root package name */
    private int f12339f;

    /* renamed from: g, reason: collision with root package name */
    private long f12340g;

    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f12341a;
        private final long b;

        private b(int i9, long j7) {
            this.f12341a = i9;
            this.b = j7;
        }
    }

    private long b(j8 j8Var) {
        j8Var.b();
        while (true) {
            j8Var.c(this.f12335a, 0, 4);
            int a6 = aq.a(this.f12335a[0]);
            if (a6 != -1 && a6 <= 4) {
                int a9 = (int) aq.a(this.f12335a, a6, false);
                if (this.f12337d.c(a9)) {
                    j8Var.a(a6);
                    return a9;
                }
            }
            j8Var.a(1);
        }
    }

    private static String c(j8 j8Var, int i9) {
        if (i9 == 0) {
            return "";
        }
        byte[] bArr = new byte[i9];
        j8Var.d(bArr, 0, i9);
        while (i9 > 0 && bArr[i9 - 1] == 0) {
            i9--;
        }
        return new String(bArr, 0, i9);
    }

    @Override // com.applovin.impl.n7
    public void a(m7 m7Var) {
        this.f12337d = m7Var;
    }

    @Override // com.applovin.impl.n7
    public void reset() {
        this.f12338e = 0;
        this.b.clear();
        this.f12336c.b();
    }

    @Override // com.applovin.impl.n7
    public boolean a(j8 j8Var) {
        AbstractC0669a1.b(this.f12337d);
        while (true) {
            b bVar = (b) this.b.peek();
            if (bVar != null && j8Var.f() >= bVar.b) {
                this.f12337d.a(((b) this.b.pop()).f12341a);
                return true;
            }
            if (this.f12338e == 0) {
                long a6 = this.f12336c.a(j8Var, true, false, 4);
                if (a6 == -2) {
                    a6 = b(j8Var);
                }
                if (a6 == -1) {
                    return false;
                }
                this.f12339f = (int) a6;
                this.f12338e = 1;
            }
            if (this.f12338e == 1) {
                this.f12340g = this.f12336c.a(j8Var, false, true, 8);
                this.f12338e = 2;
            }
            int b8 = this.f12337d.b(this.f12339f);
            if (b8 != 0) {
                if (b8 == 1) {
                    long f9 = j8Var.f();
                    this.b.push(new b(this.f12339f, this.f12340g + f9));
                    this.f12337d.a(this.f12339f, f9, this.f12340g);
                    this.f12338e = 0;
                    return true;
                }
                if (b8 == 2) {
                    long j7 = this.f12340g;
                    if (j7 <= 8) {
                        this.f12337d.a(this.f12339f, b(j8Var, (int) j7));
                        this.f12338e = 0;
                        return true;
                    }
                    throw ah.a("Invalid integer size: " + this.f12340g, null);
                }
                if (b8 == 3) {
                    long j9 = this.f12340g;
                    if (j9 <= 2147483647L) {
                        this.f12337d.a(this.f12339f, c(j8Var, (int) j9));
                        this.f12338e = 0;
                        return true;
                    }
                    throw ah.a("String element size: " + this.f12340g, null);
                }
                if (b8 == 4) {
                    this.f12337d.a(this.f12339f, (int) this.f12340g, j8Var);
                    this.f12338e = 0;
                    return true;
                }
                if (b8 == 5) {
                    long j10 = this.f12340g;
                    if (j10 != 4 && j10 != 8) {
                        throw ah.a("Invalid float size: " + this.f12340g, null);
                    }
                    this.f12337d.a(this.f12339f, a(j8Var, (int) j10));
                    this.f12338e = 0;
                    return true;
                }
                throw ah.a("Invalid element type " + b8, null);
            }
            j8Var.a((int) this.f12340g);
            this.f12338e = 0;
        }
    }

    private long b(j8 j8Var, int i9) {
        j8Var.d(this.f12335a, 0, i9);
        long j7 = 0;
        for (int i10 = 0; i10 < i9; i10++) {
            j7 = (j7 << 8) | (this.f12335a[i10] & 255);
        }
        return j7;
    }

    private double a(j8 j8Var, int i9) {
        long b8 = b(j8Var, i9);
        if (i9 == 4) {
            return Float.intBitsToFloat((int) b8);
        }
        return Double.longBitsToDouble(b8);
    }
}
