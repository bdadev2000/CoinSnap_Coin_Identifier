package com.applovin.impl;

import com.applovin.impl.i2;
import com.google.common.primitives.UnsignedBytes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class gi extends i2 {

    /* loaded from: classes2.dex */
    public static final class b implements i2.f {

        /* renamed from: a, reason: collision with root package name */
        private final ho f24108a;

        /* renamed from: b, reason: collision with root package name */
        private final bh f24109b;

        private b(ho hoVar) {
            this.f24108a = hoVar;
            this.f24109b = new bh();
        }

        @Override // com.applovin.impl.i2.f
        public void a() {
            this.f24109b.a(xp.f27965f);
        }

        private i2.e a(bh bhVar, long j2, long j3) {
            int i2 = -1;
            int i3 = -1;
            long j4 = -9223372036854775807L;
            while (bhVar.a() >= 4) {
                if (gi.b(bhVar.c(), bhVar.d()) != 442) {
                    bhVar.g(1);
                } else {
                    bhVar.g(4);
                    long c2 = hi.c(bhVar);
                    if (c2 != -9223372036854775807L) {
                        long b2 = this.f24108a.b(c2);
                        if (b2 > j2) {
                            if (j4 == -9223372036854775807L) {
                                return i2.e.a(b2, j3);
                            }
                            return i2.e.a(j3 + i3);
                        }
                        if (100000 + b2 > j2) {
                            return i2.e.a(j3 + bhVar.d());
                        }
                        i3 = bhVar.d();
                        j4 = b2;
                    }
                    a(bhVar);
                    i2 = bhVar.d();
                }
            }
            if (j4 != -9223372036854775807L) {
                return i2.e.b(j4, j3 + i2);
            }
            return i2.e.d;
        }

        @Override // com.applovin.impl.i2.f
        public i2.e a(l8 l8Var, long j2) {
            long f2 = l8Var.f();
            int min = (int) Math.min(20000L, l8Var.a() - f2);
            this.f24109b.d(min);
            l8Var.c(this.f24109b.c(), 0, min);
            return a(this.f24109b, j2, f2);
        }

        private static void a(bh bhVar) {
            int b2;
            int e = bhVar.e();
            if (bhVar.a() < 10) {
                bhVar.f(e);
                return;
            }
            bhVar.g(9);
            int w = bhVar.w() & 7;
            if (bhVar.a() < w) {
                bhVar.f(e);
                return;
            }
            bhVar.g(w);
            if (bhVar.a() < 4) {
                bhVar.f(e);
                return;
            }
            if (gi.b(bhVar.c(), bhVar.d()) == 443) {
                bhVar.g(4);
                int C = bhVar.C();
                if (bhVar.a() < C) {
                    bhVar.f(e);
                    return;
                }
                bhVar.g(C);
            }
            while (bhVar.a() >= 4 && (b2 = gi.b(bhVar.c(), bhVar.d())) != 442 && b2 != 441 && (b2 >>> 8) == 1) {
                bhVar.g(4);
                if (bhVar.a() < 2) {
                    bhVar.f(e);
                    return;
                }
                bhVar.f(Math.min(bhVar.e(), bhVar.d() + bhVar.C()));
            }
        }
    }

    public gi(ho hoVar, long j2, long j3) {
        super(new i2.b(), new b(hoVar), j2, 0L, j2 + 1, 0L, j3, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i2) {
        return (bArr[i2 + 3] & UnsignedBytes.MAX_VALUE) | ((bArr[i2] & UnsignedBytes.MAX_VALUE) << 24) | ((bArr[i2 + 1] & UnsignedBytes.MAX_VALUE) << 16) | ((bArr[i2 + 2] & UnsignedBytes.MAX_VALUE) << 8);
    }
}
