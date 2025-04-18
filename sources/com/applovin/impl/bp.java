package com.applovin.impl;

import com.applovin.impl.h2;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bp extends h2 {

    /* loaded from: classes.dex */
    public static final class a implements h2.f {
        private final io a;

        /* renamed from: b, reason: collision with root package name */
        private final yg f3919b = new yg();

        /* renamed from: c, reason: collision with root package name */
        private final int f3920c;

        /* renamed from: d, reason: collision with root package name */
        private final int f3921d;

        public a(int i10, io ioVar, int i11) {
            this.f3920c = i10;
            this.a = ioVar;
            this.f3921d = i11;
        }

        @Override // com.applovin.impl.h2.f
        public void a() {
            this.f3919b.a(yp.f9257f);
        }

        private h2.e a(yg ygVar, long j3, long j10) {
            int a;
            int a10;
            int e2 = ygVar.e();
            long j11 = -1;
            long j12 = -1;
            long j13 = -9223372036854775807L;
            while (ygVar.a() >= 188 && (a10 = (a = fp.a(ygVar.c(), ygVar.d(), e2)) + 188) <= e2) {
                long a11 = fp.a(ygVar, a, this.f3920c);
                if (a11 != C.TIME_UNSET) {
                    long b3 = this.a.b(a11);
                    if (b3 > j3) {
                        if (j13 == C.TIME_UNSET) {
                            return h2.e.a(b3, j10);
                        }
                        return h2.e.a(j10 + j12);
                    }
                    if (100000 + b3 > j3) {
                        return h2.e.a(j10 + a);
                    }
                    j12 = a;
                    j13 = b3;
                }
                ygVar.f(a10);
                j11 = a10;
            }
            if (j13 != C.TIME_UNSET) {
                return h2.e.b(j13, j10 + j11);
            }
            return h2.e.f5080d;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j3) {
            long f10 = j8Var.f();
            int min = (int) Math.min(this.f3921d, j8Var.a() - f10);
            this.f3919b.d(min);
            j8Var.c(this.f3919b.c(), 0, min);
            return a(this.f3919b, j3, f10);
        }
    }

    public bp(io ioVar, long j3, long j10, int i10, int i11) {
        super(new h2.b(), new a(i10, ioVar, i11), j3, 0L, j3 + 1, 0L, j10, 188L, 940);
    }
}
