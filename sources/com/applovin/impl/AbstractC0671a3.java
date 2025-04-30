package com.applovin.impl;

/* renamed from: com.applovin.impl.a3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0671a3 {
    public static void a(long j7, yg ygVar, ro[] roVarArr) {
        while (true) {
            if (ygVar.a() <= 1) {
                return;
            }
            int a6 = a(ygVar);
            int a9 = a(ygVar);
            int d2 = ygVar.d() + a9;
            if (a9 == -1 || a9 > ygVar.a()) {
                kc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d2 = ygVar.e();
            } else if (a6 == 4 && a9 >= 8) {
                int w2 = ygVar.w();
                int C8 = ygVar.C();
                int j9 = C8 == 49 ? ygVar.j() : 0;
                int w9 = ygVar.w();
                if (C8 == 47) {
                    ygVar.g(1);
                }
                boolean z8 = w2 == 181 && (C8 == 49 || C8 == 47) && w9 == 3;
                if (C8 == 49) {
                    z8 &= j9 == 1195456820;
                }
                if (z8) {
                    b(j7, ygVar, roVarArr);
                }
            }
            ygVar.f(d2);
        }
    }

    public static void b(long j7, yg ygVar, ro[] roVarArr) {
        int w2 = ygVar.w();
        if ((w2 & 64) != 0) {
            ygVar.g(1);
            int i9 = (w2 & 31) * 3;
            int d2 = ygVar.d();
            for (ro roVar : roVarArr) {
                ygVar.f(d2);
                roVar.a(ygVar, i9);
                if (j7 != com.mbridge.msdk.playercommon.exoplayer2.C.TIME_UNSET) {
                    roVar.a(j7, 1, i9, 0, null);
                }
            }
        }
    }

    private static int a(yg ygVar) {
        int i9 = 0;
        while (ygVar.a() != 0) {
            int w2 = ygVar.w();
            i9 += w2;
            if (w2 != 255) {
                return i9;
            }
        }
        return -1;
    }
}
