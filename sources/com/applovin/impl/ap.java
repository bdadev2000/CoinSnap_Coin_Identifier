package com.applovin.impl;

import com.applovin.impl.i2;
import org.objectweb.asm.Opcodes;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class ap extends i2 {

    /* loaded from: classes2.dex */
    public static final class a implements i2.f {

        /* renamed from: a, reason: collision with root package name */
        private final ho f22920a;

        /* renamed from: b, reason: collision with root package name */
        private final bh f22921b = new bh();

        /* renamed from: c, reason: collision with root package name */
        private final int f22922c;
        private final int d;

        public a(int i2, ho hoVar, int i3) {
            this.f22922c = i2;
            this.f22920a = hoVar;
            this.d = i3;
        }

        @Override // com.applovin.impl.i2.f
        public void a() {
            this.f22921b.a(xp.f27965f);
        }

        private i2.e a(bh bhVar, long j2, long j3) {
            int a2;
            int a3;
            int e = bhVar.e();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (bhVar.a() >= 188 && (a3 = (a2 = ep.a(bhVar.c(), bhVar.d(), e)) + Opcodes.NEWARRAY) <= e) {
                long a4 = ep.a(bhVar, a2, this.f22922c);
                if (a4 != -9223372036854775807L) {
                    long b2 = this.f22920a.b(a4);
                    if (b2 > j2) {
                        if (j6 == -9223372036854775807L) {
                            return i2.e.a(b2, j3);
                        }
                        return i2.e.a(j3 + j5);
                    }
                    if (100000 + b2 > j2) {
                        return i2.e.a(j3 + a2);
                    }
                    j5 = a2;
                    j6 = b2;
                }
                bhVar.f(a3);
                j4 = a3;
            }
            if (j6 != -9223372036854775807L) {
                return i2.e.b(j6, j3 + j4);
            }
            return i2.e.d;
        }

        @Override // com.applovin.impl.i2.f
        public i2.e a(l8 l8Var, long j2) {
            long f2 = l8Var.f();
            int min = (int) Math.min(this.d, l8Var.a() - f2);
            this.f22921b.d(min);
            l8Var.c(this.f22921b.c(), 0, min);
            return a(this.f22921b, j2, f2);
        }
    }

    public ap(ho hoVar, long j2, long j3, int i2, int i3) {
        super(new i2.b(), new a(i2, hoVar, i3), j2, 0L, j2 + 1, 0L, j3, 188L, 940);
    }
}
