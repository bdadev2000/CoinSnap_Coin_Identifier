package com.applovin.impl;

/* loaded from: classes3.dex */
public abstract class c3 {
    public static void a(long j2, bh bhVar, qo[] qoVarArr) {
        while (true) {
            if (bhVar.a() <= 1) {
                return;
            }
            int a2 = a(bhVar);
            int a3 = a(bhVar);
            int d = bhVar.d() + a3;
            if (a3 == -1 || a3 > bhVar.a()) {
                pc.d("CeaUtil", "Skipping remainder of malformed SEI NAL unit.");
                d = bhVar.e();
            } else if (a2 == 4 && a3 >= 8) {
                int w = bhVar.w();
                int C = bhVar.C();
                int j3 = C == 49 ? bhVar.j() : 0;
                int w2 = bhVar.w();
                if (C == 47) {
                    bhVar.g(1);
                }
                boolean z2 = w == 181 && (C == 49 || C == 47) && w2 == 3;
                if (C == 49) {
                    z2 &= j3 == 1195456820;
                }
                if (z2) {
                    b(j2, bhVar, qoVarArr);
                }
            }
            bhVar.f(d);
        }
    }

    public static void b(long j2, bh bhVar, qo[] qoVarArr) {
        int w = bhVar.w();
        if ((w & 64) != 0) {
            bhVar.g(1);
            int i2 = (w & 31) * 3;
            int d = bhVar.d();
            for (qo qoVar : qoVarArr) {
                bhVar.f(d);
                qoVar.a(bhVar, i2);
                if (j2 != -9223372036854775807L) {
                    qoVar.a(j2, 1, i2, 0, null);
                }
            }
        }
    }

    private static int a(bh bhVar) {
        int i2 = 0;
        while (bhVar.a() != 0) {
            int w = bhVar.w();
            i2 += w;
            if (w != 255) {
                return i2;
            }
        }
        return -1;
    }
}
