package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;

/* loaded from: classes.dex */
public abstract class u8 {

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public long f11576a;
    }

    private static boolean a(yg ygVar, y8 y8Var, int i9) {
        int b = b(ygVar, i9);
        return b != -1 && b <= y8Var.b;
    }

    private static boolean b(yg ygVar, y8 y8Var, int i9) {
        int i10 = y8Var.f12355e;
        if (i9 == 0) {
            return true;
        }
        if (i9 <= 11) {
            return i9 == y8Var.f12356f;
        }
        if (i9 == 12) {
            return ygVar.w() * 1000 == i10;
        }
        if (i9 > 14) {
            return false;
        }
        int C8 = ygVar.C();
        if (i9 == 14) {
            C8 *= 10;
        }
        return C8 == i10;
    }

    private static boolean a(yg ygVar, int i9) {
        return ygVar.w() == yp.b(ygVar.c(), i9, ygVar.d() - 1, 0);
    }

    private static boolean b(int i9, y8 y8Var) {
        return i9 <= 7 ? i9 == y8Var.f12357g - 1 : i9 <= 10 && y8Var.f12357g == 2;
    }

    private static boolean a(yg ygVar, y8 y8Var, boolean z8, a aVar) {
        try {
            long D8 = ygVar.D();
            if (!z8) {
                D8 *= y8Var.b;
            }
            aVar.f11576a = D8;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(yg ygVar, int i9) {
        switch (i9) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i9 - 2);
            case 6:
                return ygVar.w() + 1;
            case 7:
                return ygVar.C() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return NotificationCompat.FLAG_LOCAL_ONLY << (i9 - 8);
            default:
                return -1;
        }
    }

    public static boolean a(yg ygVar, y8 y8Var, int i9, a aVar) {
        int d2 = ygVar.d();
        long y4 = ygVar.y();
        long j7 = y4 >>> 16;
        if (j7 != i9) {
            return false;
        }
        return b((int) ((y4 >> 4) & 15), y8Var) && a((int) ((y4 >> 1) & 7), y8Var) && !(((y4 & 1) > 1L ? 1 : ((y4 & 1) == 1L ? 0 : -1)) == 0) && a(ygVar, y8Var, ((j7 & 1) > 1L ? 1 : ((j7 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(ygVar, y8Var, (int) ((y4 >> 12) & 15)) && b(ygVar, y8Var, (int) ((y4 >> 8) & 15)) && a(ygVar, d2);
    }

    private static boolean a(int i9, y8 y8Var) {
        return i9 == 0 || i9 == y8Var.f12359i;
    }

    public static boolean a(j8 j8Var, y8 y8Var, int i9, a aVar) {
        long d2 = j8Var.d();
        byte[] bArr = new byte[2];
        j8Var.c(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i9) {
            j8Var.b();
            j8Var.c((int) (d2 - j8Var.f()));
            return false;
        }
        yg ygVar = new yg(16);
        System.arraycopy(bArr, 0, ygVar.c(), 0, 2);
        ygVar.e(l8.a(j8Var, ygVar.c(), 2, 14));
        j8Var.b();
        j8Var.c((int) (d2 - j8Var.f()));
        return a(ygVar, y8Var, i9, aVar);
    }

    public static long a(j8 j8Var, y8 y8Var) {
        j8Var.b();
        j8Var.c(1);
        byte[] bArr = new byte[1];
        j8Var.c(bArr, 0, 1);
        boolean z8 = (bArr[0] & 1) == 1;
        j8Var.c(2);
        int i9 = z8 ? 7 : 6;
        yg ygVar = new yg(i9);
        ygVar.e(l8.a(j8Var, ygVar.c(), 0, i9));
        j8Var.b();
        a aVar = new a();
        if (a(ygVar, y8Var, z8, aVar)) {
            return aVar.f11576a;
        }
        throw ah.a(null, null);
    }
}
