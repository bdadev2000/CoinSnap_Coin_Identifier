package com.applovin.impl;

import com.applovin.impl.AbstractC0705h2;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class bp extends AbstractC0705h2 {

    /* loaded from: classes.dex */
    public static final class a implements AbstractC0705h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final io f6901a;
        private final yg b = new yg();

        /* renamed from: c, reason: collision with root package name */
        private final int f6902c;

        /* renamed from: d, reason: collision with root package name */
        private final int f6903d;

        public a(int i9, io ioVar, int i10) {
            this.f6902c = i9;
            this.f6901a = ioVar;
            this.f6903d = i10;
        }

        @Override // com.applovin.impl.AbstractC0705h2.f
        public void a() {
            this.b.a(yp.f12455f);
        }

        private AbstractC0705h2.e a(yg ygVar, long j7, long j9) {
            int a6;
            int a9;
            int e4 = ygVar.e();
            long j10 = -1;
            long j11 = -1;
            long j12 = -9223372036854775807L;
            while (ygVar.a() >= 188 && (a9 = (a6 = fp.a(ygVar.c(), ygVar.d(), e4)) + 188) <= e4) {
                long a10 = fp.a(ygVar, a6, this.f6902c);
                if (a10 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    long b = this.f6901a.b(a10);
                    if (b > j7) {
                        if (j12 == com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                            return AbstractC0705h2.e.a(b, j9);
                        }
                        return AbstractC0705h2.e.a(j9 + j11);
                    }
                    if (100000 + b > j7) {
                        return AbstractC0705h2.e.a(j9 + a6);
                    }
                    j11 = a6;
                    j12 = b;
                }
                ygVar.f(a9);
                j10 = a9;
            }
            if (j12 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                return AbstractC0705h2.e.b(j12, j9 + j10);
            }
            return AbstractC0705h2.e.f8047d;
        }

        @Override // com.applovin.impl.AbstractC0705h2.f
        public AbstractC0705h2.e a(j8 j8Var, long j7) {
            long f9 = j8Var.f();
            int min = (int) Math.min(this.f6903d, j8Var.a() - f9);
            this.b.d(min);
            j8Var.c(this.b.c(), 0, min);
            return a(this.b, j7, f9);
        }
    }

    public bp(io ioVar, long j7, long j9, int i9, int i10) {
        super(new AbstractC0705h2.b(), new a(i9, ioVar, i10), j7, 0L, j7 + 1, 0L, j9, 188L, 940);
    }
}
