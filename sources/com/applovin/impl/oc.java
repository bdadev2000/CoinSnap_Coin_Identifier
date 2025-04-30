package com.applovin.impl;

import android.util.Pair;
import com.applovin.impl.wd;

/* loaded from: classes.dex */
public abstract class oc extends wo {

    /* renamed from: c, reason: collision with root package name */
    private a f9403c;

    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final int f9404a;
        private final String[] b;

        /* renamed from: c, reason: collision with root package name */
        private final int[] f9405c;

        /* renamed from: d, reason: collision with root package name */
        private final qo[] f9406d;

        /* renamed from: e, reason: collision with root package name */
        private final int[] f9407e;

        /* renamed from: f, reason: collision with root package name */
        private final int[][][] f9408f;

        /* renamed from: g, reason: collision with root package name */
        private final qo f9409g;

        public a(String[] strArr, int[] iArr, qo[] qoVarArr, int[] iArr2, int[][][] iArr3, qo qoVar) {
            this.b = strArr;
            this.f9405c = iArr;
            this.f9406d = qoVarArr;
            this.f9408f = iArr3;
            this.f9407e = iArr2;
            this.f9409g = qoVar;
            this.f9404a = iArr.length;
        }

        public int a() {
            return this.f9404a;
        }

        public qo b(int i9) {
            return this.f9406d[i9];
        }

        public int a(int i9) {
            return this.f9405c[i9];
        }
    }

    private static int a(mi[] miVarArr, po poVar, int[] iArr, boolean z8) {
        int length = miVarArr.length;
        int i9 = 0;
        boolean z9 = true;
        for (int i10 = 0; i10 < miVarArr.length; i10++) {
            mi miVar = miVarArr[i10];
            int i11 = 0;
            for (int i12 = 0; i12 < poVar.f10058a; i12++) {
                i11 = Math.max(i11, mi.d(miVar.a(poVar.a(i12))));
            }
            boolean z10 = iArr[i10] == 0;
            if (i11 > i9 || (i11 == i9 && z8 && !z9 && z10)) {
                length = i10;
                z9 = z10;
                i9 = i11;
            }
        }
        return length;
    }

    public abstract Pair a(a aVar, int[][][] iArr, int[] iArr2, wd.a aVar2, go goVar);

    private static int[] a(mi miVar, po poVar) {
        int[] iArr = new int[poVar.f10058a];
        for (int i9 = 0; i9 < poVar.f10058a; i9++) {
            iArr[i9] = miVar.a(poVar.a(i9));
        }
        return iArr;
    }

    private static int[] a(mi[] miVarArr) {
        int length = miVarArr.length;
        int[] iArr = new int[length];
        for (int i9 = 0; i9 < length; i9++) {
            iArr[i9] = miVarArr[i9].m();
        }
        return iArr;
    }

    @Override // com.applovin.impl.wo
    public final void a(Object obj) {
        this.f9403c = (a) obj;
    }

    @Override // com.applovin.impl.wo
    public final xo a(mi[] miVarArr, qo qoVar, wd.a aVar, go goVar) {
        int[] a6;
        int[] iArr = new int[miVarArr.length + 1];
        int length = miVarArr.length + 1;
        po[][] poVarArr = new po[length];
        int[][][] iArr2 = new int[miVarArr.length + 1][];
        for (int i9 = 0; i9 < length; i9++) {
            int i10 = qoVar.f10421a;
            poVarArr[i9] = new po[i10];
            iArr2[i9] = new int[i10];
        }
        int[] a9 = a(miVarArr);
        for (int i11 = 0; i11 < qoVar.f10421a; i11++) {
            po a10 = qoVar.a(i11);
            int a11 = a(miVarArr, a10, iArr, df.e(a10.a(0).m) == 5);
            if (a11 == miVarArr.length) {
                a6 = new int[a10.f10058a];
            } else {
                a6 = a(miVarArr[a11], a10);
            }
            int i12 = iArr[a11];
            poVarArr[a11][i12] = a10;
            iArr2[a11][i12] = a6;
            iArr[a11] = i12 + 1;
        }
        qo[] qoVarArr = new qo[miVarArr.length];
        String[] strArr = new String[miVarArr.length];
        int[] iArr3 = new int[miVarArr.length];
        for (int i13 = 0; i13 < miVarArr.length; i13++) {
            int i14 = iArr[i13];
            qoVarArr[i13] = new qo((po[]) yp.a(poVarArr[i13], i14));
            iArr2[i13] = (int[][]) yp.a(iArr2[i13], i14);
            strArr[i13] = miVarArr[i13].getName();
            iArr3[i13] = miVarArr[i13].e();
        }
        a aVar2 = new a(strArr, iArr3, qoVarArr, a9, iArr2, new qo((po[]) yp.a(poVarArr[miVarArr.length], iArr[miVarArr.length])));
        Pair a12 = a(aVar2, iArr2, a9, aVar, goVar);
        return new xo((ni[]) a12.first, (f8[]) a12.second, aVar2);
    }
}
