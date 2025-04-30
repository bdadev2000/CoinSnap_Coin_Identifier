package com.applovin.impl;

import android.util.Pair;
import y.AbstractC2933a;

/* loaded from: classes.dex */
abstract class or {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f9961a;
        public final long b;

        private a(int i9, long j7) {
            this.f9961a = i9;
            this.b = j7;
        }

        public static a a(j8 j8Var, yg ygVar) {
            j8Var.c(ygVar.c(), 0, 8);
            ygVar.f(0);
            return new a(ygVar.j(), ygVar.p());
        }
    }

    public static nr a(j8 j8Var) {
        boolean z8;
        byte[] bArr;
        AbstractC0669a1.a(j8Var);
        yg ygVar = new yg(16);
        if (a.a(j8Var, ygVar).f9961a != 1380533830) {
            return null;
        }
        j8Var.c(ygVar.c(), 0, 4);
        ygVar.f(0);
        int j7 = ygVar.j();
        if (j7 != 1463899717) {
            kc.b("WavHeaderReader", "Unsupported RIFF format: " + j7);
            return null;
        }
        a a6 = a.a(j8Var, ygVar);
        while (a6.f9961a != 1718449184) {
            j8Var.c((int) a6.b);
            a6 = a.a(j8Var, ygVar);
        }
        if (a6.b >= 16) {
            z8 = true;
        } else {
            z8 = false;
        }
        AbstractC0669a1.b(z8);
        j8Var.c(ygVar.c(), 0, 16);
        ygVar.f(0);
        int r9 = ygVar.r();
        int r10 = ygVar.r();
        int q9 = ygVar.q();
        int q10 = ygVar.q();
        int r11 = ygVar.r();
        int r12 = ygVar.r();
        int i9 = ((int) a6.b) - 16;
        if (i9 > 0) {
            byte[] bArr2 = new byte[i9];
            j8Var.c(bArr2, 0, i9);
            bArr = bArr2;
        } else {
            bArr = yp.f12455f;
        }
        return new nr(r9, r10, q9, q10, r11, r12, bArr);
    }

    public static Pair b(j8 j8Var) {
        AbstractC0669a1.a(j8Var);
        j8Var.b();
        yg ygVar = new yg(8);
        a a6 = a.a(j8Var, ygVar);
        while (true) {
            int i9 = a6.f9961a;
            if (i9 != 1684108385) {
                if (i9 != 1380533830 && i9 != 1718449184) {
                    kc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a6.f9961a);
                }
                long j7 = a6.b + 8;
                if (a6.f9961a == 1380533830) {
                    j7 = 12;
                }
                if (j7 <= 2147483647L) {
                    j8Var.a((int) j7);
                    a6 = a.a(j8Var, ygVar);
                } else {
                    throw ah.a("Chunk is too large (~2GB+) to skip; id: " + a6.f9961a);
                }
            } else {
                j8Var.a(8);
                long f9 = j8Var.f();
                long j9 = a6.b + f9;
                long a9 = j8Var.a();
                if (a9 != -1 && j9 > a9) {
                    StringBuilder a10 = AbstractC2933a.a("Data exceeds input length: ", j9, ", ");
                    a10.append(a9);
                    kc.d("WavHeaderReader", a10.toString());
                    j9 = a9;
                }
                return Pair.create(Long.valueOf(f9), Long.valueOf(j9));
            }
        }
    }
}
