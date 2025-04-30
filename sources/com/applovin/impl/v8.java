package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.y8;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public abstract class v8 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public y8 f11700a;

        public a(y8 y8Var) {
            this.f11700a = y8Var;
        }
    }

    public static boolean a(j8 j8Var) {
        yg ygVar = new yg(4);
        j8Var.c(ygVar.c(), 0, 4);
        return ygVar.y() == 1716281667;
    }

    public static int b(j8 j8Var) {
        j8Var.b();
        yg ygVar = new yg(2);
        j8Var.c(ygVar.c(), 0, 2);
        int C8 = ygVar.C();
        if ((C8 >> 2) == 16382) {
            j8Var.b();
            return C8;
        }
        j8Var.b();
        throw ah.a("First frame does not start with sync code.", null);
    }

    private static y8 c(j8 j8Var) {
        byte[] bArr = new byte[38];
        j8Var.d(bArr, 0, 38);
        return new y8(bArr, 4);
    }

    public static void d(j8 j8Var) {
        yg ygVar = new yg(4);
        j8Var.d(ygVar.c(), 0, 4);
        if (ygVar.y() == 1716281667) {
        } else {
            throw ah.a("Failed to read FLAC stream marker.", null);
        }
    }

    public static we a(j8 j8Var, boolean z8) {
        we a6 = new va().a(j8Var, z8 ? null : ta.b);
        if (a6 == null || a6.c() == 0) {
            return null;
        }
        return a6;
    }

    private static List c(j8 j8Var, int i9) {
        yg ygVar = new yg(i9);
        j8Var.d(ygVar.c(), 0, i9);
        ygVar.g(4);
        return Arrays.asList(gr.a(ygVar, false, false).b);
    }

    public static boolean a(j8 j8Var, a aVar) {
        j8Var.b();
        xg xgVar = new xg(new byte[4]);
        j8Var.c(xgVar.f12177a, 0, 4);
        boolean f9 = xgVar.f();
        int a6 = xgVar.a(7);
        int a9 = xgVar.a(24) + 4;
        if (a6 == 0) {
            aVar.f11700a = c(j8Var);
        } else {
            y8 y8Var = aVar.f11700a;
            if (y8Var == null) {
                throw new IllegalArgumentException();
            }
            if (a6 == 3) {
                aVar.f11700a = y8Var.a(b(j8Var, a9));
            } else if (a6 == 4) {
                aVar.f11700a = y8Var.b(c(j8Var, a9));
            } else if (a6 == 6) {
                aVar.f11700a = y8Var.a(Collections.singletonList(a(j8Var, a9)));
            } else {
                j8Var.a(a9);
            }
        }
        return f9;
    }

    public static we b(j8 j8Var, boolean z8) {
        j8Var.b();
        long d2 = j8Var.d();
        we a6 = a(j8Var, z8);
        j8Var.a((int) (j8Var.d() - d2));
        return a6;
    }

    private static y8.a b(j8 j8Var, int i9) {
        yg ygVar = new yg(i9);
        j8Var.d(ygVar.c(), 0, i9);
        return a(ygVar);
    }

    public static y8.a a(yg ygVar) {
        ygVar.g(1);
        int z8 = ygVar.z();
        long d2 = ygVar.d() + z8;
        int i9 = z8 / 18;
        long[] jArr = new long[i9];
        long[] jArr2 = new long[i9];
        int i10 = 0;
        while (true) {
            if (i10 >= i9) {
                break;
            }
            long s5 = ygVar.s();
            if (s5 == -1) {
                jArr = Arrays.copyOf(jArr, i10);
                jArr2 = Arrays.copyOf(jArr2, i10);
                break;
            }
            jArr[i10] = s5;
            jArr2[i10] = ygVar.s();
            ygVar.g(2);
            i10++;
        }
        ygVar.g((int) (d2 - ygVar.d()));
        return new y8.a(jArr, jArr2);
    }

    private static ih a(j8 j8Var, int i9) {
        yg ygVar = new yg(i9);
        j8Var.d(ygVar.c(), 0, i9);
        ygVar.g(4);
        int j7 = ygVar.j();
        String a6 = ygVar.a(ygVar.j(), Charsets.US_ASCII);
        String c9 = ygVar.c(ygVar.j());
        int j9 = ygVar.j();
        int j10 = ygVar.j();
        int j11 = ygVar.j();
        int j12 = ygVar.j();
        int j13 = ygVar.j();
        byte[] bArr = new byte[j13];
        ygVar.a(bArr, 0, j13);
        return new ih(j7, a6, c9, j9, j10, j11, j12, bArr);
    }
}
