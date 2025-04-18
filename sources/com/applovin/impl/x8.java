package com.applovin.impl;

import com.applovin.exoplayer2.common.base.Charsets;
import com.applovin.impl.a9;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class x8 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public a9 f27867a;

        public a(a9 a9Var) {
            this.f27867a = a9Var;
        }
    }

    public static boolean a(l8 l8Var) {
        bh bhVar = new bh(4);
        l8Var.c(bhVar.c(), 0, 4);
        return bhVar.y() == 1716281667;
    }

    public static int b(l8 l8Var) {
        l8Var.b();
        bh bhVar = new bh(2);
        l8Var.c(bhVar.c(), 0, 2);
        int C = bhVar.C();
        if ((C >> 2) == 16382) {
            l8Var.b();
            return C;
        }
        l8Var.b();
        throw dh.a("First frame does not start with sync code.", null);
    }

    private static a9 c(l8 l8Var) {
        byte[] bArr = new byte[38];
        l8Var.d(bArr, 0, 38);
        return new a9(bArr, 4);
    }

    public static void d(l8 l8Var) {
        bh bhVar = new bh(4);
        l8Var.d(bhVar.c(), 0, 4);
        if (bhVar.y() != 1716281667) {
            throw dh.a("Failed to read FLAC stream marker.", null);
        }
    }

    private static List c(l8 l8Var, int i2) {
        bh bhVar = new bh(i2);
        l8Var.d(bhVar.c(), 0, i2);
        bhVar.g(4);
        return Arrays.asList(fr.a(bhVar, false, false).f24013b);
    }

    public static bf a(l8 l8Var, boolean z2) {
        bf a2 = new za().a(l8Var, z2 ? null : xa.f27869b);
        if (a2 == null || a2.c() == 0) {
            return null;
        }
        return a2;
    }

    public static boolean a(l8 l8Var, a aVar) {
        l8Var.b();
        ah ahVar = new ah(new byte[4]);
        l8Var.c(ahVar.f22849a, 0, 4);
        boolean f2 = ahVar.f();
        int a2 = ahVar.a(7);
        int a3 = ahVar.a(24) + 4;
        if (a2 == 0) {
            aVar.f27867a = c(l8Var);
        } else {
            a9 a9Var = aVar.f27867a;
            if (a9Var == null) {
                throw new IllegalArgumentException();
            }
            if (a2 == 3) {
                aVar.f27867a = a9Var.a(b(l8Var, a3));
            } else if (a2 == 4) {
                aVar.f27867a = a9Var.b(c(l8Var, a3));
            } else if (a2 == 6) {
                aVar.f27867a = a9Var.a(Collections.singletonList(a(l8Var, a3)));
            } else {
                l8Var.a(a3);
            }
        }
        return f2;
    }

    public static bf b(l8 l8Var, boolean z2) {
        l8Var.b();
        long d = l8Var.d();
        bf a2 = a(l8Var, z2);
        l8Var.a((int) (l8Var.d() - d));
        return a2;
    }

    private static a9.a b(l8 l8Var, int i2) {
        bh bhVar = new bh(i2);
        l8Var.d(bhVar.c(), 0, i2);
        return a(bhVar);
    }

    public static a9.a a(bh bhVar) {
        bhVar.g(1);
        int z2 = bhVar.z();
        long d = bhVar.d() + z2;
        int i2 = z2 / 18;
        long[] jArr = new long[i2];
        long[] jArr2 = new long[i2];
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            long s2 = bhVar.s();
            if (s2 == -1) {
                jArr = Arrays.copyOf(jArr, i3);
                jArr2 = Arrays.copyOf(jArr2, i3);
                break;
            }
            jArr[i3] = s2;
            jArr2[i3] = bhVar.s();
            bhVar.g(2);
            i3++;
        }
        bhVar.g((int) (d - bhVar.d()));
        return new a9.a(jArr, jArr2);
    }

    private static lh a(l8 l8Var, int i2) {
        bh bhVar = new bh(i2);
        l8Var.d(bhVar.c(), 0, i2);
        bhVar.g(4);
        int j2 = bhVar.j();
        String a2 = bhVar.a(bhVar.j(), Charsets.US_ASCII);
        String c2 = bhVar.c(bhVar.j());
        int j3 = bhVar.j();
        int j4 = bhVar.j();
        int j5 = bhVar.j();
        int j6 = bhVar.j();
        int j7 = bhVar.j();
        byte[] bArr = new byte[j7];
        bhVar.a(bArr, 0, j7);
        return new lh(j2, a2, c2, j3, j4, j5, j6, bArr);
    }
}
