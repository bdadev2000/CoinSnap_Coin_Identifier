package com.applovin.impl;

import com.google.common.primitives.UnsignedBytes;
import org.objectweb.asm.Opcodes;

/* loaded from: classes2.dex */
public abstract class w8 {

    /* loaded from: classes2.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f27708a;
    }

    private static boolean a(bh bhVar, a9 a9Var, int i2) {
        int b2 = b(bhVar, i2);
        return b2 != -1 && b2 <= a9Var.f22712b;
    }

    private static boolean b(bh bhVar, a9 a9Var, int i2) {
        int i3 = a9Var.e;
        if (i2 == 0) {
            return true;
        }
        if (i2 <= 11) {
            return i2 == a9Var.f22714f;
        }
        if (i2 == 12) {
            return bhVar.w() * 1000 == i3;
        }
        if (i2 > 14) {
            return false;
        }
        int C = bhVar.C();
        if (i2 == 14) {
            C *= 10;
        }
        return C == i3;
    }

    private static boolean a(bh bhVar, int i2) {
        return bhVar.w() == xp.b(bhVar.c(), i2, bhVar.d() - 1, 0);
    }

    private static boolean b(int i2, a9 a9Var) {
        return i2 <= 7 ? i2 == a9Var.f22715g - 1 : i2 <= 10 && a9Var.f22715g == 2;
    }

    private static boolean a(bh bhVar, a9 a9Var, boolean z2, a aVar) {
        try {
            long D = bhVar.D();
            if (!z2) {
                D *= a9Var.f22712b;
            }
            aVar.f27708a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(bh bhVar, int i2) {
        switch (i2) {
            case 1:
                return Opcodes.CHECKCAST;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i2 - 2);
            case 6:
                return bhVar.w() + 1;
            case 7:
                return bhVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i2 - 8);
            default:
                return -1;
        }
    }

    public static boolean a(bh bhVar, a9 a9Var, int i2, a aVar) {
        int d = bhVar.d();
        long y2 = bhVar.y();
        long j2 = y2 >>> 16;
        if (j2 != i2) {
            return false;
        }
        return b((int) ((y2 >> 4) & 15), a9Var) && a((int) ((y2 >> 1) & 7), a9Var) && !(((y2 & 1) > 1L ? 1 : ((y2 & 1) == 1L ? 0 : -1)) == 0) && a(bhVar, a9Var, ((j2 & 1) > 1L ? 1 : ((j2 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(bhVar, a9Var, (int) ((y2 >> 12) & 15)) && b(bhVar, a9Var, (int) ((y2 >> 8) & 15)) && a(bhVar, d);
    }

    private static boolean a(int i2, a9 a9Var) {
        return i2 == 0 || i2 == a9Var.f22717i;
    }

    public static boolean a(l8 l8Var, a9 a9Var, int i2, a aVar) {
        long d = l8Var.d();
        byte[] bArr = new byte[2];
        l8Var.c(bArr, 0, 2);
        if ((((bArr[0] & UnsignedBytes.MAX_VALUE) << 8) | (bArr[1] & UnsignedBytes.MAX_VALUE)) != i2) {
            l8Var.b();
            l8Var.c((int) (d - l8Var.f()));
            return false;
        }
        bh bhVar = new bh(16);
        System.arraycopy(bArr, 0, bhVar.c(), 0, 2);
        bhVar.e(n8.a(l8Var, bhVar.c(), 2, 14));
        l8Var.b();
        l8Var.c((int) (d - l8Var.f()));
        return a(bhVar, a9Var, i2, aVar);
    }

    public static long a(l8 l8Var, a9 a9Var) {
        l8Var.b();
        l8Var.c(1);
        byte[] bArr = new byte[1];
        l8Var.c(bArr, 0, 1);
        boolean z2 = (bArr[0] & 1) == 1;
        l8Var.c(2);
        int i2 = z2 ? 7 : 6;
        bh bhVar = new bh(i2);
        bhVar.e(n8.a(l8Var, bhVar.c(), 0, i2));
        l8Var.b();
        a aVar = new a();
        if (a(bhVar, a9Var, z2, aVar)) {
            return aVar.f27708a;
        }
        throw dh.a(null, null);
    }
}
