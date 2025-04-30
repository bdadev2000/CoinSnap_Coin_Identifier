package com.applovin.impl;

import com.applovin.impl.AbstractC0705h2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class ci extends AbstractC0705h2 {

    /* loaded from: classes.dex */
    public static final class b implements AbstractC0705h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final io f7087a;
        private final yg b;

        private b(io ioVar) {
            this.f7087a = ioVar;
            this.b = new yg();
        }

        @Override // com.applovin.impl.AbstractC0705h2.f
        public void a() {
            this.b.a(yp.f12455f);
        }

        private AbstractC0705h2.e a(yg ygVar, long j7, long j9) {
            int i9 = -1;
            int i10 = -1;
            long j10 = -9223372036854775807L;
            while (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) != 442) {
                    ygVar.g(1);
                } else {
                    ygVar.g(4);
                    long c9 = di.c(ygVar);
                    if (c9 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                        long b = this.f7087a.b(c9);
                        if (b > j7) {
                            if (j10 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                                return AbstractC0705h2.e.a(b, j9);
                            }
                            return AbstractC0705h2.e.a(j9 + i10);
                        }
                        if (100000 + b > j7) {
                            return AbstractC0705h2.e.a(j9 + ygVar.d());
                        }
                        i10 = ygVar.d();
                        j10 = b;
                    }
                    a(ygVar);
                    i9 = ygVar.d();
                }
            }
            if (j10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return AbstractC0705h2.e.b(j10, j9 + i9);
            }
            return AbstractC0705h2.e.f8047d;
        }

        @Override // com.applovin.impl.AbstractC0705h2.f
        public AbstractC0705h2.e a(j8 j8Var, long j7) {
            long f9 = j8Var.f();
            int min = (int) Math.min(20000L, j8Var.a() - f9);
            this.b.d(min);
            j8Var.c(this.b.c(), 0, min);
            return a(this.b, j7, f9);
        }

        private static void a(yg ygVar) {
            int b;
            int e4 = ygVar.e();
            if (ygVar.a() < 10) {
                ygVar.f(e4);
                return;
            }
            ygVar.g(9);
            int w2 = ygVar.w() & 7;
            if (ygVar.a() < w2) {
                ygVar.f(e4);
                return;
            }
            ygVar.g(w2);
            if (ygVar.a() >= 4) {
                if (ci.b(ygVar.c(), ygVar.d()) == 443) {
                    ygVar.g(4);
                    int C8 = ygVar.C();
                    if (ygVar.a() < C8) {
                        ygVar.f(e4);
                        return;
                    }
                    ygVar.g(C8);
                }
                while (ygVar.a() >= 4 && (b = ci.b(ygVar.c(), ygVar.d())) != 442 && b != 441 && (b >>> 8) == 1) {
                    ygVar.g(4);
                    if (ygVar.a() < 2) {
                        ygVar.f(e4);
                        return;
                    }
                    ygVar.f(Math.min(ygVar.e(), ygVar.d() + ygVar.C()));
                }
                return;
            }
            ygVar.f(e4);
        }
    }

    public ci(io ioVar, long j7, long j9) {
        super(new AbstractC0705h2.b(), new b(ioVar), j7, 0L, j7 + 1, 0L, j9, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int b(byte[] bArr, int i9) {
        return (bArr[i9 + 3] & 255) | ((bArr[i9] & 255) << 24) | ((bArr[i9 + 1] & 255) << 16) | ((bArr[i9 + 2] & 255) << 8);
    }
}
