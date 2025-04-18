package com.applovin.impl;

import com.applovin.impl.h2;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import kotlin.UByte;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ci extends h2 {

    /* loaded from: classes.dex */
    public static final class b implements h2.f {
        private final io a;

        /* renamed from: b, reason: collision with root package name */
        private final yg f4102b;

        private b(io ioVar) {
            this.a = ioVar;
            this.f4102b = new yg();
        }

        @Override // com.applovin.impl.h2.f
        public void a() {
            this.f4102b.a(yp.f9257f);
        }

        private h2.e a(yg ygVar, long j3, long j10) {
            int i10 = -1;
            int i11 = -1;
            long j11 = -9223372036854775807L;
            while (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) != 442) {
                    ygVar.g(1);
                } else {
                    ygVar.g(4);
                    long c10 = di.c(ygVar);
                    if (c10 != C.TIME_UNSET) {
                        long b3 = this.a.b(c10);
                        if (b3 > j3) {
                            if (j11 == C.TIME_UNSET) {
                                return h2.e.a(b3, j10);
                            }
                            return h2.e.a(j10 + i11);
                        }
                        if (100000 + b3 > j3) {
                            return h2.e.a(j10 + ygVar.d());
                        }
                        i11 = ygVar.d();
                        j11 = b3;
                    }
                    a(ygVar);
                    i10 = ygVar.d();
                }
            }
            if (j11 != C.TIME_UNSET) {
                return h2.e.b(j11, j10 + i10);
            }
            return h2.e.f5080d;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j3) {
            long f10 = j8Var.f();
            int min = (int) Math.min(20000L, j8Var.a() - f10);
            this.f4102b.d(min);
            j8Var.c(this.f4102b.c(), 0, min);
            return a(this.f4102b, j3, f10);
        }

        private static void a(yg ygVar) {
            int b3;
            int e2 = ygVar.e();
            if (ygVar.a() < 10) {
                ygVar.f(e2);
                return;
            }
            ygVar.g(9);
            int w10 = ygVar.w() & 7;
            if (ygVar.a() < w10) {
                ygVar.f(e2);
                return;
            }
            ygVar.g(w10);
            if (ygVar.a() < 4) {
                ygVar.f(e2);
                return;
            }
            if (ci.b(ygVar.c(), ygVar.d()) == 443) {
                ygVar.g(4);
                int C = ygVar.C();
                if (ygVar.a() < C) {
                    ygVar.f(e2);
                    return;
                }
                ygVar.g(C);
            }
            while (ygVar.a() >= 4 && (b3 = ci.b(ygVar.c(), ygVar.d())) != 442 && b3 != 441 && (b3 >>> 8) == 1) {
                ygVar.g(4);
                if (ygVar.a() < 2) {
                    ygVar.f(e2);
                    return;
                }
                ygVar.f(Math.min(ygVar.e(), ygVar.d() + ygVar.C()));
            }
        }
    }

    public ci(io ioVar, long j3, long j10) {
        super(new h2.b(), new b(ioVar), j3, 0L, j3 + 1, 0L, j10, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & UByte.MAX_VALUE) | ((bArr[i10] & UByte.MAX_VALUE) << 24) | ((bArr[i10 + 1] & UByte.MAX_VALUE) << 16) | ((bArr[i10 + 2] & UByte.MAX_VALUE) << 8);
    }
}
