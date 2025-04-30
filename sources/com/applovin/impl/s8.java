package com.applovin.impl;

import com.applovin.impl.AbstractC0705h2;
import com.applovin.impl.u8;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class s8 extends AbstractC0705h2 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s8(y8 y8Var, int i9, long j7, long j9) {
        super(new C(y8Var, 12), new b(y8Var, i9), y8Var.b(), 0L, y8Var.f12360j, j7, j9, y8Var.a(), Math.max(6, y8Var.f12353c));
        Objects.requireNonNull(y8Var);
    }

    /* loaded from: classes.dex */
    public static final class b implements AbstractC0705h2.f {

        /* renamed from: a, reason: collision with root package name */
        private final y8 f10577a;
        private final int b;

        /* renamed from: c, reason: collision with root package name */
        private final u8.a f10578c;

        private b(y8 y8Var, int i9) {
            this.f10577a = y8Var;
            this.b = i9;
            this.f10578c = new u8.a();
        }

        private long a(j8 j8Var) {
            while (j8Var.d() < j8Var.a() - 6 && !u8.a(j8Var, this.f10577a, this.b, this.f10578c)) {
                j8Var.c(1);
            }
            if (j8Var.d() >= j8Var.a() - 6) {
                j8Var.c((int) (j8Var.a() - j8Var.d()));
                return this.f10577a.f12360j;
            }
            return this.f10578c.f11576a;
        }

        @Override // com.applovin.impl.AbstractC0705h2.f
        public AbstractC0705h2.e a(j8 j8Var, long j7) {
            long f9 = j8Var.f();
            long a6 = a(j8Var);
            long d2 = j8Var.d();
            j8Var.c(Math.max(6, this.f10577a.f12353c));
            long a9 = a(j8Var);
            long d9 = j8Var.d();
            if (a6 <= j7 && a9 > j7) {
                return AbstractC0705h2.e.a(d2);
            }
            if (a9 <= j7) {
                return AbstractC0705h2.e.b(a9, d9);
            }
            return AbstractC0705h2.e.a(a6, f9);
        }
    }
}
