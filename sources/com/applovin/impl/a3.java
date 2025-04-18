package com.applovin.impl;

import com.mbridge.msdk.playercommon.exoplayer2.C;

/* loaded from: classes.dex */
public abstract class a3 {
    public static void a(long j3, yg ygVar, ro[] roVarArr) {
        while (true) {
            if (ygVar.a() <= 1) {
                return;
            }
            int a = a(ygVar);
            int a10 = a(ygVar);
            int d10 = ygVar.d() + a10;
            if (a10 == -1 || a10 > ygVar.a()) {
                kc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d10 = ygVar.e();
            } else if (a == 4 && a10 >= 8) {
                int w10 = ygVar.w();
                int C = ygVar.C();
                int j10 = C == 49 ? ygVar.j() : 0;
                int w11 = ygVar.w();
                if (C == 47) {
                    ygVar.g(1);
                }
                boolean z10 = w10 == 181 && (C == 49 || C == 47) && w11 == 3;
                if (C == 49) {
                    z10 &= j10 == 1195456820;
                }
                if (z10) {
                    b(j3, ygVar, roVarArr);
                }
            }
            ygVar.f(d10);
        }
    }

    public static void b(long j3, yg ygVar, ro[] roVarArr) {
        int w10 = ygVar.w();
        if ((w10 & 64) != 0) {
            ygVar.g(1);
            int i10 = (w10 & 31) * 3;
            int d10 = ygVar.d();
            for (ro roVar : roVarArr) {
                ygVar.f(d10);
                roVar.a(ygVar, i10);
                if (j3 != C.TIME_UNSET) {
                    roVar.a(j3, 1, i10, 0, null);
                }
            }
        }
    }

    private static int a(yg ygVar) {
        int i10 = 0;
        while (ygVar.a() != 0) {
            int w10 = ygVar.w();
            i10 += w10;
            if (w10 != 255) {
                return i10;
            }
        }
        return -1;
    }
}
