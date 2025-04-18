package com.applovin.impl;

import com.applovin.impl.ci;
import java.util.ArrayList;
import java.util.zip.Inflater;

/* loaded from: classes3.dex */
abstract class di {
    private static int a(int i2) {
        return (-(i2 & 1)) ^ (i2 >> 1);
    }

    private static ci.a b(bh bhVar) {
        int j2 = bhVar.j();
        if (j2 > 10000) {
            return null;
        }
        float[] fArr = new float[j2];
        for (int i2 = 0; i2 < j2; i2++) {
            fArr[i2] = bhVar.i();
        }
        int j3 = bhVar.j();
        if (j3 > 32000) {
            return null;
        }
        double d = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(j2 * 2.0d) / log);
        ah ahVar = new ah(bhVar.c());
        int i3 = 8;
        ahVar.c(bhVar.d() * 8);
        float[] fArr2 = new float[j3 * 5];
        int i4 = 5;
        int[] iArr = new int[5];
        int i5 = 0;
        int i6 = 0;
        while (i5 < j3) {
            int i7 = 0;
            while (i7 < i4) {
                int a2 = iArr[i7] + a(ahVar.a(ceil));
                if (a2 >= j2 || a2 < 0) {
                    return null;
                }
                fArr2[i6] = fArr[a2];
                iArr[i7] = a2;
                i7++;
                i6++;
                i4 = 5;
            }
            i5++;
            i4 = 5;
        }
        ahVar.c((ahVar.e() + 7) & (-8));
        int i8 = 32;
        int a3 = ahVar.a(32);
        ci.b[] bVarArr = new ci.b[a3];
        int i9 = 0;
        while (i9 < a3) {
            int a4 = ahVar.a(i3);
            int a5 = ahVar.a(i3);
            int a6 = ahVar.a(i8);
            if (a6 > 128000) {
                return null;
            }
            int ceil2 = (int) Math.ceil(Math.log(j3 * d) / log);
            float[] fArr3 = new float[a6 * 3];
            float[] fArr4 = new float[a6 * 2];
            int i10 = 0;
            for (int i11 = 0; i11 < a6; i11++) {
                i10 += a(ahVar.a(ceil2));
                if (i10 < 0 || i10 >= j3) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = i10 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            bVarArr[i9] = new ci.b(a4, fArr3, fArr4, a5);
            i9++;
            i8 = 32;
            d = 2.0d;
            i3 = 8;
        }
        return new ci.a(bVarArr);
    }

    private static ArrayList c(bh bhVar) {
        if (bhVar.w() != 0) {
            return null;
        }
        bhVar.g(7);
        int j2 = bhVar.j();
        if (j2 == 1684433976) {
            bh bhVar2 = new bh();
            Inflater inflater = new Inflater(true);
            try {
                if (!xp.a(bhVar, bhVar2, inflater)) {
                    return null;
                }
                inflater.end();
                bhVar = bhVar2;
            } finally {
                inflater.end();
            }
        } else if (j2 != 1918990112) {
            return null;
        }
        return e(bhVar);
    }

    private static ArrayList d(bh bhVar) {
        int j2;
        bhVar.g(8);
        int d = bhVar.d();
        int e = bhVar.e();
        while (d < e && (j2 = bhVar.j() + d) > d && j2 <= e) {
            int j3 = bhVar.j();
            if (j3 == 2037673328 || j3 == 1836279920) {
                bhVar.e(j2);
                return c(bhVar);
            }
            bhVar.f(j2);
            d = j2;
        }
        return null;
    }

    private static ArrayList e(bh bhVar) {
        ArrayList arrayList = new ArrayList();
        int d = bhVar.d();
        int e = bhVar.e();
        while (d < e) {
            int j2 = bhVar.j() + d;
            if (j2 <= d || j2 > e) {
                return null;
            }
            if (bhVar.j() == 1835365224) {
                ci.a b2 = b(bhVar);
                if (b2 == null) {
                    return null;
                }
                arrayList.add(b2);
            }
            bhVar.f(j2);
            d = j2;
        }
        return arrayList;
    }

    private static boolean a(bh bhVar) {
        bhVar.g(4);
        int j2 = bhVar.j();
        bhVar.f(0);
        return j2 == 1886547818;
    }

    public static ci a(byte[] bArr, int i2) {
        ArrayList arrayList;
        bh bhVar = new bh(bArr);
        try {
            arrayList = a(bhVar) ? d(bhVar) : c(bhVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new ci((ci.a) arrayList.get(0), i2);
        }
        if (size != 2) {
            return null;
        }
        return new ci((ci.a) arrayList.get(0), (ci.a) arrayList.get(1), i2);
    }
}
