package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public abstract class oc extends wo {

    /* renamed from: c, reason: collision with root package name */
    private a f6468c;

    /* loaded from: classes.dex */
    public static final class a {
        private final int a;

        /* renamed from: b, reason: collision with root package name */
        private final String[] f6469b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f6470c;

        /* renamed from: d, reason: collision with root package name */
        private final qo[] f6471d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f6472e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f6473f;

        /* renamed from: g, reason: collision with root package name */
        private final qo f6474g;

        public a(String[] strArr, int[] iArr, qo[] qoVarArr, int[] iArr2, int[][][] iArr3, qo qoVar) {
            this.f6469b = strArr;
            this.f6470c = iArr;
            this.f6471d = qoVarArr;
            this.f6473f = iArr3;
            this.f6472e = iArr2;
            this.f6474g = qoVar;
            this.a = iArr.length;
        }

        public int a() {
            return this.a;
        }

        public qo b(int i10) {
            return this.f6471d[i10];
        }

        public int a(int i10) {
            return this.f6470c[i10];
        }
    }

    private static int a(mi[] miVarArr, po poVar, int[] iArr, boolean z10) {
        int length = miVarArr.length;
        int i10 = 0;
        boolean z11 = true;
        for (int i11 = 0; i11 < miVarArr.length; i11++) {
            mi miVar = miVarArr[i11];
            int i12 = 0;
            for (int i13 = 0; i13 < poVar.a; i13++) {
                i12 = Math.max(i12, mi.d(miVar.a(poVar.a(i13))));
            }
            boolean z12 = iArr[i11] == 0;
            if (i12 > i10 || (i12 == i10 && z10 && !z11 && z12)) {
                length = i11;
                z11 = z12;
                i10 = i12;
            }
        }
        return length;
    }

    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar);

    private static int[] a(mi miVar, po poVar) {
        int[] iArr = new int[poVar.a];
        for (int i10 = 0; i10 < poVar.a; i10++) {
            iArr[i10] = miVar.a(poVar.a(i10));
        }
        return iArr;
    }

    private static int[] a(mi[] miVarArr) {
        int length = miVarArr.length;
        int[] iArr = new int[length];
        for (int i10 = 0; i10 < length; i10++) {
            iArr[i10] = miVarArr[i10].m();
        }
        return iArr;
    }

    @Override // com.applovin.impl.wo
    public final void a(Object obj) {
        this.f6468c = (a) obj;
    }

    @Override // com.applovin.impl.wo
    public final xo a(mi[] miVarArr, qo qoVar, wd.a aVar, go goVar) {
        int[] a10;
        int[] iArr = new int[miVarArr.length + 1];
        int length = miVarArr.length + 1;
        po[][] poVarArr = new po[length];
        int[][][] iArr2 = new int[miVarArr.length + 1][];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = qoVar.a;
            poVarArr[i10] = new po[i11];
            iArr2[i10] = new int[i11];
        }
        int[] a11 = a(miVarArr);
        for (int i12 = 0; i12 < qoVar.a; i12++) {
            po a12 = qoVar.a(i12);
            int a13 = a(miVarArr, a12, iArr, df.e(a12.a(0).f4228m) == 5);
            if (a13 == miVarArr.length) {
                a10 = new int[a12.a];
            } else {
                a10 = a(miVarArr[a13], a12);
            }
            int i13 = iArr[a13];
            poVarArr[a13][i13] = a12;
            iArr2[a13][i13] = a10;
            iArr[a13] = i13 + 1;
        }
        qo[] qoVarArr = new qo[miVarArr.length];
        String[] strArr = new String[miVarArr.length];
        int[] iArr3 = new int[miVarArr.length];
        for (int i14 = 0; i14 < miVarArr.length; i14++) {
            int i15 = iArr[i14];
            qoVarArr[i14] = new qo((po[]) yp.a(poVarArr[i14], i15));
            iArr2[i14] = (int[][]) yp.a(iArr2[i14], i15);
            strArr[i14] = miVarArr[i14].getName();
            iArr3[i14] = miVarArr[i14].e();
        }
        a aVar2 = new a(strArr, iArr3, qoVarArr, a11, iArr2, new qo((po[]) yp.a(poVarArr[miVarArr.length], iArr[miVarArr.length])));
        Pair a14 = a(aVar2, iArr2, a11, aVar, goVar);
        return new xo((ni[]) a14.first, (f8[]) a14.second, aVar2);
    }
}
