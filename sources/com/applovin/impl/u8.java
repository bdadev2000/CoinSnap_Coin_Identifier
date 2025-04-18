package com.applovin.impl;

import com.applovin.impl.i2;
import com.applovin.impl.w8;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class u8 extends i2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(a9 a9Var, int i2, long j2, long j3) {
        super(new is(a9Var, 12), new b(a9Var, i2), a9Var.b(), 0L, a9Var.f22718j, j2, j3, a9Var.a(), Math.max(6, a9Var.f22713c));
        Objects.requireNonNull(a9Var);
    }

    /* loaded from: classes2.dex */
    public static final class b implements i2.f {

        /* renamed from: a, reason: collision with root package name */
        private final a9 f27283a;

        /* renamed from: b, reason: collision with root package name */
        private final int f27284b;

        /* renamed from: c, reason: collision with root package name */
        private final w8.a f27285c;

        private b(a9 a9Var, int i2) {
            this.f27283a = a9Var;
            this.f27284b = i2;
            this.f27285c = new w8.a();
        }

        private long a(l8 l8Var) {
            while (l8Var.d() < l8Var.a() - 6 && !w8.a(l8Var, this.f27283a, this.f27284b, this.f27285c)) {
                l8Var.c(1);
            }
            if (l8Var.d() >= l8Var.a() - 6) {
                l8Var.c((int) (l8Var.a() - l8Var.d()));
                return this.f27283a.f22718j;
            }
            return this.f27285c.f27708a;
        }

        @Override // com.applovin.impl.i2.f
        public i2.e a(l8 l8Var, long j2) {
            long f2 = l8Var.f();
            long a2 = a(l8Var);
            long d = l8Var.d();
            l8Var.c(Math.max(6, this.f27283a.f22713c));
            long a3 = a(l8Var);
            long d2 = l8Var.d();
            if (a2 <= j2 && a3 > j2) {
                return i2.e.a(d);
            }
            if (a3 <= j2) {
                return i2.e.b(a3, d2);
            }
            return i2.e.a(a2, f2);
        }
    }
}
