package com.applovin.impl;

import android.util.Pair;

/* loaded from: classes.dex */
abstract class or {

    /* loaded from: classes.dex */
    public static final class a {
        public final int a;

        /* renamed from: b, reason: collision with root package name */
        public final long f6875b;

        private a(int i10, long j3) {
            this.a = i10;
            this.f6875b = j3;
        }

        public static a a(j8 j8Var, yg ygVar) {
            j8Var.c(ygVar.c(), 0, 8);
            ygVar.f(0);
            return new a(ygVar.j(), ygVar.p());
        }
    }

    public static nr a(j8 j8Var) {
        boolean z10;
        byte[] bArr;
        a1.a(j8Var);
        yg ygVar = new yg(16);
        if (a.a(j8Var, ygVar).a != 1380533830) {
            return null;
        }
        j8Var.c(ygVar.c(), 0, 4);
        ygVar.f(0);
        int j3 = ygVar.j();
        if (j3 != 1463899717) {
            kc.b("WavHeaderReader", "Unsupported RIFF format: " + j3);
            return null;
        }
        a a10 = a.a(j8Var, ygVar);
        while (a10.a != 1718449184) {
            j8Var.c((int) a10.f6875b);
            a10 = a.a(j8Var, ygVar);
        }
        if (a10.f6875b >= 16) {
            z10 = true;
        } else {
            z10 = false;
        }
        a1.b(z10);
        j8Var.c(ygVar.c(), 0, 16);
        ygVar.f(0);
        int r6 = ygVar.r();
        int r10 = ygVar.r();
        int q10 = ygVar.q();
        int q11 = ygVar.q();
        int r11 = ygVar.r();
        int r12 = ygVar.r();
        int i10 = ((int) a10.f6875b) - 16;
        if (i10 > 0) {
            byte[] bArr2 = new byte[i10];
            j8Var.c(bArr2, 0, i10);
            bArr = bArr2;
        } else {
            bArr = yp.f9257f;
        }
        return new nr(r6, r10, q10, q11, r11, r12, bArr);
    }

    public static Pair b(j8 j8Var) {
        a1.a(j8Var);
        j8Var.b();
        yg ygVar = new yg(8);
        a a10 = a.a(j8Var, ygVar);
        while (true) {
            int i10 = a10.a;
            if (i10 != 1684108385) {
                if (i10 != 1380533830 && i10 != 1718449184) {
                    kc.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a10.a);
                }
                long j3 = a10.f6875b + 8;
                if (a10.a == 1380533830) {
                    j3 = 12;
                }
                if (j3 <= 2147483647L) {
                    j8Var.a((int) j3);
                    a10 = a.a(j8Var, ygVar);
                } else {
                    throw ah.a("Chunk is too large (~2GB+) to skip; id: " + a10.a);
                }
            } else {
                j8Var.a(8);
                long f10 = j8Var.f();
                long j10 = a10.f6875b + f10;
                long a11 = j8Var.a();
                if (a11 != -1 && j10 > a11) {
                    StringBuilder o10 = kotlin.reflect.jvm.internal.impl.serialization.deserialization.a.o("Data exceeds input length: ", j10, ", ");
                    o10.append(a11);
                    kc.d("WavHeaderReader", o10.toString());
                    j10 = a11;
                }
                return Pair.create(Long.valueOf(f10), Long.valueOf(j10));
            }
        }
    }
}
