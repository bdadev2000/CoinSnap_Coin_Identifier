package com.applovin.impl;

import androidx.core.app.NotificationCompat;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import kotlin.UByte;

/* loaded from: classes.dex */
public abstract class u8 {

    /* loaded from: classes.dex */
    public static final class a {
        public long a;
    }

    private static boolean a(yg ygVar, y8 y8Var, int i10) {
        int b3 = b(ygVar, i10);
        return b3 != -1 && b3 <= y8Var.f9149b;
    }

    private static boolean b(yg ygVar, y8 y8Var, int i10) {
        int i11 = y8Var.f9152e;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == y8Var.f9153f;
        }
        if (i10 == 12) {
            return ygVar.w() * 1000 == i11;
        }
        if (i10 > 14) {
            return false;
        }
        int C = ygVar.C();
        if (i10 == 14) {
            C *= 10;
        }
        return C == i11;
    }

    private static boolean a(yg ygVar, int i10) {
        return ygVar.w() == yp.b(ygVar.c(), i10, ygVar.d() - 1, 0);
    }

    private static boolean b(int i10, y8 y8Var) {
        return i10 <= 7 ? i10 == y8Var.f9154g - 1 : i10 <= 10 && y8Var.f9154g == 2;
    }

    private static boolean a(yg ygVar, y8 y8Var, boolean z10, a aVar) {
        try {
            long D = ygVar.D();
            if (!z10) {
                D *= y8Var.f9149b;
            }
            aVar.a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static int b(yg ygVar, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
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
                return NotificationCompat.FLAG_LOCAL_ONLY << (i10 - 8);
            default:
                return -1;
        }
    }

    public static boolean a(yg ygVar, y8 y8Var, int i10, a aVar) {
        int d10 = ygVar.d();
        long y4 = ygVar.y();
        long j3 = y4 >>> 16;
        if (j3 != i10) {
            return false;
        }
        return b((int) ((y4 >> 4) & 15), y8Var) && a((int) ((y4 >> 1) & 7), y8Var) && !(((y4 & 1) > 1L ? 1 : ((y4 & 1) == 1L ? 0 : -1)) == 0) && a(ygVar, y8Var, ((j3 & 1) > 1L ? 1 : ((j3 & 1) == 1L ? 0 : -1)) == 0, aVar) && a(ygVar, y8Var, (int) ((y4 >> 12) & 15)) && b(ygVar, y8Var, (int) ((y4 >> 8) & 15)) && a(ygVar, d10);
    }

    private static boolean a(int i10, y8 y8Var) {
        return i10 == 0 || i10 == y8Var.f9156i;
    }

    public static boolean a(j8 j8Var, y8 y8Var, int i10, a aVar) {
        long d10 = j8Var.d();
        byte[] bArr = new byte[2];
        j8Var.c(bArr, 0, 2);
        if ((((bArr[0] & UByte.MAX_VALUE) << 8) | (bArr[1] & UByte.MAX_VALUE)) != i10) {
            j8Var.b();
            j8Var.c((int) (d10 - j8Var.f()));
            return false;
        }
        yg ygVar = new yg(16);
        System.arraycopy(bArr, 0, ygVar.c(), 0, 2);
        ygVar.e(l8.a(j8Var, ygVar.c(), 2, 14));
        j8Var.b();
        j8Var.c((int) (d10 - j8Var.f()));
        return a(ygVar, y8Var, i10, aVar);
    }

    public static long a(j8 j8Var, y8 y8Var) {
        j8Var.b();
        j8Var.c(1);
        byte[] bArr = new byte[1];
        j8Var.c(bArr, 0, 1);
        boolean z10 = (bArr[0] & 1) == 1;
        j8Var.c(2);
        int i10 = z10 ? 7 : 6;
        yg ygVar = new yg(i10);
        ygVar.e(l8.a(j8Var, ygVar.c(), 0, i10));
        j8Var.b();
        a aVar = new a();
        if (a(ygVar, y8Var, z10, aVar)) {
            return aVar.a;
        }
        throw ah.a(null, null);
    }
}
