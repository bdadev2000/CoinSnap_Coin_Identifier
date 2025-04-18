package com.applovin.impl;

import com.applovin.impl.h2;
import com.applovin.impl.u8;
import java.util.Objects;

/* loaded from: classes.dex */
final class s8 extends h2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(y8 y8Var, int i10, long j3, long j10) {
        super(new js(y8Var, 12), new b(y8Var, i10), y8Var.b(), 0L, y8Var.f9157j, j3, j10, y8Var.a(), Math.max(6, y8Var.f9150c));
        Objects.requireNonNull(y8Var);
    }

    /* loaded from: classes.dex */
    public static final class b implements h2.f {
        private final y8 a;

        /* renamed from: b, reason: collision with root package name */
        private final int f7452b;

        /* renamed from: c, reason: collision with root package name */
        private final u8.a f7453c;

        private b(y8 y8Var, int i10) {
            this.a = y8Var;
            this.f7452b = i10;
            this.f7453c = new u8.a();
        }

        private long a(j8 j8Var) {
            while (j8Var.d() < j8Var.a() - 6 && !u8.a(j8Var, this.a, this.f7452b, this.f7453c)) {
                j8Var.c(1);
            }
            if (j8Var.d() >= j8Var.a() - 6) {
                j8Var.c((int) (j8Var.a() - j8Var.d()));
                return this.a.f9157j;
            }
            return this.f7453c.a;
        }

        @Override // com.applovin.impl.h2.f
        public h2.e a(j8 j8Var, long j3) {
            long f10 = j8Var.f();
            long a = a(j8Var);
            long d10 = j8Var.d();
            j8Var.c(Math.max(6, this.a.f9150c));
            long a10 = a(j8Var);
            long d11 = j8Var.d();
            if (a <= j3 && a10 > j3) {
                return h2.e.a(d10);
            }
            if (a10 <= j3) {
                return h2.e.b(a10, d11);
            }
            return h2.e.a(a, f10);
        }
    }
}
