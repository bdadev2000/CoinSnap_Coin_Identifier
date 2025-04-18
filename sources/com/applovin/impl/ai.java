package com.applovin.impl;

import com.applovin.impl.zh;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
abstract class ai {
    private static int a(int i10) {
        return (-(i10 & 1)) ^ (i10 >> 1);
    }

    private static zh.a b(yg ygVar) {
        int j3 = ygVar.j();
        if (j3 > 10000) {
            return null;
        }
        float[] fArr = new float[j3];
        for (int i10 = 0; i10 < j3; i10++) {
            fArr[i10] = ygVar.i();
        }
        int j10 = ygVar.j();
        if (j10 > 32000) {
            return null;
        }
        double d10 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(j3 * 2.0d) / log);
        xg xgVar = new xg(ygVar.c());
        int i11 = 8;
        xgVar.c(ygVar.d() * 8);
        float[] fArr2 = new float[j10 * 5];
        int i12 = 5;
        int[] iArr = new int[5];
        int i13 = 0;
        int i14 = 0;
        while (i13 < j10) {
            int i15 = 0;
            while (i15 < i12) {
                int a = iArr[i15] + a(xgVar.a(ceil));
                if (a >= j3 || a < 0) {
                    return null;
                }
                fArr2[i14] = fArr[a];
                iArr[i15] = a;
                i15++;
                i14++;
                i12 = 5;
            }
            i13++;
            i12 = 5;
        }
        xgVar.c((xgVar.e() + 7) & (-8));
        int i16 = 32;
        int a10 = xgVar.a(32);
        zh.b[] bVarArr = new zh.b[a10];
        int i17 = 0;
        while (i17 < a10) {
            int a11 = xgVar.a(i11);
            int a12 = xgVar.a(i11);
            int a13 = xgVar.a(i16);
            if (a13 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(j10 * d10) / log);
            float[] fArr3 = new float[a13 * 3];
            float[] fArr4 = new float[a13 * 2];
            int i18 = 0;
            for (int i19 = 0; i19 < a13; i19++) {
                i18 += a(xgVar.a(ceil2));
                if (i18 < 0 || i18 >= j10) {
                    return null;
                }
                int i20 = i19 * 3;
                int i21 = i18 * 5;
                fArr3[i20] = fArr2[i21];
                fArr3[i20 + 1] = fArr2[i21 + 1];
                fArr3[i20 + 2] = fArr2[i21 + 2];
                int i22 = i19 * 2;
                fArr4[i22] = fArr2[i21 + 3];
                fArr4[i22 + 1] = fArr2[i21 + 4];
            }
            bVarArr[i17] = new zh.b(a11, fArr3, fArr4, a12);
            i17++;
            i16 = 32;
            d10 = 2.0d;
            i11 = 8;
        }
        return new zh.a(bVarArr);
    }

    private static ArrayList c(yg ygVar) {
        if (ygVar.w() != 0) {
            return null;
        }
        ygVar.g(7);
        int j3 = ygVar.j();
        if (j3 == 1684433976) {
            yg ygVar2 = new yg();
            Inflater inflater = new Inflater(true);
            try {
                if (!yp.a(ygVar, ygVar2, inflater)) {
                    return null;
                }
                inflater.end();
                ygVar = ygVar2;
            } finally {
                inflater.end();
            }
        } else if (j3 != 1918990112) {
            return null;
        }
        return e(ygVar);
    }

    private static ArrayList d(yg ygVar) {
        int j3;
        ygVar.g(8);
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        while (d10 < e2 && (j3 = ygVar.j() + d10) > d10 && j3 <= e2) {
            int j10 = ygVar.j();
            if (j10 != 2037673328 && j10 != 1836279920) {
                ygVar.f(j3);
                d10 = j3;
            } else {
                ygVar.e(j3);
                return c(ygVar);
            }
        }
        return null;
    }

    private static ArrayList e(yg ygVar) {
        ArrayList arrayList = new ArrayList();
        int d10 = ygVar.d();
        int e2 = ygVar.e();
        while (d10 < e2) {
            int j3 = ygVar.j() + d10;
            if (j3 <= d10 || j3 > e2) {
                return null;
            }
            if (ygVar.j() == 1835365224) {
                zh.a b3 = b(ygVar);
                if (b3 == null) {
                    return null;
                }
                arrayList.add(b3);
            }
            ygVar.f(j3);
            d10 = j3;
        }
        return arrayList;
    }

    private static boolean a(yg ygVar) {
        ygVar.g(4);
        int j3 = ygVar.j();
        ygVar.f(0);
        return j3 == 1886547818;
    }

    public static zh a(byte[] bArr, int i10) {
        ArrayList arrayList;
        yg ygVar = new yg(bArr);
        try {
            arrayList = a(ygVar) ? d(ygVar) : c(ygVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new zh((zh.a) arrayList.get(0), i10);
        }
        if (size != 2) {
            return null;
        }
        return new zh((zh.a) arrayList.get(0), (zh.a) arrayList.get(1), i10);
    }
}
