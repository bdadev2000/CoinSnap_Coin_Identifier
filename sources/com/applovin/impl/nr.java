package com.applovin.impl;

import android.util.Pair;

/* loaded from: classes.dex */
abstract class nr {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f25786a;

        /* renamed from: b, reason: collision with root package name */
        public final long f25787b;

        private a(int i2, long j2) {
            this.f25786a = i2;
            this.f25787b = j2;
        }

        public static a a(l8 l8Var, bh bhVar) {
            l8Var.c(bhVar.c(), 0, 8);
            bhVar.f(0);
            return new a(bhVar.j(), bhVar.p());
        }
    }

    public static mr a(l8 l8Var) {
        byte[] bArr;
        b1.a(l8Var);
        bh bhVar = new bh(16);
        if (a.a(l8Var, bhVar).f25786a != 1380533830) {
            return null;
        }
        l8Var.c(bhVar.c(), 0, 4);
        bhVar.f(0);
        int j2 = bhVar.j();
        if (j2 != 1463899717) {
            pc.b("WavHeaderReader", "Unsupported RIFF format: " + j2);
            return null;
        }
        a a2 = a.a(l8Var, bhVar);
        while (a2.f25786a != 1718449184) {
            l8Var.c((int) a2.f25787b);
            a2 = a.a(l8Var, bhVar);
        }
        b1.b(a2.f25787b >= 16);
        l8Var.c(bhVar.c(), 0, 16);
        bhVar.f(0);
        int r2 = bhVar.r();
        int r3 = bhVar.r();
        int q2 = bhVar.q();
        int q3 = bhVar.q();
        int r4 = bhVar.r();
        int r5 = bhVar.r();
        int i2 = ((int) a2.f25787b) - 16;
        if (i2 > 0) {
            byte[] bArr2 = new byte[i2];
            l8Var.c(bArr2, 0, i2);
            bArr = bArr2;
        } else {
            bArr = xp.f27965f;
        }
        return new mr(r2, r3, q2, q3, r4, r5, bArr);
    }

    public static Pair b(l8 l8Var) {
        b1.a(l8Var);
        l8Var.b();
        bh bhVar = new bh(8);
        a a2 = a.a(l8Var, bhVar);
        while (true) {
            int i2 = a2.f25786a;
            if (i2 == 1684108385) {
                l8Var.a(8);
                long f2 = l8Var.f();
                long j2 = a2.f25787b + f2;
                long a3 = l8Var.a();
                if (a3 != -1 && j2 > a3) {
                    StringBuilder r2 = androidx.compose.foundation.text.input.a.r("Data exceeds input length: ", j2, ", ");
                    r2.append(a3);
                    pc.d("WavHeaderReader", r2.toString());
                    j2 = a3;
                }
                return Pair.create(Long.valueOf(f2), Long.valueOf(j2));
            }
            if (i2 != 1380533830 && i2 != 1718449184) {
                pc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f25786a);
            }
            long j3 = a2.f25787b + 8;
            if (a2.f25786a == 1380533830) {
                j3 = 12;
            }
            if (j3 > 2147483647L) {
                throw dh.a("Chunk is too large (~2GB+) to skip; id: " + a2.f25786a);
            }
            l8Var.a((int) j3);
            a2 = a.a(l8Var, bhVar);
        }
    }
}
