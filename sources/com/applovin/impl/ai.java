package com.applovin.impl;

import com.applovin.impl.zh;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes.dex */
abstract class ai {
    private static int a(int i9) {
        return (-(i9 & 1)) ^ (i9 >> 1);
    }

    private static zh.a b(yg ygVar) {
        int j7 = ygVar.j();
        if (j7 > 10000) {
            return null;
        }
        float[] fArr = new float[j7];
        for (int i9 = 0; i9 < j7; i9++) {
            fArr[i9] = ygVar.i();
        }
        int j9 = ygVar.j();
        if (j9 > 32000) {
            return null;
        }
        double d2 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(j7 * 2.0d) / log);
        xg xgVar = new xg(ygVar.c());
        int i10 = 8;
        xgVar.c(ygVar.d() * 8);
        float[] fArr2 = new float[j9 * 5];
        int i11 = 5;
        int[] iArr = new int[5];
        int i12 = 0;
        int i13 = 0;
        while (i12 < j9) {
            int i14 = 0;
            while (i14 < i11) {
                int a6 = iArr[i14] + a(xgVar.a(ceil));
                if (a6 >= j7 || a6 < 0) {
                    return null;
                }
                fArr2[i13] = fArr[a6];
                iArr[i14] = a6;
                i14++;
                i13++;
                i11 = 5;
            }
            i12++;
            i11 = 5;
        }
        xgVar.c((xgVar.e() + 7) & (-8));
        int i15 = 32;
        int a9 = xgVar.a(32);
        zh.b[] bVarArr = new zh.b[a9];
        int i16 = 0;
        while (i16 < a9) {
            int a10 = xgVar.a(i10);
            int a11 = xgVar.a(i10);
            int a12 = xgVar.a(i15);
            if (a12 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(j9 * d2) / log);
            float[] fArr3 = new float[a12 * 3];
            float[] fArr4 = new float[a12 * 2];
            int i17 = 0;
            for (int i18 = 0; i18 < a12; i18++) {
                i17 += a(xgVar.a(ceil2));
                if (i17 < 0 || i17 >= j9) {
                    return null;
                }
                int i19 = i18 * 3;
                int i20 = i17 * 5;
                fArr3[i19] = fArr2[i20];
                fArr3[i19 + 1] = fArr2[i20 + 1];
                fArr3[i19 + 2] = fArr2[i20 + 2];
                int i21 = i18 * 2;
                fArr4[i21] = fArr2[i20 + 3];
                fArr4[i21 + 1] = fArr2[i20 + 4];
            }
            bVarArr[i16] = new zh.b(a10, fArr3, fArr4, a11);
            i16++;
            i15 = 32;
            d2 = 2.0d;
            i10 = 8;
        }
        return new zh.a(bVarArr);
    }

    private static ArrayList c(yg ygVar) {
        if (ygVar.w() != 0) {
            return null;
        }
        ygVar.g(7);
        int j7 = ygVar.j();
        if (j7 == 1684433976) {
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
        } else if (j7 != 1918990112) {
            return null;
        }
        return e(ygVar);
    }

    private static ArrayList d(yg ygVar) {
        int j7;
        ygVar.g(8);
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        while (d2 < e4 && (j7 = ygVar.j() + d2) > d2 && j7 <= e4) {
            int j9 = ygVar.j();
            if (j9 != 2037673328 && j9 != 1836279920) {
                ygVar.f(j7);
                d2 = j7;
            } else {
                ygVar.e(j7);
                return c(ygVar);
            }
        }
        return null;
    }

    private static ArrayList e(yg ygVar) {
        ArrayList arrayList = new ArrayList();
        int d2 = ygVar.d();
        int e4 = ygVar.e();
        while (d2 < e4) {
            int j7 = ygVar.j() + d2;
            if (j7 <= d2 || j7 > e4) {
                return null;
            }
            if (ygVar.j() == 1835365224) {
                zh.a b = b(ygVar);
                if (b == null) {
                    return null;
                }
                arrayList.add(b);
            }
            ygVar.f(j7);
            d2 = j7;
        }
        return arrayList;
    }

    private static boolean a(yg ygVar) {
        ygVar.g(4);
        int j7 = ygVar.j();
        ygVar.f(0);
        return j7 == 1886547818;
    }

    public static zh a(byte[] bArr, int i9) {
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
            return new zh((zh.a) arrayList.get(0), i9);
        }
        if (size != 2) {
            return null;
        }
        return new zh((zh.a) arrayList.get(0), (zh.a) arrayList.get(1), i9);
    }
}
