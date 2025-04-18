package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import java.util.ArrayDeque;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a6 implements p7 {

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f22692a = new byte[8];

    /* renamed from: b, reason: collision with root package name */
    private final ArrayDeque f22693b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    private final zp f22694c = new zp();
    private o7 d;
    private int e;

    /* renamed from: f, reason: collision with root package name */
    private int f22695f;

    /* renamed from: g, reason: collision with root package name */
    private long f22696g;

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final int f22697a;

        /* renamed from: b, reason: collision with root package name */
        private final long f22698b;

        private b(int i2, long j2) {
            this.f22697a = i2;
            this.f22698b = j2;
        }
    }

    private long b(l8 l8Var) {
        l8Var.b();
        while (true) {
            l8Var.c(this.f22692a, 0, 4);
            int a2 = zp.a(this.f22692a[0]);
            if (a2 != -1 && a2 <= 4) {
                int a3 = (int) zp.a(this.f22692a, a2, false);
                if (this.d.c(a3)) {
                    l8Var.a(a2);
                    return a3;
                }
            }
            l8Var.a(1);
        }
    }

    private static String c(l8 l8Var, int i2) {
        if (i2 == 0) {
            return "";
        }
        byte[] bArr = new byte[i2];
        l8Var.d(bArr, 0, i2);
        while (i2 > 0 && bArr[i2 - 1] == 0) {
            i2--;
        }
        return new String(bArr, 0, i2);
    }

    @Override // com.applovin.impl.p7
    public void a(o7 o7Var) {
        this.d = o7Var;
    }

    @Override // com.applovin.impl.p7
    public void reset() {
        this.e = 0;
        this.f22693b.clear();
        this.f22694c.b();
    }

    @Override // com.applovin.impl.p7
    public boolean a(l8 l8Var) {
        b1.b(this.d);
        while (true) {
            b bVar = (b) this.f22693b.peek();
            if (bVar != null && l8Var.f() >= bVar.f22698b) {
                this.d.a(((b) this.f22693b.pop()).f22697a);
                return true;
            }
            if (this.e == 0) {
                long a2 = this.f22694c.a(l8Var, true, false, 4);
                if (a2 == -2) {
                    a2 = b(l8Var);
                }
                if (a2 == -1) {
                    return false;
                }
                this.f22695f = (int) a2;
                this.e = 1;
            }
            if (this.e == 1) {
                this.f22696g = this.f22694c.a(l8Var, false, true, 8);
                this.e = 2;
            }
            int b2 = this.d.b(this.f22695f);
            if (b2 != 0) {
                if (b2 == 1) {
                    long f2 = l8Var.f();
                    this.f22693b.push(new b(this.f22695f, this.f22696g + f2));
                    this.d.a(this.f22695f, f2, this.f22696g);
                    this.e = 0;
                    return true;
                }
                if (b2 == 2) {
                    long j2 = this.f22696g;
                    if (j2 <= 8) {
                        this.d.a(this.f22695f, b(l8Var, (int) j2));
                        this.e = 0;
                        return true;
                    }
                    throw dh.a("Invalid integer size: " + this.f22696g, null);
                }
                if (b2 == 3) {
                    long j3 = this.f22696g;
                    if (j3 <= 2147483647L) {
                        this.d.a(this.f22695f, c(l8Var, (int) j3));
                        this.e = 0;
                        return true;
                    }
                    throw dh.a("String element size: " + this.f22696g, null);
                }
                if (b2 == 4) {
                    this.d.a(this.f22695f, (int) this.f22696g, l8Var);
                    this.e = 0;
                    return true;
                }
                if (b2 != 5) {
                    throw dh.a("Invalid element type " + b2, null);
                }
                long j4 = this.f22696g;
                if (j4 != 4 && j4 != 8) {
                    throw dh.a("Invalid float size: " + this.f22696g, null);
                }
                this.d.a(this.f22695f, a(l8Var, (int) j4));
                this.e = 0;
                return true;
            }
            l8Var.a((int) this.f22696g);
            this.e = 0;
        }
    }

    private long b(l8 l8Var, int i2) {
        l8Var.d(this.f22692a, 0, i2);
        long j2 = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            j2 = (j2 << 8) | (this.f22692a[i3] & UnsignedBytes.MAX_VALUE);
        }
        return j2;
    }

    private double a(l8 l8Var, int i2) {
        long b2 = b(l8Var, i2);
        if (i2 == 4) {
            return Float.intBitsToFloat((int) b2);
        }
        return Double.longBitsToDouble(b2);
    }
}
